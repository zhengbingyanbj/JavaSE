package cn.itcast.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
/*
 * 编写一个类A，增加一个实例方法showString,用于打印一条字符串，
 * 在编写一个类TestA ,作为客户端，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，
  * 并调用该对象中的方法showString
 */
public class MainApp {
	public static void main(String[] args) throws Exception {
		System.out.println("请录入一个类的路径:");
		// 键盘录入cn.itcast.demo.A
		String className = new Scanner(System.in).nextLine();
		
		 //获取到  User类的字节码文件对象
		Class clazz = Class.forName(className);
	   //根据字节码文件对象获取空参构造
		Constructor cons = clazz.getConstructor();
		//根据反射获取对象
		Object obj = cons.newInstance();
		
		//根据反射获取该方法 
		Method method = clazz.getMethod("showString");
		
		method.invoke(obj);
	}
}
