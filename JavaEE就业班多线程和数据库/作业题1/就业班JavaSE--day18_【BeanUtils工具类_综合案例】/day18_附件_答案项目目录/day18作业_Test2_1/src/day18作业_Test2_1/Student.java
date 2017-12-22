package day18ื๗าต_Test2_1;

public class Student {
	private String stuNo;
	private String name;
	private int age;
	private char sex;
	private double score;
	public Student(String stuNo, String name, int age, char sex, double score) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", age=" + age + ", sex=" + sex + ", score=" + score
				+ "]";
	}
	
	
}
