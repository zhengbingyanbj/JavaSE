package com.itheima.level03_02;
/* 
 请使用代码描述: 45岁的大男孩李晨有一个20岁的女友(范冰冰),李晨在逛街(和范冰冰) 
 
 操作步骤：
 	1. 定义Girl类
 		1. 属性： 名称：name,年龄 age
 		2. 提供带参构造和setXxx和getXxx方法
 	2. 定义Boy类
 		1. 属性： 名称：name,年龄：age，女友（girlFriend）
 		2. 行为： public void walking()
 	                    输出格式为： 45岁的大男孩李晨在和20岁的小女友范冰冰逛街 
 	    3. 提供满参构造和setXxx和getXxx方法
    3. 定义测试类Test
    	1. 提供main方法
    	2. 在main方法中
    	   1. 使用满参构造创建Gilr对象 girl,把name初始化为范冰冰，年龄初始化为20
    	   2. 使用满参构造创建Boy 对象 boy,把name初始化为李晨，年龄初始化为45，女友初始化为girl
    	   3. 调用boy的walking()方法
  
 */
public class Test {
	public static void main(String[] args) {
//		   1. 使用满参构造创建Gilr对象 girl,把name初始化为范冰冰，年龄初始化为20
		Girl girl = new Girl("范冰冰", 20);
//    	   2. 使用满参构造创建Boy 对象 boy,把name初始化为李晨，年龄初始化为45，女友初始化为girl
		Boy boy = new Boy("李晨", 45, girl);
//    	   3. 调用boy的walking()方法
		boy.walking();
	}
}
