package com.itheima.level03_02;
/* 
 ��ʹ�ô�������: 45��Ĵ��к����һ��20���Ů��(������),��ڹ��(�ͷ�����) 
 
 �������裺
 	1. ����Girl��
 		1. ���ԣ� ���ƣ�name,���� age
 		2. �ṩ���ι����setXxx��getXxx����
 	2. ����Boy��
 		1. ���ԣ� ���ƣ�name,���䣺age��Ů�ѣ�girlFriend��
 		2. ��Ϊ�� public void walking()
 	                    �����ʽΪ�� 45��Ĵ��к���ں�20���СŮ�ѷ�������� 
 	    3. �ṩ���ι����setXxx��getXxx����
    3. ���������Test
    	1. �ṩmain����
    	2. ��main������
    	   1. ʹ�����ι��촴��Gilr���� girl,��name��ʼ��Ϊ�������������ʼ��Ϊ20
    	   2. ʹ�����ι��촴��Boy ���� boy,��name��ʼ��Ϊ��������ʼ��Ϊ45��Ů�ѳ�ʼ��Ϊgirl
    	   3. ����boy��walking()����
  
 */
public class Test {
	public static void main(String[] args) {
//		   1. ʹ�����ι��촴��Gilr���� girl,��name��ʼ��Ϊ�������������ʼ��Ϊ20
		Girl girl = new Girl("������", 20);
//    	   2. ʹ�����ι��촴��Boy ���� boy,��name��ʼ��Ϊ��������ʼ��Ϊ45��Ů�ѳ�ʼ��Ϊgirl
		Boy boy = new Boy("�", 45, girl);
//    	   3. ����boy��walking()����
		boy.walking();
	}
}
