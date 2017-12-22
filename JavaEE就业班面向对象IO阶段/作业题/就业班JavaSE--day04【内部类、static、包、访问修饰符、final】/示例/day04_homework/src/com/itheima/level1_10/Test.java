package com.itheima.level1_10;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("景甜",22);
		Student s2 = new Student("林思意",18);
		System.out.println(s1.school);
		s1.school = " 传智播客";
		System.out.println(s2.school);
	}
}
