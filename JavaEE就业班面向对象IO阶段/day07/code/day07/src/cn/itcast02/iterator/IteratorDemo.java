package cn.itcast02.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *   ���� ��ʹ��
 *    1���������϶���
 *    2�� ���Ԫ�ص�����
 *    3����������
 *    
 *      ����  Ԫ��һ��һ�� ��ȡ����  
 *      ����  һ��һ�������� 
 *      
 *      ������ �������Ϊһ�ֹ���  
 *      ÿ�����϶��� ���߱��Լ��ĵ�����
 *      
 *      ��ʵһ������ 
 *        Iterator<E> iterator() 
 *             �����ڴ� collection ��Ԫ���Ͻ��е����ĵ������� 
 *             
 *       ͨ��������������� 
 *          ѧϰ�������еĹ���  
 *          
 *          ����
 *            boolean hasNext()  
 *                �������Ԫ�ؿ��Ե������򷵻� true�� 
 *            String next() 
 *                ���ص�������һ��Ԫ�ء� 
 */
public class IteratorDemo {
   public static void main(String[] args) {
	  //��̬����ʽ�������� �о�
	   Collection<String> coll = new ArrayList<String>();
	   //���Ԫ�ص�����
	   coll.add("��������");
	   coll.add("�²�����");
	   coll.add("��������");
	   
	   //����
	   //��ȡ������
	   Iterator<String> it = coll.iterator();
	         //String ���� ����ʱ�� ���ռ���Ԫ�ص�����
	   
	   while(it.hasNext()){//�ж� �����Ƿ���Ԫ�ؿ��Ե���
		   //����оͻ�ȡ
		   String s = it.next();
		   
		   System.out.println(s);
	   }
	   
//	   String s = it.next();   
//	   System.out.println(s);
//	   
//	   String s2 = it.next();   
//	   System.out.println(s2);
//	   
//	   String s3 = it.next();   
//	   System.out.println(s3);
//	   
//	   String s4 = it.next();   
//	   System.out.println(s4);
	   
	   //��������
//	   for(int i = 0;i<coll.size();i++){
//		   String s = coll.get(i);
//		   
//	   }
   }
}
