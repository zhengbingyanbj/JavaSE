package cn.itcast03.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���Ϸ��� ����
 * 
 *     �ô�
 *       1�����������쳣 ��ǰ�������ڱ���������
 *       2��û�л�ɫ������
 *       3��������ǿ��ת��������ת�ͣ�
 */
public class GenericDemo2 {
       public static void main(String[] args) {
    	   //��������
		   Collection<String> coll = new ArrayList<String>(); 
           //���Ԫ��
		   coll.add("�����꺽");
		   coll.add("Ф��������");
		   coll.add("��³��˹����");
		   
		  
		   for (String s : coll) {
			  System.out.println(s);
			  System.out.println(s.length());
		   }
		   
		   
       
       }
}
