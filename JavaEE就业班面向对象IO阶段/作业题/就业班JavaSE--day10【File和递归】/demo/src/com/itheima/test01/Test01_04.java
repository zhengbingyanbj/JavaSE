package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_04 {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File f = new File("c:/ccc/bbb/aaa");
		// �����༶�ļ���
		f.mkdirs();
	}

}
