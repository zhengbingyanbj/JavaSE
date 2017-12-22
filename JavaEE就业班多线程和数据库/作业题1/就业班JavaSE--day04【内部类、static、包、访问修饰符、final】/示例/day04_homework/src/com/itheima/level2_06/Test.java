package com.itheima.level2_06;
/*
 请用代码描述： 
某高校举成立一个大球俱乐部,只要是会打篮球,踢足球,打排球的可以参加.
要求: 使用到接口,接口作为参数,匿名内部类.
提示: 把打篮球,踢足球,打排球功能抽取到接口中 ,在测试类中提供加入俱乐部的静态方法,参数为接口类; 

1.定义接口(Player)
	a)抽象方法: 打篮球(playBasketball),踢足球(playFootball),打排球(playVolleyball)
2.定义测试类Test
	a)定义静态方法:进入运行会(join(Player p)),在方法中调用p的 打篮球,踢足球,打排球 方法
	b)提供main方法
		c)在main方法中
		i.调用join(Player p),传入使用Player 接口的匿名内部类创建的匿名对象; 
		ii.在匿名内部类中
			1.重写playBasketball()方法
				a)输出: 在打篮球
			2.重写playFootball()方法
				a)输出: 在踢足球
			3.重写playVolleyball()方法
				a)输出: 在打排球
 */
public class Test {
//	a)定义静态方法:进入运行会(join(Player p)),在方法中调用p的 打篮球,踢足球,打排球 方法
	public static void join(Player p){
		p.playBasketball();
		p.playFootball();
		p.playVolleyball();
	}
	
	public static void main(String[] args) {
//		i.调用join(Player p),传入使用Player 接口的匿名内部类创建的匿名对象; 
		join(new Player() {
//			ii.在匿名内部类中
//			1.重写playBasketball()方法
//				a)输出: 在打篮球
		   public void playBasketball() {
			   System.out.println("打篮球");
			}
//			2.重写playFootball()方法
//				a)输出: 在踢足球
			public void playFootball() {
				System.out.println("踢足球");
			}
//			3.重写playVolleyball()方法
//				a)输出: 在打排球
	
			public void playVolleyball() {
				System.out.println("打排球");
			}
		});
	}
}
