package com.itheima.level2_03;

/*
 9.���嶯��԰����Ա��(ZooManager)
	a)����:����(name),����(age)
	b)��Ϊ: 
	i.ι������(feed(Animal a)),���óԵķ���; 
		1.��˼���˴�Ϊʲôʹ��Animal��Ϊ�������Ͷ�����������
		2.�ڷ����ڲ�,����a�����eat����
	ii.��֯�ݳ�(letItShow(Actor a))
		1.��˼���˴�Ϊʲôʹ��Actor�ӿ�������Ϊ�������Ͷ�������ʵ����
		2.�ڷ����ڲ�
			a)����a��play����
			b)���������,��a����ת��ΪParrot����,����˵������
	c) �ṩ�ղ�,�вι��췽����setters��getters���� 
 */
public class ZooManager {
//	a)����:����(name),����(age)
	private String name;
	private int age;
//	b)��Ϊ: 
//	i.ι������(feed(Animal a)),���óԵķ���; 
//		1.��˼���˴�Ϊʲôʹ��Animal��Ϊ�������Ͷ�����������
//		2.�ڷ����ڲ�,����a�����eat����
	public void feed(Animal a){
		a.eat();
	}
//	ii.��֯�ݳ�(letItShow(Actor a))
//		1.��˼���˴�Ϊʲôʹ��Actor�ӿ�������Ϊ�������Ͷ�������ʵ����
//		2.�ڷ����ڲ�
//			a)����a��play����
//			b)���������,��a����ת��ΪParrot����,����˵������
	public void letItShow(Actor a){
//		a)����a��play����
		a.play();
//		b)���������,��a����ת��ΪParrot����,����˵������
		if(a instanceof Parrot){
			Parrot p = (Parrot) a;
			p.say();
		}
	}
//	c) �ṩ�ղ�,�вι��췽����setters��getters���� 
	public ZooManager() {
		super();
	}
	public ZooManager(String name, int age) {
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
