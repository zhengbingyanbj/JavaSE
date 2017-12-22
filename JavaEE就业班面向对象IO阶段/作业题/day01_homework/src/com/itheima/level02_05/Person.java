package com.itheima.level02_05;

/*
 2.����Person��
	a)��Ա����
		i.����(name)
		ii.����(age)
		iii.�ֻ�(Phone)
	b)��Ա����: ��绰: public void callTo(Person p)  ʹ���Լ����ֻ���ָ�����˴�绰
		i.�ڷ����ڲ������ֻ���call(String name) ����,��������˴�绰
	c)Ҫ��:
		i.�ṩ�޲κʹ��ι���
		ii.�ṩsetXxx��getXxx����
 */
public class Person {
//	a)��Ա����
//		i.����(name)
	private String name;
//		ii.����(age)
	private int age;
//		iii.�ֻ�(Phone)
	private Phone phone;
//	b)��Ա����: ��绰: public void callTo(Person p)  ʹ���Լ����ֻ���ָ�����˴�绰
//		i.�ڷ����ڲ������ֻ���call(String name) ����,��������˴�绰
	 public void callTo(Person p){
		 System.out.print(age+"���"+name+"ʹ��"+phone.getPrice()+"Ԫ��"+phone.getBrand()+"���ֻ����ֻ�");
		 phone.call(p.name);
	 }
//	c)Ҫ��:
//		i.�ṩ�޲κʹ��ι���
	public Person() {
	}
	
	public Person(String name, int age, Phone phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	} 
//		ii.�ṩsetXxx��getXxx����
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
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
