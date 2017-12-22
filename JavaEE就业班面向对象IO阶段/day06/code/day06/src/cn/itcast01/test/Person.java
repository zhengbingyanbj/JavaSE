package cn.itcast01.test;

public abstract class Person {
   

	
	public static Person getInstance(){
		
		return new Student();
	}
}
