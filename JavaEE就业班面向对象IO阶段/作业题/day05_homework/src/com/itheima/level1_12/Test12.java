package com.itheima.level1_12;
/*
��ʹ�ô���ʵ��
ÿһ��ѧ��(Student)����ѧ��,�����ͷ���,������Զ����ΪΪ����
���ʦͽ��ѧ����ֵһ������,�׳�һ���Զ��쳣
 
 1.�����쳣��NoScoreException,�̳�RuntimeException
	a)�ṩ�ղκ��вι��췽��
 2.����ѧ����(Student)
	a)����:name,score
	b)�ṩ�ղι���
	c)�ṩ�вι���;
		i.ʹ��setXxx���������ƺ�score��ֵ
	d)�ṩsetter��getter����
		i.��setScore(int score)������
			1.�����ж�,���scoreΪ����,���׳�NoScoreException,�쳣��ϢΪ:��������Ϊ����:xxx.
			2.Ȼ���ڸ���Աscore��ֵ.
3.���������Test12
	a)�ṩmain����,��main������
		i.ʹ�����ι��췽������Student����,��������һ������,���г���
		ii.����һ�������쳣,����Ĵ���Ľ�����ִ��,������Ҫע�͵�����Ĵ���
		iii.ʹ�ÿղι��촴��Student����
		iv.����setScore(int score)����,����һ������,���г���
		v.����setScore(int score)����,����һ������,���г���
 */
public class Test12 {
	public static void main(String[] args) {
//		i.ʹ�����ι��췽������Student����,��������һ������,���г���
//		Student s = new Student("����", -10);
//		ii.����һ�������쳣,����Ĵ���Ľ�����ִ��,������Ҫע�͵�����Ĵ���
		
//		iii.ʹ�ÿղι��촴��Student����
		Student s = new Student();
//		iv.����setScore(int score)����,����һ������,���г���
		s.setScore(100);
//		v.����setScore(int score)����,����һ������,���г���
		s.setScore(-5);
	}
}
