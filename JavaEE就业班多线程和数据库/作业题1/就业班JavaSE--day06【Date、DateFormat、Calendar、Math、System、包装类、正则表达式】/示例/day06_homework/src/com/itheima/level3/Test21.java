package com.itheima.level3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 请使用实现:
已知项目的根目录下有一个student.txt,内容如下:
			 1       郝婷婷    女      30
			 2       赵鹏      男      35
			 3       周强      男      38
			 4       李艳欣    女      37
			 5       朱可可    女      41
			 6       张少荣    女      30
			 7       王小军    男      28
该文件中,每一行表示一个学生信息,从前往后依次是学号,姓名,姓名,年龄
要求: 
1.读取文件内容,把每一个学生信息封装为一个学生对象,存储到ArrayList集合中
2.打印集合中的学生信息
3.计算平均年分
4.异常处理使用throws的方式



1.在项目的根目录下创建student.txt文件,把内容拷贝到这个文件中
2.在包:com.itheima.level3中
3.创建Student类
	a)属性: 学号(id),姓名(name),性别(sex),年龄(int age)
	b)提供空参,有参构造方法,setters和getters方法
	c)重写toString()方法
4.创建Test21类,提供main方法,在main方法中
	a)创建ArrayList集合对象 list,用于存储读取到的学生对象
	b)创建BufferedReader对象br,绑定数据源
	c)定义字符变量str;
	d)使用while循环,每次读一行,在循环中
		i.调用trim方法,取出读取到字符串两端的空格
		ii.使用split(“\\s+”) 拆分内容,返回字符串数组
		iii.数组的元素0索引是学号,1索引是姓名,2索引是性别,3索引是年龄
		iv.把字符串的年龄转换为整数的年龄
		v.创建有参构造Student对象s
		vi.把学生对象添加集合中
	e)遍历list集合,打印每一个学生信息
	f)统计学生的平均年龄
 */
public class Test21 {
	public static void main(String[] args) throws IOException {
//		a)创建ArrayList集合对象 list,用于存储读取到的学生对象
		ArrayList<Student> list = new ArrayList<>();
//		b)创建BufferedReader对象br,绑定数据源
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
//		c)定义字符变量str;
		String line;
//		d)使用while循环,每次读一行,在循环中
		while((line=br.readLine())!=null){
//			i.调用trim方法,取出读取到字符串两端的空格
			line = line.trim();
//			ii.使用split(“\\s+”) 拆分内容,返回字符串数组
			String[] strs = line.split("\\s+");
//			iii.数组的元素0索引是学号,1索引是姓名,2索引是性别,3索引是年龄
//			iv.把字符串的年龄转换为整数的年龄
			int age = Integer.parseInt(strs[3]);
//			v.创建有参构造Student对象s
			Student s = new Student(strs[0],strs[1],strs[2], age);
//			vi.把学生对象添加集合中
			list.add(s);
		}
//		e)遍历list集合,打印每一个学生信息
		for (Student student : list) {
			System.out.println(student);
		}
//		f)统计学生的平均年龄
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getAge();
		}
//		计算平均分
		double avg = (double)sum / list.size();
		System.out.println("平均年龄为:"+avg);
		
	}
}
