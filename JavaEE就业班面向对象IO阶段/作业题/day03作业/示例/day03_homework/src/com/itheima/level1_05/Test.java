package com.itheima.level1_05;

/*
请使用代码描述：
	使用6000元的雷神电脑,编程和玩游戏
	使用3000元的华为手机打电话和玩游戏
 
1.定义玩游戏(PlayGame)接口
	a)声明抽象 playGame()
2.定义手机类(Phone)类,实现玩游戏(PlayGame)接口
	a)属性: 品牌(brand),价格(price)
	b)功能: 
		i.特有功能: 打电话(call())
			1.输出格式: 在使用3000 元 华为手机打电话
		ii.实现接口功能: 玩游戏()
			1.输出格式: 在使用3000 元 华为手机发短信
	c)提供 空参,有参构造;setters和getters方法
3.定义电脑(Computer)类实现玩游戏接口(PlayGame())
	a)属性: 品牌(brand)和价格(price)
	b)功能:
		i.实现playGame()方法
			1.输出格式: 使用6000元的雷神电脑玩游戏
		ii.特有功能: 编码(coding)
			1.输出格式: 使用6000元的雷神电脑开发JavaEE应用
	c)提供空参,有参构造
4.定义测试类Test
	a)定义main方法
	b)在main方法中
		i.创建手机对象 p,品牌赋值为华为,价格赋值为3000
		ii.调用手机对象 p的玩游戏功能
		iii.调用手机对象 p的打电话功能
		iv.创建电脑对象 c,品牌赋值为雷神,价格赋值为6000
		v.调用电脑对象c的玩游戏功能
		vi.调用电脑对象c的编程功能
 
 */
public class Test {
	public static void main(String[] args) {
//		i.创建手机对象 p,品牌赋值为华为,价格赋值为3000
		Phone p = new Phone("华为", 3000);
//		ii.调用手机对象 p的玩游戏功能
		p.playGame();
//		iii.调用手机对象 p的打电话功能
		p.call();
//		iv.创建电脑对象 c,品牌赋值为雷神,价格赋值为6000
		Computer c = new Computer("雷神", 6000);
//		v.调用电脑对象c的玩游戏功能
		c.playGame();
//		vi.调用电脑对象c的编程功能
		c.coding();
	}
}
