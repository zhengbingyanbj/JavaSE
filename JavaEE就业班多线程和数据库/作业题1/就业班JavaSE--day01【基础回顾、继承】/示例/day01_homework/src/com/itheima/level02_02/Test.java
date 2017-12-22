package com.itheima.level02_02;

/*
  请用代码描述: 周杰伦正在演唱菊花台歌曲(使用匿名对象)


2.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.使用带参构造创建Person对象,把name赋值为周杰伦
		ii.使用上面创建的匿名对象调用唱歌的方法;唱歌的方法输出格式为
		 	周杰伦正在演唱菊花台歌曲
 */
public class Test {
//	提供main方法
	public static void main(String[] args) {
//		i.使用带参构造创建Person对象,把name赋值为周杰伦
//		ii.使用上面创建的匿名对象调用唱歌的方法;
		new Person("周杰伦").sing("菊花台");
	}
}
