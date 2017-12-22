package cn.itcast01.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
	public static void main(String[] args) throws FileNotFoundException{
		String s1 = "abc";
		String s2 = "xyz";
		
		FileReader  fr = new FileReader("a.txt");
	
		show(s1,s2);
		System.out.println(s1+"----"+s2);
	}

	public static void show(String s1,String s2){
		s1 = s2+s1+"Q"; 
		s2 = "W"+s1;   
	}
}
