package com.itheima.level3_02;
/*
 4.��������ȵĹ���(ActingCuteDog) �̳й���(Dog) ʵ�����Ƚӿ�(ActingCute)
	a)ʵ�ֽӿ��е����ȷ���:actingCute())
		i.�����ʽ: 2���ɫ�Ĺ���װ�޹�
	b)�ṩ:�ղ�,�вι��췽��
 */
public class ActingCuteDog extends Dog implements ActingCute{
//a)ʵ�ֽӿ��е����ȷ���:actingCute())
//	i.�����ʽ: 2���ɫ�Ĺ���װ�޹�
	public void actingCute(){
		System.out.println(getAge()+"��"+getColor()+"�Ĺ���װ�޹�");
	}
//b)�ṩ:�ղ�,�вι��췽��
	public ActingCuteDog() {
		super();
	}
	
	public ActingCuteDog(String color, int age) {
		super(color, age);
	}
}
