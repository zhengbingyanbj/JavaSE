package com.itheima.level2_03;

/*
 9.定义动物园管理员类(ZooManager)
	a)属性:姓名(name),年龄(age)
	b)行为: 
	i.喂养动物(feed(Animal a)),调用吃的方法; 
		1.请思考此处为什么使用Animal作为参数类型而不是其子类
		2.在方法内部,调用a对象的eat方法
	ii.组织演出(letItShow(Actor a))
		1.请思考此处为什么使用Actor接口类型作为参数类型而不是其实现类
		2.在方法内部
			a)调用a的play方法
			b)如果是鹦鹉,把a向下转型为Parrot类型,调用说话方法
	c) 提供空参,有参构造方法与setters和getters方法 
 */
public class ZooManager {
//	a)属性:姓名(name),年龄(age)
	private String name;
	private int age;
//	b)行为: 
//	i.喂养动物(feed(Animal a)),调用吃的方法; 
//		1.请思考此处为什么使用Animal作为参数类型而不是其子类
//		2.在方法内部,调用a对象的eat方法
	public void feed(Animal a){
		a.eat();
	}
//	ii.组织演出(letItShow(Actor a))
//		1.请思考此处为什么使用Actor接口类型作为参数类型而不是其实现类
//		2.在方法内部
//			a)调用a的play方法
//			b)如果是鹦鹉,把a向下转型为Parrot类型,调用说话方法
	public void letItShow(Actor a){
//		a)调用a的play方法
		a.play();
//		b)如果是鹦鹉,把a向下转型为Parrot类型,调用说话方法
		if(a instanceof Parrot){
			Parrot p = (Parrot) a;
			p.say();
		}
	}
//	c) 提供空参,有参构造方法与setters和getters方法 
	public ZooManager() {
		super();
	}
	public ZooManager(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
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
}
