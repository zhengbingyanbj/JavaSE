package com.itheima.level3_03;
/*
 9.�ϰ���Boss��
	a)����: ����,����
	b)��Ϊ: 
		i.���Ź���(letWork(Employee e)
			1.����e����Ĺ�������
		ii.��֯����(letPlay(Actor a)
			1.����a�����,���ݷ���.
	c) �ṩ�ղ�,���ι��췽��;setters��getters����
 */
public class Boss {
//	a)����: ����,����
	private String name;
	private int age;
//	b)��Ϊ: 
//		i.���Ź���(letWork(Employee e)
//			1.����e����Ĺ�������
	public void letWork(Employee e){
		e.work();
	}
//		ii.��֯����(letPlay(Actor a)
//			1.����a�����,���ݷ���.
	public void letPlay(Actor a){
		a.play();
	}
//	c) �ṩ�ղ�,���ι��췽��;setters��getters����
	public Boss() {
		super();
	}
	public Boss(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
