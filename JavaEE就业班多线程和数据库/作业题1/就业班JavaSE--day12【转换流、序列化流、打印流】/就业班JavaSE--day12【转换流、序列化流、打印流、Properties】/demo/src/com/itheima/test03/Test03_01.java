package com.itheima.test03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Test03_01 {
	/*
	 有学生类包含学号，姓名，省份证号，Java成绩，数学成绩，英语成绩等成员变量，提供构造方法和setter和getter方法。
	要求：
		* 学生信息及成绩保存到C盘的save.txt文件中
		* 学生身份证号码不能保存到文件中。
		* 程序运行时如果save.txt不存在，则
			从键盘录入1个学生信息，信息录入格式如下：
				***** 录入学生信息 *****
				请输入学号：9527
				请输入姓名：华安
				请输入身份证号：2203919831234543
				请输入Java成绩：90
				请输入数学成绩：80
				请输入英语成绩：88
			
				根据录入的信息创建学生对象并将学生对象保存到C盘下的save.txt文件中。
		* 如果程序运行时，save.txt文件已经存在，则显示学生信息。格式如下：
		**** 学生基本信息 *****
		学号  姓名 省份证号  Java成绩  数学成绩  英语成绩
		9527  华安   null      90        80        88
	 */
	public static void main(String[] args) throws Exception {
		// 根据文件路径创建文件对象
		File file = new File("c:/save.txt");
		if(file.exists()) { // 文件存在
			System.out.println("************ 学生基本信息 ************");
			// 创建对象输入流对象
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Student stu = (Student) ois.readObject();
			System.out.println("学号\t姓名\t省份证号\tJava成绩\t数学成绩\t英语成绩");
			System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+ stu.getIdCard()+"\t  " + stu.getJavaScore()+"\t  "
			+ stu.getMathScore()+"\t  "+ stu.getEnglishScore()+"\t  ");
			// 关闭流
			ois.close();
		} else { // 文件不存在
			// 创建文件
			file.createNewFile();
			// 创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			// 录入学生信息
			System.out.println("************ 录入学生信息 ************");
			System.out.print("请输入学号：");
			String id = sc.nextLine();
			System.out.print("请输入姓名：");
			String name = sc.nextLine();
			System.out.print("请输入身份证号：");
			String idCard = sc.nextLine();
			System.out.print("请输入Java成绩：");
			String javaScore = sc.nextLine();
			System.out.print("请输入数学成绩：");
			String mathScore = sc.nextLine();
			System.out.print("请输入英语成绩：");
			String englishScore = sc.nextLine();
			// 创建学生对象
			Student stu = new Student(id, name, idCard, javaScore, mathScore, englishScore);
			System.out.println(stu);
			// 创建对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(stu);
			// 关闭流
			oos.close();
		}
	}
}

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private transient String idCard;
	private String javaScore;
	private String mathScore;
	private String englishScore;
	
	public Student(String id, String name, String idCard, String javaScore, String mathScore, String englishScore) {
		super();
		this.id = id;
		this.name = name;
		this.idCard = idCard;
		this.javaScore = javaScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(String javaScore) {
		this.javaScore = javaScore;
	}
	public String getMathScore() {
		return mathScore;
	}
	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}
	public String getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(String englishScore) {
		this.englishScore = englishScore;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", idCard=" + idCard + ", javaScore=" + javaScore
				+ ", mathScore=" + mathScore + ", englishScore=" + englishScore + "]";
	}
}
