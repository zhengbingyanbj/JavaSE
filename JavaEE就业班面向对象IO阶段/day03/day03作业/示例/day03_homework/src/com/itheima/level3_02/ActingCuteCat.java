package com.itheima.level3_02;
/*
 6.��������ȵ�è��(ActingCuteCat) �̳�è��(Cat) ʵ�����Ƚӿ�(ActionCute)
	a)ʵ�ֽӿ��е����ȷ���:actingCute())
		i.�����ʽ: 1���ɫ��è�ڰ����
	b)�ṩ:�ղ�,�вι��췽��
 */
public class ActingCuteCat  extends Cat implements ActingCute{
//a)ʵ�ֽӿ��е����ȷ���:actingCute())
//	i.�����ʽ: 1���ɫ��è�ڰ����
	public void actingCute(){
		System.out.println(getAge()+"��"+getColor()+"��è�ڰ����");
	}
//b)�ṩ:�ղ�,�вι��췽��
	public ActingCuteCat() {
		super();
	}
	public ActingCuteCat(String color, int age) {
		super(color, age);
	}
}
