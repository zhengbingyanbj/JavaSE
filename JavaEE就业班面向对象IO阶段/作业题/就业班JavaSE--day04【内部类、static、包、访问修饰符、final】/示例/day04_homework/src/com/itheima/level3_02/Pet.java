package com.itheima.level3_02;
/*
  1. 定义抽象类宠物(Pet)
 		1. 属性： 名称：name
		2. 抽象方法: eat()
 		3. 提供带参构造和setXxx和getXxx方法
 */
public abstract class Pet {
//	姓名
	private String name;
//	抽象方法: eat()
	public abstract void eat();
//	提供带参构造和setXxx和getXxx方法
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
