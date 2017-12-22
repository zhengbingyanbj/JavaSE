package com.itheima.level03_03;

/*
  请使用代码描述
	18岁的服务员景甜,会说话,上菜
	30岁的厨师秦俊杰,会说话,炒菜
          要求: 把服务员类和厨师类的共性抽取到员工类中

操作步骤描述
 	1. 定义Employee类
 		1. 属性： 名称：name,年龄 age
        2. 行为： 说话（say）
                              输出格式： 18岁的员工景甜在说话
 		3. 要求： 成员变量不加权限private 
 	2. 定义Waiter类,继承Employee类
 		1. 行为： 上菜 public void serving()
 		    输出格式为： 18岁的服务员景甜正在上菜
    3. 定义Chef类,继承Employee类
 		1. 行为：  炒菜  public void cooking() 
 		    输出格式为： 30岁的厨师秦俊杰正在炒菜
    4. 定义测试类Test
    	1. 提供main方法
    	2. 在main方法中
    	   1. 使用Waiter的空参构造创建对象 w
           2. 给对象w的name赋值为景甜
           3. 给对象w的age赋值为18
    	   4. 调用对象w的说话方法
           5.  调用对象w的上菜方法
           6. 使用Chef的空参构造创建对象 c
           7. 给对象c的name赋值为秦俊杰
           8. 给对象c的age赋值为30
    	   9. 调用对象c的说话方法
          10.  调用对象c的炒菜方法
 */
public class Test {
	public static void main(String[] args) {
//		   1. 使用Waiter的空参构造创建对象 w
		Waiter w = new Waiter();
//         2. 给对象w的name赋值为景甜
		w.name = "景甜";
//         3. 给对象w的age赋值为18
		w.age = 18;
//    	   4. 调用对象w的说话方法
		w.say();
//         5.  调用对象w的上菜方法
		w.serving();
//         6. 使用Chef的空参构造创建对象 c
		Chef c = new Chef();
//         7. 给对象c的name赋值为秦俊杰
		c.name = "秦俊杰";
//         8. 给对象c的age赋值为30
		c.age = 18;
//    	   9. 调用对象c的说话方法
		c.say();
//         10.  调用对象c的炒菜方法
		c.cooking();
	}
}
