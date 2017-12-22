package com.itheima.level3_02;

/*
  1. 定义抽象类宠物(Pet)
 		1. 属性： 名称：name
		2. 抽象方法: eat()
 		3. 提供带参构造和setXxx和getXxx方法
   2. 定义测试类Test
    	1. 提供main方法
    	2. 在main方法中
    	   1. 使用匿名内部类利用Pet空参构造,创建对象p1
           2. 在匿名内部类中重写eat()方法,输出格式: 宠物1叫Tom在吃鱼,
           3. 把p1的name赋值为Tom
		   4. 调用p1的eat()方法
		   5. 使用匿名内部类,利用Pet的有参构造,创建对象
			  a)重写eat()方法,输出: 宠物2 小黑在肯骨头
			  b)使用该匿名对象调用eat()方法
 */

public class Test {
     public static void main(String[] args) {
//     1. 使用匿名内部类利用Pet空参构造,创建对象p1
       Pet p1 =	new Pet() {
//		 2. 在匿名内部类中重写eat()方法,输出格式: 宠物1叫Tom在吃鱼,
	    	   		public void eat() {
						System.out.println("宠物1叫"+getName()+"在吃鱼,");
					}
			    };
//     3. 把p1的name赋值为Tom
	   p1.setName("Tom");
//	   4. 调用p1的eat()方法
	   p1.eat();
//	   5. 使用匿名内部类,利用Pet的有参构造,创建对象,名称赋值为小黑
	   new Pet("小黑") {
//		  a)重写eat()方法,输出: 宠物2 小黑在肯骨头
			public void eat() {
				System.out.println(" 宠物2 "+getName()+"在肯骨头");
			}
//	    b)使用该匿名对象调用eat()方法
	   }.eat();
	}
}
