package com.itheima.level02_05;
/*
 请使用代码描述
	在动物园中有多种动物,每种动物都年龄和腿的个数,按吃的不同分为食肉动物和食草动物
	食肉动物: 有老虎,啄木鸟
	食草动物: 有长颈鹿,兔子
	吃的东西:
		老虎: 年龄为 2的4条腿的老虎在吃羊
 	       啄木鸟:  年龄为 1岁的2条腿的啄木鸟的在吃昆虫
	      长颈鹿:  年龄为 3 岁的4条腿的长颈鹿在吃树叶
	          兔子: 年龄为 1岁的四条腿的兔子在吃狗尾草

继承关系如下
     食肉类动物(Carnivore)和食草类动物(Herbivore)继承自动物类(Animal)
     老虎(Tiger)和啄木鸟(Pecker)继承食肉类动物(Carnivore)
     长颈鹿(Giraffe)和兔子(Rabbit)继承食草动物(Herbivore)
二.代码实现步骤
1.定义抽象类动物类(Animal)
	a)成员变量:年龄(age),腿的个数(numOfLegs)
	b)抽象方法: void eat()
	c)提供空参和有参构造方法和setXxx和getXxx方法
2.定义抽象类食肉类动物(Carnivore)继承自动物类(Animal)
	a)提供空参和有参构造方法
3.定义抽象类食草类动物(Herbivore)继承自动物类(Animal)
	a)提供空参和有参构造方法
4.定义老虎类(Tiger)继承食肉类动物(Carnivore)
	a)重写eat()方法
		i.输出格式: 年龄为 2的4条腿的老虎在吃羊
	b)提供空参和有参构造方法
5.定义啄木鸟(Pecker)继承食肉类动物(Carnivore)
	a)重写eat()方法
		i.输出格式: 年龄为 1岁的2条腿的啄木鸟的在吃昆虫
	b)提供空参和有参构造方法
6.定义长颈鹿(Giraffe)继承食草动物(Herbivore)
	a)重写eat()方法
		i.输出格式: 年龄为 3 岁的4条腿的长颈鹿在吃树叶
	b)提供空参和有参构造方法
7.定义兔子(Rabbit)继承食草动物(Herbivore)
	a)重写eat()方法
		i.输出格式: 年龄为 1岁的四条腿的兔子在吃狗尾草
	b)提供空参和有参构造方法
8.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.创建老虎对象 t,年龄赋值为2,腿的个数赋值为4;调用老虎对象t的eat()方法
		ii.创建啄木鸟对象 p,年龄赋值为1,腿的个数赋值为2;调用啄木鸟对象p的eat()方法
		iii.创建长颈鹿对象 g,年龄赋值为3,腿的个数赋值为4;调用长颈鹿对象g的eat()方法
		iv.创建兔子对象 r,年龄赋值为1,,腿的个数赋值为4;调用兔子对象r的eat()方法
 */
public class Test {
	public static void main(String[] args) {
//	i.创建老虎对象 t,年龄赋值为2,腿的个数赋值为4;调用老虎对象t的eat()方法
		Tiger t = new Tiger(2, 4);
		t.eat();
//	ii.创建啄木鸟对象 p,年龄赋值为1,腿的个数赋值为2;调用啄木鸟对象p的eat()方法
		Pecker p = new Pecker(1, 2);
		p.eat();
//	iii.创建长颈鹿对象 g,年龄赋值为3,腿的个数赋值为4;调用长颈鹿对象g的eat()方法
		Giraffe g = new Giraffe(3, 4);
		g.eat();
//	iv.创建兔子对象 r,年龄赋值为1,,腿的个数赋值为4;调用兔子对象r的eat()方法
		Rabbit r = new Rabbit(1,4);
		r.eat();
	}
}
