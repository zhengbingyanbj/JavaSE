package com.itheima.level02_05;
/*
��ʹ�ô��������� 38��İװٺ���һ����ֵΪ8000Ԫ��iPhone���ֻ�,����ʹ���߲��ֻ����𷲴�绰
  
3.���������Test
	a)�ṩmain����
	b)��main������
		i.ʹ�ô��ι��촴���ֻ����� phone,Ʒ�Ƴ�ʼ��ΪiPhone,�۸��ʼ��Ϊ8000
		ii.ʹ���޲ι��촴��Person���� yuFan,����setName(String name)����,����������Ϊ��
		iii.ʹ�ô��ι��촴��Person���� baiBaiHe,���Ƴ�ʼ��Ϊ�װٺ�,�����ʼ��Ϊ38,�ֻ���ʼ��,���洴����phone����
		iv.baiBaiHe����,����call(Person p) ����,����yuFan����
		1.�����ʽ:  38��İװٺ�ʹ��8000Ԫ��iPhone���ֻ����𷲴�绰
 */
public class Test {
	public static void main(String[] args) {
//		i.ʹ�ô��ι��촴���ֻ����� phone,Ʒ�Ƴ�ʼ��ΪiPhone,�۸��ʼ��Ϊ8000
		Phone phone = new Phone("iPhone", 8000);
//		ii.ʹ���޲ι��촴��Person���� yuFan,����setName(String name)����,����������Ϊ��
		Person yuFan = new Person();
		yuFan.setName("��");
//		iii.ʹ�ô��ι��촴��Person���� baiBaiHe,���Ƴ�ʼ��Ϊ�װٺ�,�����ʼ��Ϊ38,�ֻ���ʼ��,���洴����phone����
		Person baiBaiHe = new Person("�װٺ�", 38, phone);
//		iv.baiBaiHe����,����call(Person p) ����,����yuFan����
		baiBaiHe.callTo(yuFan);
//		1.�����ʽ:  38��İװٺ�ʹ��8000Ԫ��iPhone���ֻ����𷲴�绰
	}
}
