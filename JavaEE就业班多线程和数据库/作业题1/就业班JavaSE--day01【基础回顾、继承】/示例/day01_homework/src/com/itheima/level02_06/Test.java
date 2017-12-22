package com.itheima.level02_06;

/*
     请用代码描述
	 棕色的Tom猫会吃和抓老鼠
	 白色的Jerry狗会吃和看家
	 要求: 把猫和狗的共性抽取到动物类中 
  
4.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.使用空参构造,创建Cat对象c
		ii.把c对象的成员name赋值为Tom
		iii.把c对象的成员color赋值为 棕色
		iv.调用c对象成员方法eat方法
		v.调用c对象的成员方法catchMouse()
		vi.使用空参构造,创建Dog对象 d
		vii.把d对象的成员name赋值为Jerry
		viii.把d对象的成员color赋值为 白色
		ix.调用d对象成员方法eat方法
		x.调用d对象成员方法 lookHome方法
 */
public class Test {
	public static void main(String[] args) {
//		i.使用空参构造,创建Cat对象c
		Cat c = new Cat();
//		ii.把c对象的成员name赋值为Tom
		c.name = "Tom";
//		iii.把c对象的成员color赋值为 棕色
		c.color = "棕色";
//		iv.调用c对象成员方法eat方法
		c.eat();
//		v.调用c对象的成员方法catchMouse()
		c.catchMouse();
//		vi.使用空参构造,创建Dog对象 d
		Dog d = new Dog();
//		vii.把d对象的成员name赋值为Jerry
		d.name = "Jerry";
//		viii.把d对象的成员color赋值为 白色
		d.color = "白色";
//		ix.调用d对象成员方法eat方法
		d.eat();
//		x.调用d对象成员方法 lookHome方法
		d.lookHome();
	}
}
