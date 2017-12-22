package com.itheima.level3_02;

/*
请使用代码描述:  
	所有的猫都有颜色和年龄,都会吃(吃鱼)和抓老鼠,但是有部猫会卖萌(actingCute)
	所有的狗都有颜色和年龄,都会吃(肯骨头)和看家,但有部分狗会卖萌(actingCute)
	去卖萌,会卖萌的猫和狗可以. (提示通过在测试类中的静态方法实现)
	去吃饭,所有动物都可以去(提示通过在测试类中的静态方法实现)
	
总体思路:
	1.把猫和狗都有属性和行为抽取到动物类中
	2.把卖萌的额外功能提取高接口中
实现步骤:
1.定义抽象动物类Animal
	a)属性: 颜色(Color) ,年龄(age)
	b)抽象方法: 吃(eat)
	c)提供:空参,有参构造方法,setters和getters 方法
2.定义接口卖萌接口(ActingCute)
	a)抽象方法: 卖萌(actingCute)
3.定义狗类(Dog)继承动物类(Animal)
	a)实现父类抽象吃(eat)方法
		i.输出格式: 2岁黑色的狗在肯骨头
	b)特有方法: 看家(lookHome)
		i.输出格式: 2岁黑色的狗在看家
	c)提供:空参,有参构造方法
4.定义会卖萌的狗类(ActingCuteDog) 继承狗类(Dog) 实现卖萌接口(ActingCute)
	a)实现接口中的卖萌方法:actingCute())
		i.输出格式: 2岁黑色的狗在装无辜
	b)提供:空参,有参构造方法
5.定义猫类(Cat) 继承动物类(Animal)
	a)实现父类的吃(eat)方法
		i.输出格式: 1岁白色的猫在吃鱼
	b)特有方法:抓老鼠
		i.输出格式: 1岁白色的猫在抓老鼠
	c)提供:空参,有参构造方法
6.定义会卖萌的猫类(ActingCuteCat) 继承猫类(Cat) 实现卖萌接口(ActionCute)
	a)实现接口中的卖萌方法:actingCute())
		i.输出格式: 1岁白色的猫在扮可怜
	b)提供:空参,有参构造方法
7.定义测试类(Test)
	a)定义静态方法 去卖萌(goToActingCute(ActingCute ac))
		i.在方法中:调用卖萌方法
	   ii.如果传入的猫就调用猫的抓老鼠方法
      iii.如果传入的狗就调用狗的看家方法
	b)定义静态方法 去吃饭(goToEat(Animal a))
		i.在方法中:调用吃方法
		ii.如果传入的猫就调用猫的抓老鼠方法
        iii.如果传入的狗就调用狗的看家方法
	c)定义main方法
	d)在main方法中
		i.创建狗对象d,颜色赋值花色,年龄赋值3
		ii.创建会卖萌的狗对象 ad,颜色赋值为黑色,年龄赋值2
		iii.创建猫对象c,颜色赋值为蓝色,年龄赋值为4
		iv.创建会卖萌的猫对象,ac,颜色赋值白色,年龄赋值为1
		v.调用4次去吃饭方法,分别传入对象d,ad,c,ac
		vi.调用2次去卖萌方法,分别传入ad,ac
		vii.调用2次去卖萌方法,分别传入d,c; 这里调用编译会通过吗? 思考为什么?
 */
public class Test {
//	a)定义静态方法 去卖萌(goToActingCute(ActingCute ac))
	public static void goToActingCute(ActingCute ac){
//		i.在方法中:调用吃方法
		ac.actingCute();
//		ii.如果传入的猫就调用猫的抓老鼠方法
		if(ac instanceof Cat){
			Cat c = (Cat) ac;
			c.catchMouse();
		}
//      iii.如果传入的狗就调用狗的看家方法
		if(ac instanceof Dog){
			Dog d = (Dog) ac;
			d.lookHome();
		}
	}
//	b)定义静态方法 去吃饭(goToEat(Animal a))
	public static void goToEat(Animal a){
//		i.在方法中:调用吃方法
		a.eat();
//		ii.如果传入的猫就调用猫的抓老鼠方法
		if(a instanceof Cat){
			Cat c = (Cat) a;
			c.catchMouse();
		}
//      iii.如果传入的狗就调用狗的看家方法
		if(a instanceof Dog){
			Dog d = (Dog) a;
			d.lookHome();
		}
	}
//	c)定义main方法
	public static void main(String[] args) {
//		i.创建狗对象d,颜色赋值花色,年龄赋值3
		Dog d = new Dog("花色", 3);
//		ii.创建会卖萌的狗对象 ad,颜色赋值为黑色,年龄赋值2
		ActingCuteDog ad = new ActingCuteDog("黑色", 2);
//		iii.创建猫对象c,颜色赋值为蓝色,年龄赋值为4
		Cat c = new Cat();
		c.setAge(4);
		c.setColor("蓝色");
//		iv.创建会卖萌的猫对象,ac,颜色赋值白色,年龄赋值为1
		ActingCuteCat ac = new ActingCuteCat();
		ac.setAge(1);
		ac.setColor("白色");
//		v.调用4次去吃饭方法,分别传入对象d,ad,c,ac
		goToEat(d);
		goToEat(ad);
		goToEat(c);
		goToEat(ac);
//		vi.调用2次去卖萌方法,分别传入ad,ac
		goToActingCute(ad);
		goToActingCute(ac);
//		vii.调用2次去卖萌方法,分别传入d,c; 这里调用编译会通过吗? 思考为什么?
//		goToActingCute(c); //编译失败 只有实现卖萌接口的类的对象,才可以作为参数传入.
//		goToActingCute(d); //编译失败 
	}
}
