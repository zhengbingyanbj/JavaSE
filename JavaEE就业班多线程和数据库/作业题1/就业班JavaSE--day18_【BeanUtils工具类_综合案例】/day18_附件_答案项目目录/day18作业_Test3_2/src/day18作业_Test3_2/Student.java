package day18ื๗าต_Test3_2;

public class Student {
	private String id;
	private String name;
	private int age;
	private char sex;
	private double score;
	private String course;
	public Student(String id, String name, int age, char sex, double score, String course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", score=" + score
				+ ", course=" + course + "]";
	}
	
	
	
}
