package com.itheima.test02;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.itheima.test01.Student;

public class Test02_02 {
	/*
	 * 定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
		定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。
	 */
	public static void main(String[] args) throws IOException {
		// 创建集合对象，存放学生对象
		List<Student> stus = new ArrayList<Student>();
		// 添加学生对象
		stus.add(new Student("jack",20,"男"));
		stus.add(new Student("rose",18,"女"));
		stus.add(new Student("laowang",20,"男"));
		// 创建对象输出流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stus.txt"));
		// 将学生对象保存文件中
		oos.writeObject(stus);
		// 关闭流并释放资源
		oos.close();
	}
}