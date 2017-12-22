package cn.itcast.extendstest;

public class Zi extends Fu{
  
	
	int num = 20;
	
	public void show(){
		int num = 30;
		System.out.println(num);//30
		System.out.println(this.num);//20
		System.out.println(new Zi().num);
		System.out.println(super.num);//10  
		System.out.println(new Fu().num);
	}
}
