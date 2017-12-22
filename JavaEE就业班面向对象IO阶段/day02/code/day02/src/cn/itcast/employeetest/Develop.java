package cn.itcast.employeetest;

public abstract class Develop extends Employee{
   
	//两个构造  
	public Develop(){
		super();
	}
	
	public Develop(int id,String name){
		super(id,name);  //做值传递 
	}
}
