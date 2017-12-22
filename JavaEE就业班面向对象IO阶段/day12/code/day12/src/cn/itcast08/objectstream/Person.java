package cn.itcast08.objectstream;

import java.io.Serializable;

/*
 * java.io.NotSerializableException
 * ��ʵ����Ҫ�������л��ӿ�ʱ���׳����쳣�����л�����ʱ��ʵ��������׳����쳣
 * 
 *   ���һ��������Ҫ�����л�  ��ô ��Ҫʵ�����л��ӿ� 
 *    java.io.Serializable
 *      
 *        �൱�ڽ���֤  
 *        
 *        ��̬�Ĳ��ᱻ���л� 
 *        
 *        ��� ��д�Ǿ�̬���� ���뱻���л� 
 *        
 *         ���� �����л��ļ� ˲̬�ؼ���transient
 */
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private transient int age;

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
