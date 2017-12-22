package cn.itcast01.staticcode;
/*
 * 它优先于主方法执行、
 * 
 * 优先于(构造代码块)构造方法执行，
 * 
 *  当以任意形式第一次使用到该类时执行。
 */
public class StaticCode {
   
	static int num;
	
	public StaticCode(){
		System.out.println("staticCode构造");
	}
	
	static{
		num = 20;
		System.out.println("StaticCode静态代码块");
	}
	
	public static void main(String[] args) {
		System.out.println("StaticCode的主方法");
	}
}
