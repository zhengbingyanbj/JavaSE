package com.itheima.constructor;
/*
 * ���䴴�������ݷ�ʽ
 * ǰ�� 
 * 	  �����߱��ղι��췽��
 * 	  �ղι��췽��Ȩ�ޱ�����public
 * 
 * 1.��ȡ�ֽ����ļ�����
 * 2.ͨ���ֽ����ļ�����ֱ�Ӵ�������
 * 		Class�� 
 * 			Object newInstance()
 */
public class Demo04_Constructor {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itheima.bean.Person");
		//��ݷ�ʽ��������
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
