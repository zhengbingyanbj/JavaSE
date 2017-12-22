package cn.itcast.employeetest;

public abstract class Employee {
    //成员变量
	private int id;
	private String name;
	//空参构造
	public Employee(){}
	//满参构造
	public Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	//set get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//抽象的 work
	public abstract void work();
}
