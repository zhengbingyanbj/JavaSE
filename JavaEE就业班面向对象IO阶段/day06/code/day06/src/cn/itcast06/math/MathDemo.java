package cn.itcast06.math;
/*
 * Math���÷���
 */
public class MathDemo {
   public static void main(String[] args) {
	   //abs����ֵ
	   System.out.println(Math.abs(-3.14));
	   //ceil ����ȡ��
	   System.out.println(Math.ceil(3.99));
	   System.out.println(Math.ceil(3.111));
	   System.out.println(Math.ceil(-3));
	   //floor  ����ȡ��
	   System.out.println(Math.floor(3.5));
	   System.out.println(Math.floor(-3.5));
	   //max  min
	   System.out.println(Math.max(2, 5));
	   System.out.println(Math.min(2, 5));
	   // pow a��b����
	   System.out.println(Math.pow(3, 4));
	   
	   //round  ��������
	   System.out.println(Math.round(3.6));
	   System.out.println(Math.round(3.49999999));
	   
	   //random�����   [0.0,1.0)
	   System.out.println(Math.random());
	   
	   // 1~10  ����
	   // Math.random()*10   [0.0,10.0)
	   // Math.random()*10+1  [1.0,10.9999999999....]   
	   // (int)(Math.random()*10+1)
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
