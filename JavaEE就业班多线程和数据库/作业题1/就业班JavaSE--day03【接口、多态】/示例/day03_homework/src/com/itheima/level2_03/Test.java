package com.itheima.level2_03;
/*
 请用代码描述: 
	在动物园每一个动物都有颜色和年龄,都会吃
	所有老虎都吃肉,但是有的老虎会表演(钻火圈)
	所有的大猩猩都吃香蕉,但有大猩猩会表演(骑自行车)
	所有的鹦鹉都吃小米和说话,但是有的鹦鹉会表演(过跷跷板)
	在动物园中管理员有年龄和姓名,他会喂动物和组织会表演的动物进行演出,如果演出时鹦鹉,还会让鹦鹉说你好 
 
1.定义动物类(Animal)
	a)属性:颜色(color),年龄(age)
	b)抽象方法: 吃(eat)
	c)提供: 空参,带参构造;setters和getters方法
2.定义表演者接口(Actor)
	a)抽象方法: play()
3.定义老虎类(Tiger),继承动物类(Animal)
	a)实现抽象方法: 吃(eat)
		i.输出格式: 2岁的黄色老虎吃肉
	b)提供: 空参,带参构造;
4.定义会表演的老虎类(ActedTiger),继承老虎类(Tiger),实现表演者接口
	a)实现抽象方法表演(play)
		i.输出格式: 2岁的黄色老虎在表演钻火圈
	b)提供: 空参,带参构造;
5.定义大猩猩类(Gorilla),继承动物类(Animal)
	a)实现抽象方法: 吃(eat)
		i.输出格式: 3岁的黑色大猩猩吃香蕉
	b)提供: 空参,带参构造;
6.定义会表演的大猩猩(ActedGorilla),继承大猩猩类(Gorilla),实现表演者接口
	a)实现抽象方法表演(play)
		i.输出格式: 3岁的黑色大猩猩在表演骑自行车
	b)提供: 空参,带参构造;
7.定义鹦鹉类(Parrot),继承动物类(Animal)
	a)实现抽象方法: 吃(eat)
		i.输出格式: 1岁的绿色鹦鹉在吃小米
	b)特有方法: 说话(say)
		i.输出格式: 1岁的绿色鹦鹉在说你好
	c)提供: 空参,带参构造;
8.定义会会表演的鹦鹉类(ActedParrot),继承鹦鹉类(Parrot),实现表演者接口
	a)实现抽象方法表演(play)
		i.输出格式: 1岁的绿色鹦鹉在表演过跷跷板
	b)提供: 空参,带参构造;
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
10.定义测试类Test
	a)提供main方法
	b)在main方法
		i.创建会表演的老虎类(ActedTiger)对象t,把颜色赋值为黄色,年龄赋值为2
		ii.创建会表演的大猩猩(ActedGorilla)对象g,把颜色赋值黑色,年龄赋值为3
		iii.创建会表演的鹦鹉类(ActedParrot)对象 p,把颜色赋值为绿色,年龄赋值1
		iv.创建物园管理员类(ZooManager)对象zm,把名称赋值邓超,年龄赋值30
		1.调用zm对象的喂养动物(feed(Animal a))方法,分别传入t,g,p对象
		2.调用zm对象的组织表演(letItShow(Actor a))方法,分别传入t,g,p对象
 */
public class Test {
	public static void main(String[] args) {
//		i.创建会表演的老虎类(ActedTiger)对象t,把颜色赋值为黄色,年龄赋值为2
		ActedTiger t = new ActedTiger();
		t.setAge(2);
		t.setColor("黄色");
//		ii.创建会表演的大猩猩(ActedGorilla)对象g,把颜色赋值黑色,年龄赋值为3
		ActedGorilla g = new ActedGorilla();
		g.setAge(3);
		g.setColor("黑色");
//		iii.创建会表演的鹦鹉类(ActedParrot)对象 p,把颜色赋值为绿色,年龄赋值1
		ActedParrot p = new ActedParrot("绿色", 1);
//		iv.创建物园管理员类(ZooManager)对象zm,把名称赋值邓超,年龄赋值30
		ZooManager zm = new ZooManager("邓超", 30);
//		1.调用zm对象的喂养动物(feed(Animal a))方法,分别传入t,g,p对象
		zm.feed(t);
		zm.feed(g);
		zm.feed(p);
//		2.调用zm对象的组织表演(letItShow(Actor a))方法,分别传入t,g,p对象
		zm.letItShow(t);
		zm.letItShow(g);
		zm.letItShow(p);
	}
}
