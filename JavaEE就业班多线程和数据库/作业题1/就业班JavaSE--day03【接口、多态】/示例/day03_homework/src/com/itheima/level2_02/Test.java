package com.itheima.level2_02;

/*
��ʹ�ô�������:  
	���е�ѧ���������������,����Է�(ѧ����)��ѧϰ,�����в���ѧ���������
	���е���ʦ�������������,����Է�(������)�ͽ���,���в�����ʦ�������
	ȥ������,����������ʦ��ѧ������. (��ʾͨ���ڲ������еľ�̬����ʵ��)
	ȥʳ�óԷ�,�����˶�����ȥ(��ʾͨ���ڲ������еľ�̬����ʵ��) 
 
1.�����������(Person)
	a)����: ����(name),����(age)
	b)���󷽷�: eat()
	c)�ṩ:�޲�,�вι��췽����setters��getters����
2.�����˶��ӿ�(Sport)
	a)���󷽷�: playBasketball
3.������ʦ��(Teacher)�̳�Person��
	a) ��Ա����:: ʵ�ֳ��󷽷�eat()
		i.�����ʽ: ����Ϊ30����������ʦ,���ڳԹ�����
	b)�ṩ: �޲�,�вι��췽��

4.�����˶���ʦ��(SportTeacher)�̳���ʦ��(Teacher)ʵ���˶��ӿ�
	a)��Ա����: ʵ��playBasketball�ĳ��󷽷�
		i.�����ʽ: ����Ϊ30�� ������ ��ʦ�ڴ�����
	b)�ṩ: �޲�,�вι��췽��
5.����ѧ����(Student),�̳�����(Person)
	a)��Ա����:�ֳ��󷽷�eat()
		i.�����ʽ: ����18��� Ҷ֪�� �ڳ�ѧ����
	b)�ṩ: �޲�,�вι��췽��
6.�����˶�ѧ����(SportStudent��),�̳�Student��,ʵ��Sport�ӿ�
	a)��Ա����: ʵ��playBasketball�ĳ��󷽷�
		i.�����ʽ: ����Ϊ18�� Ҷ֪�� ѧ���ڴ�����
	b)�ṩ: �޲�,�вι��췽��
7.���������Test
	a)�ṩ��̬����ȥ�˶�goToSport(Sport  s) ,�ڷ����е���s�Ĵ�������
	b)�ṩ��̬����ȥ�͹�goToRestaurant(Person p),�ڷ����е���p����ĳԷ���
	c)�ṩmain����
	d)��main������
		i.�����˶���ʦ����sp,���丳ֵΪ30,������ֵΪ������
			i.˼������ΪʲôҪ����Sport�ӿ�����
		ii.�����˶�ѧ������ss,���丳ֵΪ18,������ֵΪҶ֪��
			i.˼������ΪʲôҪ���붥�㸸������
		iii.����ȥ�˶�goToSport�����������sp
		iv.����ȥ�˶�goToSport����,�������ss
		v.����ȥʳ��gotToRestaurant����,����sp
		vi.����ȥʳ��goToRestaurant����,����ss
 */
public class Test {
//	a)�ṩ��̬����ȥ�˶�goToSport(Sport  s) ,�ڷ����е���s�Ĵ�������
	public static void goToSport(Sport  s){
		s.playBasketball();
	}
//	b)�ṩ��̬����ȥ�͹�goToRestaurant(Person p),�ڷ����е���p����ĳԷ���
	public static void goToRestaurant(Person p){
		p.eat();
	}
//	main����
	public static void main(String[] args) {
//		i.�����˶���ʦ����sp,���丳ֵΪ30,������ֵΪ������
		SportTeacher sp = new SportTeacher();
		sp.setAge(30);
		sp.setName("������");
//		ii.�����˶�ѧ������ss,���丳ֵΪ18,������ֵΪҶ֪��
		SportStudent ss = new SportStudent("Ҷ֪��", 18);
//		iii.����ȥ�˶�goToSport�����������sp
		goToSport(sp);
//		iv.����ȥ�˶�goToSport����,�������ss
		goToSport(ss);
//		v.����ȥʳ��gotToRestaurant����,����sp
		goToRestaurant(sp);
//		vi.����ȥʳ��goToRestaurant����,����ss
		goToRestaurant(ss);
	}
}
