package cn.itcast.demo;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) throws Exception {
		 
		   //����һ�����϶���
		   ArrayList<Integer> list = new ArrayList<Integer>();
		   
		   //�洢
		   list.add(12);
		   list.add(new Integer(110));
		   
//		   list.add("abc");
		   //��ȡ�ֽ����ļ�����
		   Class clazz = list.getClass();
		   
		   //��ȡ  add����
		  Method method =  clazz.getMethod("add", Object.class);
		   
		  method.invoke(list, "abc");
	
		  
		  
		  System.out.println(list);
	   }
}
