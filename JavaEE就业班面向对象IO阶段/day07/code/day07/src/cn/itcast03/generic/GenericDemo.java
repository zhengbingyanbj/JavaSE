package cn.itcast03.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  ����  ����  ������ǰ ���� ��<> �ж��������
 *  
 *  Collection<E>  E ���� δ��������  
 *           ������������� ʱ�� ����ʲô����  ����ͱ����ʲô����
 *           
 *       ���͸���
 *         ��һ�ְ���ȷ���͵Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������͡�
 *         
 *      д���� ��д���� ���������� 
 *      д�˷���  ����Ϸ��� ������һ����������
 *      
 *      ����з���  �㶨���ʱ������� ������<>����д 
 *       Ĭ�ϴ洢 �� Object����
 */
public class GenericDemo {
       public static void main(String[] args) {
    	   //��������
		   Collection coll = new ArrayList(); 
           //���Ԫ��
		   coll.add("�����꺽");
		   coll.add("Ф��������");
		   coll.add("��³��˹����");
		   coll.add(7654321);
		   
		   //����
		   for(Object obj : coll){
			   System.out.println(obj);
			   //��Ҫ����ת��
			   String s = (String)obj;
			   System.out.println(s.length());
		   }
		   
		   
       
       }
}
