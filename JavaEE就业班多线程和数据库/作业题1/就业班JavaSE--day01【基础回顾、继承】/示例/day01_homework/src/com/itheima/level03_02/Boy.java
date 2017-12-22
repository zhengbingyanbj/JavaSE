package com.itheima.level03_02;

/*
  	2. 定义Boy类
 		1. 属性： 名称：name,年龄：age，女友（girlFriend）
 		2. 行为： public void walking()
 		        输出格式为： 45岁的大男孩李晨在和20岁的小女友范冰冰逛街 
 		3. 提供满参构造和setXxx和getXxx方法
 */
public class Boy {
//	名称
	private String name;
//	年龄
	private int age;
//	女友
	private Girl girlFriend;
	
//	逛街
	 public void walking(){
		 System.out.println(age+"岁的大男孩"+name+"在和"+girlFriend.getAge()+"岁的小女友"+girlFriend.getName()+"逛街 ");
	 }

//	 满参构造
	public Boy(String name, int age, Girl girlFriend) {
		this.name = name;
		this.age = age;
		this.girlFriend = girlFriend;
	}

//	setters和getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Girl getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(Girl girlFriend) {
		this.girlFriend = girlFriend;
	}
}
