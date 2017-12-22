package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_03 {

	public static void main(String[] args) throws IOException {
		// 创建文件对象
		File f = new File("c:/bbb");
		// 创建文件夹
		f.mkdir();
	}

}
