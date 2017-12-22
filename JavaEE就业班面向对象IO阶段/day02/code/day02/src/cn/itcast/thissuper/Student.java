package cn.itcast.thissuper;

public class Student extends Person{
     
	public Student(){
//		super();
		super("只要是个字符串就行");
		System.out.println("student 空参构造");
	}
}
