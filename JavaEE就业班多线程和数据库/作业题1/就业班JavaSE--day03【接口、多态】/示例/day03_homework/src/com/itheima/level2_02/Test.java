package com.itheima.level2_02;

/*
请使用代码描述:  
	所有的学生都有年龄和姓名,都会吃饭(学生餐)和学习,但是有部分学生会打篮球
	所有的老师都有年龄和姓名,都会吃饭(工作餐)和讲课,但有部分老师会打篮球
	去打篮球,会打篮球的老师和学生可以. (提示通过在测试类中的静态方法实现)
	去食堂吃饭,所有人都可以去(提示通过在测试类中的静态方法实现) 
 
1.定义抽象人类(Person)
	a)属性: 姓名(name),年龄(age)
	b)抽象方法: eat()
	c)提供:无参,有参构造方法和setters和getters方法
2.定义运动接口(Sport)
	a)抽象方法: playBasketball
3.定义老师类(Teacher)继承Person类
	a) 成员方法:: 实现抽象方法eat()
		i.输出格式: 年龄为30岁周晓斌老师,正在吃工作餐
	b)提供: 无参,有参构造方法

4.定义运动老师类(SportTeacher)继承老师类(Teacher)实现运动接口
	a)成员方法: 实现playBasketball的抽象方法
		i.输出格式: 年龄为30岁 周晓斌 老师在打篮球
	b)提供: 无参,有参构造方法
5.定义学生类(Student),继承人类(Person)
	a)成员方法:现抽象方法eat()
		i.输出格式: 年龄18岁的 叶知秋 在吃学生餐
	b)提供: 无参,有参构造方法
6.定义运动学生类(SportStudent类),继承Student类,实现Sport接口
	a)成员方法: 实现playBasketball的抽象方法
		i.输出格式: 年龄为18岁 叶知秋 学生在打篮球
	b)提供: 无参,有参构造方法
7.定义测试类Test
	a)提供静态方法去运动goToSport(Sport  s) ,在方法中调用s的打篮球功能
	b)提供静态方法去餐馆goToRestaurant(Person p),在方法中调用p对象的吃方法
	c)提供main方法
	d)在main方法中
		i.创建运动老师对象sp,年龄赋值为30,姓名赋值为周晓斌
			i.思考这里为什么要传入Sport接口类型
		ii.创建运动学生对象ss,年龄赋值为18,姓名赋值为叶知秋
			i.思考这里为什么要传入顶层父类类型
		iii.调用去运动goToSport方法传入对象sp
		iv.调用去运动goToSport方法,传入对象ss
		v.调用去食堂gotToRestaurant方法,传入sp
		vi.调用去食堂goToRestaurant方法,传入ss
 */
public class Test {
//	a)提供静态方法去运动goToSport(Sport  s) ,在方法中调用s的打篮球功能
	public static void goToSport(Sport  s){
		s.playBasketball();
	}
//	b)提供静态方法去餐馆goToRestaurant(Person p),在方法中调用p对象的吃方法
	public static void goToRestaurant(Person p){
		p.eat();
	}
//	main方法
	public static void main(String[] args) {
//		i.创建运动老师对象sp,年龄赋值为30,姓名赋值为周晓斌
		SportTeacher sp = new SportTeacher();
		sp.setAge(30);
		sp.setName("周晓斌");
//		ii.创建运动学生对象ss,年龄赋值为18,姓名赋值为叶知秋
		SportStudent ss = new SportStudent("叶知秋", 18);
//		iii.调用去运动goToSport方法传入对象sp
		goToSport(sp);
//		iv.调用去运动goToSport方法,传入对象ss
		goToSport(ss);
//		v.调用去食堂gotToRestaurant方法,传入sp
		goToRestaurant(sp);
//		vi.调用去食堂goToRestaurant方法,传入ss
		goToRestaurant(ss);
	}
}
