package com.itheima.test01;

import java.io.File;

public class Test01_01 {

	public static void main(String[] args) {
		// 创建文件对象：绝对路径
		File f1 = new File("c:/aaa/a.txt");
		// 创建文件对象：相对路径
		File f2 = new File("c:/aaa/","a.txt");
	}

}
