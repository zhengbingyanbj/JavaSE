package cn.itcast.demo02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NoNameDemo {
     public static void main(String[] args) throws FileNotFoundException {
	   
//    	 //创建对象
//    	 Player p = new Player();// 现在 右边的对象 起了个名字 叫p
//    	 
//    	 //p 引用变量  指向 一个堆内存的空间  
//    	 
//    	 new Player();//这是对象 只不过 没有引用指向   是一个没有名字的对象 称为匿名对象
    	 
    	 
    	 //区别  
    	 //创建对象
    	 Player p = new Player();
    	 // 一个对象 调用 四次 方法
    	 p.show();
    	 p.show();
    	 p.show();
    	 p.show();
    	 System.out.println("------------");
    	 //四个对象 调用每个调用一次  
    	 new Player().show();//匿名对象调用方法
    	 new Player().show();//匿名对象调用方法
    	 new Player().show();//匿名对象调用方法
    	 new Player().show();//匿名对象调用方法
    	 /*
    	  * 在单独使用的时候   
    	  *    假如 我们该对象仅仅调用其 中的某一个功能一次  那么可以选择用匿名对象
    	  */
    	 
    	 /*
    	  * 如果 
    	  *    在 调用的时候  或者 在方法返回值这里的时候   
    	  *    
    	  *    只要可以使用 有名对象的地方 都可以使用匿名对象替代
    	  */
    	 
    	 BufferedReader  br = new  BufferedReader(new FileReader("a.txt"));
    	 
    	 FileReader fr = new FileReader("a.txt");
    	 BufferedReader  br2 = new  BufferedReader(fr);
	 }
} 
