package com.itheima.level02_05;

/*
 2.定义Person类
	a)成员变量
		i.姓名(name)
		ii.年龄(age)
		iii.手机(Phone)
	b)成员方法: 打电话: public void callTo(Person p)  使用自己的手机给指定的人打电话
		i.在方法内部调用手机的call(String name) 方法,给传入的人打电话
	c)要求:
		i.提供无参和带参构造
		ii.提供setXxx和getXxx方法
 */
public class Person {
//	a)成员变量
//		i.姓名(name)
	private String name;
//		ii.年龄(age)
	private int age;
//		iii.手机(Phone)
	private Phone phone;
//	b)成员方法: 打电话: public void callTo(Person p)  使用自己的手机给指定的人打电话
//		i.在方法内部调用手机的call(String name) 方法,给传入的人打电话
	 public void callTo(Person p){
		 System.out.print(age+"岁的"+name+"使用"+phone.getPrice()+"元的"+phone.getBrand()+"的手机部手机");
		 phone.call(p.name);
	 }
//	c)要求:
//		i.提供无参和带参构造
	public Person() {
	}
	
	public Person(String name, int age, Phone phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	} 
//		ii.提供setXxx和getXxx方法
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
