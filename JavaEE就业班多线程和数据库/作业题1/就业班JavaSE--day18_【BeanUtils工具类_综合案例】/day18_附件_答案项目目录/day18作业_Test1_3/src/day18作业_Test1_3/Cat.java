package day18ื๗าต_Test1_3;

public class Cat {
	private String name;
	private int age;
	private String color;
	private char sex;
	public Cat(String name, int age, String color, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.sex = sex;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", sex=" + sex + "]";
	}
	
	
}
