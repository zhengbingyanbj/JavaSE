package com.itheima.test02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test02_02 {
	/*
	 * 使用高效流输入读取上一题保存学生信息的文件，每次读取一行信息。
	每读取到一行信息就创建一个学生对象并添加到集合中。
	遍历集合打印学生信息到控制台。
	 */
	public static void main(String[] args) throws IOException {
		// 创建高效流字符流对象
		BufferedReader br = new BufferedReader(new FileReader("c:/stu.txt"));
		// 定义集合存放学生对象
		List<Student> stus = new ArrayList<Student>();
		// 定义字符串接收读取的数据
		String line = null;
		// 使用循环从文件中读取数据
		while((line = br.readLine()) != null) {
			// 使用-分隔字符串
			String[] strs = line.split("-");
			// 创建学生对象
			Student stu = new Student(strs[0],strs[1]);
			// 将学生添加到集合中
			stus.add(stu);
		}
		// 关流释放资源
		br.close();
		
		// 遍历集合打印学生信息
		for (Student student : stus) {
			System.out.println(student.getId()+"="+student.getName());
		}
	}
}

class Student{
	// 学号
	private String id;
	// 姓名
	private String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
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
}