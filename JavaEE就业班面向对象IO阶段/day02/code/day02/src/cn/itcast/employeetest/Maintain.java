package cn.itcast.employeetest;

public abstract class Maintain extends Employee{
   
	//两个构造  
	public Maintain(){
		super();
	}
	
	public Maintain(int id,String name){
		super(id,name);  //做值传递 
	}
}
