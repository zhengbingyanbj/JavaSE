package cn.itcast.extendssuper;

public class Person {
    //成员变量
	private String name;
    private int age;
     //空参    
    public Person(){}
    //满参
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
