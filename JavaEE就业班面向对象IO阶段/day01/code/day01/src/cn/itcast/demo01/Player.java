package cn.itcast.demo01;

public class Player {
    //成员变量
	private String name;
	private int age;
	//空参构造
	public Player() {
	}
	//满参构造
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//get set 。。。
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
