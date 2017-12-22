package com.itheima.level02_06;

/*
 请用代码描述： 
	20岁1.75米的男孩慕容紫英有一个18岁1.6米瓜子脸女朋友欧阳青青
	欧阳青青在洗一件白色的李宁牌子的衣服
	慕容紫英去散步(和欧阳青青)
	慕容紫英用带有阳刚之气的声音对欧阳青青说:我会守护你一生一世
	欧阳青青微笑着用于甜美的声音对慕容紫英说:有你在我就安心.
	要求: 男孩和女孩的共有成员提取到人类中,使用抽象类和抽象方法 

1.定义衣服类(Clothes)
	a)成员变量:
		i.颜色(color)
		ii.品牌(brand)
	b)提供 无参,带参构造和setXxx和getXxx方法
2.抽象类(Person)
	a)成员变量
		i.姓名 name
		ii.年龄 age
		iii.身高 height
	b)成员方法
	i.抽象方法  void say(String content)
	c)要求
		i.提供无参和带参构造
		ii.提供setXxx和getXxx方法
3. 定义Girl类继承Person类
	a)成员变量
		i.脸型(String face)
	b)成员方法: 
		i.重写父类的  void say(String content) 方法
			1.输出格式: 欧阳青青微笑着用于甜美的声音对慕容紫英说:有你在我就安心.
		ii.特有方法: 洗衣服 wash(Clothes c) 
			输出格式: 欧阳青青在洗一件白色的李宁牌子的衣服
	c)要求:
		i.提供无参和带参构造
		ii.提供setXxx和getXxx方法
4.定义Boy类继承Person类
	a)成员变量
		i.女朋友 (girlFriend)
	b)成员方法: 
		i.重写父类的  void say(String content) 方法
			输出格式:容紫英用带有阳刚之气的声音对欧阳青青说:我会守护你一生一世
		ii.特有方法: 散步 walking() 
		输出格式: 慕容紫英和欧阳青青在河边的林荫小道上手牵着手散步
	c)要求:
		i.提供无参和带参构造
		iii.提供setXxx和getXxx方法
5.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.创建衣服对象 c,品牌初始化为李宁,颜色初始化为白色
		ii.创建女孩对象 girl,姓名赋值为欧阳青青,年龄赋值为18,身高赋值为1.6,脸型赋值为瓜子脸
		iii.创建男孩对象 boy,姓名赋值为慕容紫英,年龄赋值以为20,身高赋值1.75,女朋友赋值为girl
		iv.调用对象girl的洗衣服方法
		v.调用对象boy的散步方法
		vi.调用对象boy的说话方法,传入:我会守护你一生一世.
		vii.调用对象 girl 的说话方法,传入: 有你在我就安心.
 */
public class Test {
	public static void main(String[] args) {
//	i.创建衣服对象 c,品牌初始化为李宁,颜色初始化为白色
		Clothes c = new Clothes("白色", "李宁");
//	ii.创建女孩对象 girl,姓名赋值为欧阳青青,年龄赋值为18,身高赋值为1.6,脸型赋值为瓜子脸
		Girl girl = new Girl("欧阳青青", 18, 1.6, "瓜子脸");
//	iii.创建男孩对象 boy,姓名赋值为慕容紫英,年龄赋值以为20,身高赋值1.75,女朋友赋值为girl
		Boy boy = new Boy("慕容紫英", 20, 1.75, girl);
//	iv.调用对象girl的洗衣服方法
		girl.wash(c);
//	v.调用对象boy的散步方法
		boy.walking();
//	vi.调用对象boy的说话方法,传入:我会守护你一生一世
		boy.say("我会守护你一生一世.");
//	vii.调用对象 girl 的说话方法,传入: 有你在我就安心.
		girl.say("有你在我就安心.");
	}
}
