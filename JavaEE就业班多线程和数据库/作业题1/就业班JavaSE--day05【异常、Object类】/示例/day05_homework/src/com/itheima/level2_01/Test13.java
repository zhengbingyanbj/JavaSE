package com.itheima.level2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 请使用代码实现
	写一个方法用于复制文本文件;
	要求:使用try...catch...finally对异常进行处理
	
1.定义测试类Test13
	a)写一个复制文件的静态方法:copyFile(String src,String dest) 
		i.这里的src为源文件路径,dest为目标文件路径
		ii.定义BufferedReader br变量
		iii.定义BufferedWriter bw 变量
		iv.写try...catch...finally代码块
		v.在try代码块中
			1.创建BufferedReader的对象,绑定源文件,并把对象赋值给br
			2.创建BufferedWriter的对象,绑定目标文件,并把对象赋值给bw
			3.定义一个字符数组 chs,长度为1024,用于临时存储读取到的数据
			4.定义整型变量len,用于记录读取到的有效字节个数
			5.使用while循环,读一个字符数组,写一个字符数组,并刷新流
		vi.在catch代码块中,打印异常信息
		vii.在finally代码块
			1.写一个try...catch代码块
			2.在try代码块中: 如果bw不为null就关闭bw
			3.在catch代码块中打印异常信息
			4.在写一个try...catch代码块
			5.在try代码块中,如果br不为null就关闭br
			6.在catch代码中打印异常信息
	b)提供main方法,在main方法中
		i.在main方法,调用刚刚写copyFile方法,传入源文件路径和目标文件路径
 */
public class Test13 {
//	a)写一个复制文件的静态方法:copyFile(String src,String dest) 
	public static void copyFile(String src,String dest){
//		i.这里的src为源文件路径,dest为目标文件路径
//		ii.定义BufferedReader br变量
		BufferedReader br = null;
//		iii.定义BufferedWriter bw 变量
		BufferedWriter bw = null;
//		iv.写try...catch...finally代码块
		try{
//		v.在try代码块中
//			1.创建BufferedReader的对象,绑定源文件,并把对象赋值给br
			br = new BufferedReader(new FileReader(src));
//			2.创建BufferedWriter的对象,绑定目标文件,并把对象赋值给bw
			bw = new BufferedWriter(new FileWriter(dest));
//			3.定义一个字符数组 chs,长度为1024,用于临时存储读取到的数据
			char[] chs = new char[1024];
//			4.定义整型变量len,用于记录读取到的有效字节个数
			int len = 0;
//			5.使用while循环,读一个字符数组,写一个字符数组,并刷新流
			while((len = br.read(chs))!=-1){
				bw.write(chs, 0, len);
			}
		}catch(IOException e){
//		vi.在catch代码块中,打印异常信息
			e.printStackTrace();
		}finally{
//		vii.在finally代码块
//			1.写一个try...catch代码块
			try{
//			2.在try代码块中: 如果bw不为null就关闭bw
				if(bw != null){
					bw.close();
				}
			}catch(IOException ex){
//			3.在catch代码块中打印异常信息
				ex.printStackTrace();
			}
			
//			4.在写一个try...catch代码块
			try{
//			5.在try代码块中,如果br不为null就关闭br
				if(br!=null){
					br.close();
				}
			}catch(IOException ex){
//			6.在catch代码中打印异常信息
				ex.printStackTrace();
			}
		}
	}
	
//	i.在main方法,调用刚刚写copyFile方法,传入源文件路径和目标文件路径
	public static void main(String[] args) {
		copyFile("content.txt", "13.txt");
	}
}
