package com.itheima.level01_05;
/*
请用代码描述:
一只黄色的加菲猫和一条白色名称为洛洛的哈士奇狗
要求: 把猫和狗共性抽取到动物类中

1.定义动物类(Animal)
	a)成员变量 名称(name), 颜色(color)
	b)要求:成员变量私有,提供空参和有参的构造方法
2.定义猫类(Cat),继承Animal类
	a)提供空参,有参构造方法,在有参构造中调用父类的构造方法
3.定义狗类(Dog)
	a)成员变量: 品种(breed)
	b)提供空参,有参构造方法,在有参构造中调用父类的构造方法
4.创建测试类Test
	a)提供main方法
	b)在main方法中
		i.使用Cat类的带参构造创建猫对象 c
		ii.使用 Dog 类的带参构造创建狗对象 d
 */
public class Test {
	public static void main(String[] args) {
//		使用Cat类的带参构造创建猫对象 c
		Cat c = new Cat("加菲","黄色");
//		使用 Dog 类的带参构造创建狗对象 d
		Dog d = new Dog("洛洛", "白色", "哈士奇");
	}
}
