package com.itheima.level3_02;

/*
  1. ������������(Pet)
 		1. ���ԣ� ���ƣ�name
		2. ���󷽷�: eat()
 		3. �ṩ���ι����setXxx��getXxx����
   2. ���������Test
    	1. �ṩmain����
    	2. ��main������
    	   1. ʹ�������ڲ�������Pet�ղι���,��������p1
           2. �������ڲ�������дeat()����,�����ʽ: ����1��Tom�ڳ���,
           3. ��p1��name��ֵΪTom
		   4. ����p1��eat()����
		   5. ʹ�������ڲ���,����Pet���вι���,��������
			  a)��дeat()����,���: ����2 С���ڿϹ�ͷ
			  b)ʹ�ø������������eat()����
 */

public class Test {
     public static void main(String[] args) {
//     1. ʹ�������ڲ�������Pet�ղι���,��������p1
       Pet p1 =	new Pet() {
//		 2. �������ڲ�������дeat()����,�����ʽ: ����1��Tom�ڳ���,
	    	   		public void eat() {
						System.out.println("����1��"+getName()+"�ڳ���,");
					}
			    };
//     3. ��p1��name��ֵΪTom
	   p1.setName("Tom");
//	   4. ����p1��eat()����
	   p1.eat();
//	   5. ʹ�������ڲ���,����Pet���вι���,��������,���Ƹ�ֵΪС��
	   new Pet("С��") {
//		  a)��дeat()����,���: ����2 С���ڿϹ�ͷ
			public void eat() {
				System.out.println(" ����2 "+getName()+"�ڿϹ�ͷ");
			}
//	    b)ʹ�ø������������eat()����
	   }.eat();
	}
}
