package com.itheima.level2_04;
/*
 1.定义抽象类(Employee)
	a)属性: 工号(id),姓名(name)
	b)行为: 抽象方法work()
	c)要求: 提供setters和gettters方法
2.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.使用匿名内部类创建Employee的子类对象 e;并重写work()方法
			1.输出格式:工号为001的员工范冰冰在努力的敲代码
		ii.使用setXxx方法给e的工号和名称赋值
		iii.调用e的work()方法
 */
public class Test {
	public static void main(String[] args) {
//		i.使用匿名内部类创建Employee的子类对象 e;并重写work()方法
//			1.输出格式:工号为001的员工范冰冰在努力的敲代码
		Employee e = new Employee() {
			public void work() {
				System.out.println("工号为"+getId()+"的员工"+getName()+"在努力的敲代码");
			}
		};
//		ii.使用setXxx方法给e的工号和名称赋值
		e.setId("001");
		e.setName("范冰冰");
//		iii.调用e的work()方法
		e.work();
		
	}
}
