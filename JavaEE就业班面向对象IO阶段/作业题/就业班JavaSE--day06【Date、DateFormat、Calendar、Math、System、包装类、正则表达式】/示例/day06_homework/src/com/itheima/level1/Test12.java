package com.itheima.level1;
import java.util.Scanner;

/*
��дһ��У���û����ĳ���,������¼����û����Ƿ�Ϸ�
Ҫ��:������Ӣ�Ŀ�ͷ,ֻ�ܰ���Ӣ��,���ֺ�`_`;����6λ,����12λ	

1.��com.itheima.level1�д���Test12��
2.��Test12�����ṩmain����,��main������
	a)��������¼�����
	b)�����û�¼����û����ַ���
	c)�����ַ�����matches����,�ж��û����Ƿ�Ϸ�
	d)����Ϸ��ʹ�ӡ: �û����Ϸ�
	e)������Ϸ��ʹ�ӡ: �û������Ϸ�
	 
 */
public class Test12 {
	public static void main(String[] args) {
//		a)��������¼�����
		Scanner sc = new Scanner(System.in);
//		b)�����û�¼����û����ַ���
		System.out.println("��¼���½�û���");
		String userName = sc.nextLine();
//		c)�����ַ�����matches����,�ж��û����Ƿ�Ϸ�
//		������Ӣ�Ŀ�ͷ,ֻ�ܰ���Ӣ��,���ֺ�`_`;����6λ,����12λ	
		if(userName.matches("[a-zA-Z]\\w{5,11}")){
//		d)����Ϸ��ʹ�ӡ: �û����Ϸ�
			System.out.println("�û����Ϸ�");
		}else{
//		e)������Ϸ��ʹ�ӡ: �û������Ϸ�
			System.out.println("�û������Ϸ�");
		}
	}
}
