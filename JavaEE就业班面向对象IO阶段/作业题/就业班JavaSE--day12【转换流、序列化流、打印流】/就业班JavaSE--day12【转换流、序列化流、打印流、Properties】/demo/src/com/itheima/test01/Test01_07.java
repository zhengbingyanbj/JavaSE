package com.itheima.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test01_07 {

	/*
	 * 将上一题保存到stu.txt文件中的学生对象读取出来。
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("stu.txt");
		// 创建对象输入流对象
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 读取学生对象
		Student s = (Student) ois.readObject();
		System.out.println(s);
		// 关闭流
		ois.close();
	}

}
