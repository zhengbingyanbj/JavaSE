package cn.itcast.demo01;

public class Player {
    //��Ա����
	private String name;
	private int age;
	//�ղι���
	public Player() {
	}
	//���ι���
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//get set ������
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
