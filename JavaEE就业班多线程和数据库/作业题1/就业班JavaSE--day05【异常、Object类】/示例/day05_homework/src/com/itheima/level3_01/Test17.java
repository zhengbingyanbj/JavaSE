package com.itheima.level3_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 已知集合ArrayList中有, ”张三丰”,”景甜”,”林思意”,”鹿晗”; 把集合中人名写入当前项目的根目录下的names.txt中,每一个人名占一行;
要求: 使用try...catch...finally对异常进行处理


1.创建包:com.itheima.level3_01
2.创建类Test17
3.提供main方法,在main方法中
	a)创建ArrayList集合对象list
	b)向集合list中添加人名
	c)定义BufferedWriter变量 br,初始化值为null
	d)写try...catch...finally代码块
	e)在try代码块中
		i.创建BufferedWriter对象,绑定目标names.txt,赋值bw
		ii.遍历list集合,在遍历的过程中,写一个人名,写一个换行,再flush
	f)在catch代码块中,打印异常信息
	g)在finally代码块中关闭流
		i.如果bw不为null,就调用bw.close()方法
		ii.使用try...catch处理异常
 */
public class Test17 {
	public static void main(String[] args) {
//		a)创建ArrayList集合对象list
	    ArrayList<String> list = new ArrayList<>();
//		b)向集合list中添加人名
	    list.add("张三丰");
	    list.add("景甜");
	    list.add("林思意");
	    list.add("鹿晗");
//		c)定义BufferedWriter变量 br,初始化值为null
	    BufferedWriter bw = null;
//		d)写try...catch...finally代码块
	    try{
//		e)在try代码块中
//			i.创建BufferedWriter对象,绑定目标names.txt,赋值bw
	      bw = new BufferedWriter(new FileWriter("names.txt"));
//			ii.遍历list集合,在遍历的过程中,写一个人名,写一个换行,再flush
	      for(int i=0; i<list.size(); i++){
	    	  String name = list.get(i);
	    	  bw.write(name);
	    	  bw.newLine();
	    	  bw.flush();
	      }
	      
	    }catch(IOException e){
//		f)在catch代码块中,打印异常信息
	    	e.printStackTrace();
	    }finally{
//		g)在finally代码块中关闭流
//			i.如果bw不为null,就调用bw.close()方法
	    	
	    	try{
		    	if(bw != null){
		    		bw.close();
		    	}
	    	}catch(IOException ex){
//				ii.使用try...catch处理异常
	    		ex.printStackTrace();
	    	}
	    }
	}
}
