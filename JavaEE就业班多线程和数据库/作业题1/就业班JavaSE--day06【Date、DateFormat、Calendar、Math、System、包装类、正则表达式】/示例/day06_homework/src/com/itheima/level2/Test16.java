package com.itheima.level2;
/*
 请使用代码描述:
有一段文本 "  anglebaby  	女 	 18	  515151511  " 
分别描述一个人的姓名 性别 年龄(int) 和QQ号码信息,完成如下需求:
    1. 创建一个Person类,包含性别,性别,年龄和QQ号码属性,使用解析出来信息创建一个Person对象,并打印这个人信息
    2. 并判断QQ号是否合法,匹配规则,全部都是数字,第一位非0,长度为5到12位. 
   
1.在com.itheima.level2包中
2.创建Student类
	a)属性: 姓名(name),性别(sex),年龄(int age),QQ号码(qq)
	b)提供空参,有参构造方法以及setters与getters方法
	c)重写toString()方法,返回属性值
3.创建Test16类,在Test16类中:
	a)提供main方法,在main方法中
		i.定义字符串变量str,赋值为:"  anglebaby  	女 	 18	  515151511  "
		ii.取出字符str两端的空格,避免切割的时候,产生空字符串
		iii.使用”\\s+”正则表达式切割字符串,因为中间的空格可能包含制表符,多个空格
		iv.切割后,字符串数组0索引->姓名,1索引->性别,2索引->年龄,3索引->QQ号
		v.把年龄字符串转换int类型,赋值给变量age
		vi.使用满参构造创建Student对象s,传入对应的数据
		vii.打印学生s信息
		viii.判断该学生的QQ号码是否合法,如果合法输出QQ号码合法,否则输出QQ号码不合法
 */
public class Test16 {
	public static void main(String[] args) {
//		i.定义字符串变量str,赋值为:"  anglebaby  	女 	 18	  515151511  "
		String str = "  anglebaby  	女 	 18	  515151511  ";
//		ii.取出字符str两端的空格,避免切割的时候,产生空字符串
		str = str.trim();
//		iii.使用”\\s+”正则表达式切割字符串,因为中间的空格可能包含制表符,多个空格
		String[] strs = str.split("\\s+");
//		iv.切割后,字符串数组0索引->姓名,1索引->性别,2索引->年龄,3索引->QQ号
//		v.把年龄字符串转换int类型,赋值给变量age
		int age = Integer.parseInt(strs[2]);
//		vi.使用满参构造创建Student对象s,传入对应的数据
		Student s = new Student(strs[0], strs[1], age, strs[3]);
//		vii.打印学生s信息
		System.out.println(s);
//		并判断QQ号是否合法,匹配规则,全部都是数字,第一位非0,长度为5到12位. 
//		viii.判断该学生的QQ号码是否合法,如果合法输出QQ号码合法,否则输出QQ号码不合法
		if(s.getQq().matches("[1-9][0-9]{4,11}")){
			System.out.println("QQ号码合法");
		}else{
			System.out.println("QQ号码不合法");
		}
	}
}
