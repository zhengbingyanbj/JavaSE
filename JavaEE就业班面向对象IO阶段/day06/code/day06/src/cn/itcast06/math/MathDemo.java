package cn.itcast06.math;
/*
 * Math常用方法
 */
public class MathDemo {
   public static void main(String[] args) {
	   //abs绝对值
	   System.out.println(Math.abs(-3.14));
	   //ceil 向上取整
	   System.out.println(Math.ceil(3.99));
	   System.out.println(Math.ceil(3.111));
	   System.out.println(Math.ceil(-3));
	   //floor  向下取整
	   System.out.println(Math.floor(3.5));
	   System.out.println(Math.floor(-3.5));
	   //max  min
	   System.out.println(Math.max(2, 5));
	   System.out.println(Math.min(2, 5));
	   // pow a的b次幂
	   System.out.println(Math.pow(3, 4));
	   
	   //round  四舍五入
	   System.out.println(Math.round(3.6));
	   System.out.println(Math.round(3.49999999));
	   
	   //random随机数   [0.0,1.0)
	   System.out.println(Math.random());
	   
	   // 1~10  整数
	   // Math.random()*10   [0.0,10.0)
	   // Math.random()*10+1  [1.0,10.9999999999....]   
	   // (int)(Math.random()*10+1)
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
