package com.itheima.test01;

public class Test01_09 {

	public static void main(String[] args) {
		int result = sum(100);
		System.out.println(result);
	}
	// �ݹ���ͷ���
	public static int sum(int num) {
		// �ݹ����
		if(num == 1) return 1;
		return num + sum(num - 1);
	}

}
