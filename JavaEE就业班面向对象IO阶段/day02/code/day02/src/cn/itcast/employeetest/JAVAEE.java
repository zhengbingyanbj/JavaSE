package cn.itcast.employeetest;

public class JAVAEE extends Develop{
   

	public JAVAEE() {}
	
	public JAVAEE(int id, String name) {
		super(id, name);
	}

	public void work() {
		//员工号为xxx的 xxx员工，正在研发淘宝网站
		System.out.println("员工号为"+getId()+"的"+getName()+"员工,正在研发淘宝网站");
	}
	
	
}
