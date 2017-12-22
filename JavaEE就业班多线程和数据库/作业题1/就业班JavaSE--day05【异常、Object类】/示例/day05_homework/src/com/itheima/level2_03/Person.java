package com.itheima.level2_03;
/*
 2.����Person��
	a)����:����(name)������ֵ(lifeValue)
		b)�ṩ�ղι���
		c)�ṩ�вι���;
			i.ʹ��setXxx������name��lifeValue��ֵ
	d)�ṩsetter��getter����
		i.��setLifeValue(int lifeValue)������
			1.�����ж�,��� lifeValueΪ����,���׳�NoLifeValueException,�쳣��ϢΪ:����ֵ����Ϊ����:xxx.
			2.Ȼ���ڸ���ԱlifeValue��ֵ.
 */
public class Person {
//	����(name)
	private String name;
//	����ֵ(lifeValue)
	private int lifeValue;
//	�ղι���
	public Person() {
		super();
	}
//	c)�ṩ�вι���;
	public Person(String name, int lifeValue) {
		super();
//	i.ʹ��setXxx������name��lifeValue��ֵ
		setName(name);
		setLifeValue(lifeValue);
	}
//d)�ṩsetter��getter����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifeValue() {
		return lifeValue;
	}
//	i.��setLifeValue(int lifeValue)������
	public void setLifeValue(int lifeValue) {
//	1.�����ж�,��� lifeValueΪ����,���׳�NoLifeValueException,�쳣��ϢΪ:����ֵ����Ϊ����:xxx.
		if(lifeValue < 0){
			throw new NoLifeValueExption("����ֵ����Ϊ����:"+lifeValue);
		}
//	2.Ȼ���ڸ���ԱlifeValue��ֵ.
		this.lifeValue = lifeValue;
	}
}
