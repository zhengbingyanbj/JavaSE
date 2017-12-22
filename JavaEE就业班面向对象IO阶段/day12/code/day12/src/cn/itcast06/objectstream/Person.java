package cn.itcast06.objectstream;

import java.io.Serializable;

/*
 * java.io.NotSerializableException
 * 当实例需要具有序列化接口时，抛出此异常。序列化运行时或实例的类会抛出此异常
 * 
 *   如果一个对象想要被序列化  那么 需要实现序列化接口 
 *    java.io.Serializable
 *      
 *        相当于进京证  
 */
public class Person implements Serializable{
	private String name;
	private int age;
    
	public String sex;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
  
	
}
