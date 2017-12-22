package com.itheima.level1_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
11. 使用代码实现
 	写一个实现把字符串中数据,写入项目根目录下的content.txt文件中
 	
1.定义类(Test11)
2.写一个静态方法 void write(String content),在方法中
		a)定义字符缓冲输出流变量BufferedWriter bw;
		b)写一个try{   }catch(IOException e){  }finally{ }代码块
		c)在try{ }在代码块中	
			i.创建BufferedWriter对象,绑定content.txt文件,赋值给bw
			ii.调用bw的write()方法,传入content
		d)在catch代码块中,打印异常信息
		e)在finally代码块关闭流
			i.写try{}catch(IOException ex){} 代码块
			ii.在try 代码块中,如果bw!=null,调用bw.close()方法
			iii.在catch代码块,打印异常信息
3.在main方法中调用write(String conent)方法
 */
public class Test11 {
	
//	写一个静态方法 void write(String content)
	public static void write(String content){
//		a)定义字符缓冲输出流变量BufferedWriter bw,初始值为null;
		BufferedWriter bw = null;
//		b)写一个try{   }catch(IOException e){  }finally{ }代码块
		try{
//		c)在try{ }在代码块中	
//			i.创建BufferedWriter对象,绑定content.txt文件,赋值给bw
			bw = new BufferedWriter(new FileWriter("content.txt"));
//			ii.调用bw的write()方法,传入content
			bw.write(content);
		}catch(IOException e){
//		d)在catch代码块中,打印异常信息
			e.printStackTrace();
		}finally{
//		e)在finally代码块关闭流
//			i.写try{}catch(IOException ex){} 代码块
			try{
//			ii.在try 代码块中,如果bw!=null,调用bw.close()方法
				if(bw != null){
					bw.close();
				}
			}catch(IOException ex){
//			iii.在catch代码块,打印异常信息
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		write("我爱Java,我爱黑马程序员");
	}
}
