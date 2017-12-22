package com.itheima.test02;

public class Student {
	private int id;
	private String gender;
	private String name;
	public Student(int id, String gender, String name) {
		super();
		this.id = id;
		this.gender = gender;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
