package com.itheima.level2_01;
/*
  请使用代码描述：
	100元诺基亚手机(Phone)可以打电话(call)和发短信(sendMessage)
	3000元的华为智能手机可以打电话,发短信和玩游戏(playGame)
	2000元的iPad 平板,可以听歌(listenMusic)和玩游戏.
	要求: 把手机的共性提取到父类中,特性的功能放到接口.  

1.定义玩游戏(PlayGame)接口
	a)声明抽象 playGame()
2.定义手机类(Phone)类
	a)属性: 品牌(brand),价格(price)
	b)功能: 
		i.打电话(call(String name))
			1.输出格式: 在使用100 元 诺基亚 手机 给 景甜 打电话
		ii.发短信(sendMessage(String name))
			1.输出格式: 在使用100 元 诺基亚 手机 给 景甜 发短信
	c)提供 空参,有参构造;setters和getters方法
3.定义智能手机(SmartPhone)类继承手机类(Phone),实现玩游戏接口(PlayGame())
	a)实现playGame()方法
		i.在使用3000元的 华为 手机玩游戏
	b)提供空参,有参构造
4.定义平板(Pad)类,实现PlayGame接口
	a)属性:品牌(brand),价格(price)
	b)成员方法
		i.实现playGame()方法
			1.输出格式: 在使用2000元的iPad平板玩游戏
		ii.特有方法: 听音乐(listenMusic)
			1.输出格式: 在使用2000元的iPad平板听音乐
	c)提供空参,有参构造,setters和getters方法
5.定义测试类Test
	a)创建手机对象 njy,品牌赋值为诺基亚,价格赋值为100
	b)调用手机对象 njy的打印电话和发短信功能,传入 景甜
	c)创建智能手机对象 sp,品牌赋值为华为,价格赋值为3000
	d)调用智能数据对象sp的打电话,发短信功能都传入林思意, 调用玩游戏功能
	e)创建平板对象 p,品牌赋值为iPad,价格赋值为2000
	f)调用平板p对象的听歌和玩游戏功能.

 */
public class Test {
	public static void main(String[] args) {
//		a)创建手机对象 njy,品牌赋值为诺基亚,价格赋值为100
		Phone njy = new Phone();
		njy.setBrand("诺基亚");
		njy.setPrice(100);
//		b)调用手机对象 njy的打印电话和发短信功能,传入 景甜
		njy.call("景甜");
		njy.sendMessage("景甜");
//		c)创建智能手机对象 sp,品牌赋值为华为,价格赋值为3000
		SmartPhone sp = new SmartPhone("华为", 2000);
//		d)调用智能数据对象sp的打电话,发短信功能都传入林思意, 调用玩游戏功能
		sp.call("林思意");
		sp.sendMessage("林思意");
		sp.playGame();
//		e)创建平板对象 p,品牌赋值为iPad,价格赋值为2000
		Pad p = new Pad("iPad", 2000);
//		f)调用平板p对象的听歌和玩游戏功能.
		p.listenMusic();
		p.playGame();
	}
}
