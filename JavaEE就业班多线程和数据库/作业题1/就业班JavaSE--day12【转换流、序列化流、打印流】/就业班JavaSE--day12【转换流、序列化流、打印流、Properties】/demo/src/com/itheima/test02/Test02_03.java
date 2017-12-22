package com.itheima.test02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.itheima.test01.Student;

public class Test02_03 {
	/*
	 * 将上一题保存到stus.txt文件中集合对象读取出来并遍历集合将学生对象输出在控制台
	 */
	public static void main(String[] args) throws Exception {
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("stus.txt");
		// 创建对象输入流对象
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 读取集合对象
		List<Student> stus = (List<Student>) ois.readObject();
		// 关闭流
		ois.close();
		
		// 遍历集合
		for (Student stu : stus) {
			System.out.println(stu);
		}
	}
}
