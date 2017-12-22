package day16作业_Test1_6;

import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		//1.@Deprecated警告测试
		
		print();
	}
	@Deprecated
	public static void print(){
		System.out.println("此方法已过时!");
	}
}
