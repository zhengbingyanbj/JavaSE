package com.itheima.test01;

public class User {
	private int id;
	private String username;
	private String gender;
	private String address;
	public User(int id, String username, String gender, String address) {
		super();
		this.id = id;
		this.username = username;
		this.gender = gender;
		this.address = address;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", gender=" + gender + ", address=" + address + "]";
	}
}
