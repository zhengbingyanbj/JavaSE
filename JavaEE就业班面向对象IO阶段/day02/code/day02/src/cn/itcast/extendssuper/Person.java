package cn.itcast.extendssuper;

public class Person {
    //��Ա����
	private String name;
    private int age;
     //�ղ�    
    public Person(){}
    //����
    public Person(String name,int age){
    	this.name = name ;
    	this.age = age;
    }
    //set..get..
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
