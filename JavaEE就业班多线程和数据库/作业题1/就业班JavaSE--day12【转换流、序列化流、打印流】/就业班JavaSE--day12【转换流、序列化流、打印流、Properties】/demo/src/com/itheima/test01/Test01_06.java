package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test01_06 {

	/*
	 * 定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
	 * 在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
	 */
	public static void main(String[] args) throws IOException {
		// 创建学生对象
		Student s = new Student("jack",20,"男");
		// 创建对象输出流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
		// 将学生对象保存文件中
		oos.writeObject(s);
		// 关闭流并释放资源
		oos.close();
	}
}
