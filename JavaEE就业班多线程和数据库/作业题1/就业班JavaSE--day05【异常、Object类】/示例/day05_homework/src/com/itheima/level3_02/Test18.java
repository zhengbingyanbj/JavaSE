package com.itheima.level3_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 请使用代码描述
         把names.txt中的人名,读取到程序中,存储到ArrayList集合中;每一个人名为ArrayList集合中一个元素;
        要求:使用try...catch...finally对异常进行处理  
 
1.创建包:com.itheima.level3_02
2.创建类Test18
3.提供main方法,在main方法中
	a)创ArrayList集合对象,用于存储姓名
	b)定义BufferedReader类型变量 br,初始值为null
	c)写try..catch...finally代码块
	d)在try代码块中
		i.创建BufferedReader对象,绑定names.txt文件,赋值给br
		ii.定义字符串变量line,用于存储读取到的名称
		iii.使用循环,每次读一行,添加到集合中
	e)在catch代码块中,打印异常信息
	f)在finnaly代码块中释放资源
		i.如果br不为null,就调用br的close方法
		ii.处理关闭异常
    g)打印集合list
 */
public class Test18 {
	public static void main(String[] args) {
//		a)创ArrayList集合对象,用于存储姓名
		ArrayList<String> list = new ArrayList<>();
//		b)定义BufferedReader类型变量 br,初始值为null
		BufferedReader br = null;
//		c)写try..catch...finally代码块
		try{
//		d)在try代码块中
//			i.创建BufferedReader对象,绑定names.txt文件,赋值给br
			 br = new BufferedReader(new FileReader("names.txt"));
//			ii.定义字符串变量line,用于存储读取到的名称
			 String line;
//			iii.使用循环,每次读一行,添加到集合中
			 while((line = br.readLine())!=null){
					 list.add(line);
			 }
		}catch(IOException e){
//		e)在catch代码块中,打印异常信息
			e.printStackTrace();
		}finally{
//		f)在finnaly代码块中释放资源
			try{
	//			i.如果br不为null,就调用br的close方法
				if(br!=null){
					br.close();
				}
//			ii.处理关闭异常
			}catch(IOException e){
				e.printStackTrace();
			}
		}
//	    g)打印集合list
		System.out.println(list);
	}
}
