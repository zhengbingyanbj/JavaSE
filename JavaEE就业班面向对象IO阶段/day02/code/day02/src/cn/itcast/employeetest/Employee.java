package cn.itcast.employeetest;

public abstract class Employee {
    //��Ա����
	private int id;
	private String name;
	//�ղι���
	public Employee(){}
	//���ι���
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
	//����� work
	public abstract void work();
}
