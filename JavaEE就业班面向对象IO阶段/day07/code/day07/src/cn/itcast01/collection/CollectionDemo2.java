package cn.itcast01.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection�ӿڶ����ż��Ͽ��������Ե����ݡ�
 *      
 *   ��ѧϰʱ��������Ҫ�������ô�ã�
 *      �����ײ���󼴿ɡ���Ϊ�ײ�̳��˸����е����й��ܡ�
 *      
 *      ѧϰ �ӿ��еĹ���  
 *        ֻ��ѧϰ ʵ������
 *        
 *      ���ǲ��ö�̬�ķ�ʽ ѧϰ���о���  ����ֻ�ܷ��ʽӿ��ж��幦��
 */
public class CollectionDemo2 {
     public static void main(String[] args) {
	    
    	 //���ö�̬��ʽ��������
    	 Collection<String> coll = new ArrayList<String>();
    	 
    	 //boolean  add(String s)
    	 coll.add("������");
    	 coll.add("�����");
    	 coll.add("��«��");
    	 
    	 System.out.println(coll);
//    	 System.out.println(coll.isEmpty());
//    	 //void clear() ��ռ���
//    	 coll.clear();
//    	 System.out.println(coll);
//    	 
//    	 //isEmpty()�������Ƿ�Ϊ��
//    	 System.out.println(coll.isEmpty());
    	 
    	 //boolean contains(Object obj)
    	 //�ж�o �Ƿ��ڸü�����
    	 System.out.println("�ж��������ڲ��ڣ�"+coll.contains("������"));
    	 System.out.println("�жϴ������ڲ��ڣ�"+coll.contains("������"));
    	 
    	 //boolean remove(Object o)
    	 System.out.println("ɾ�������ޣ�"+coll.remove("������"));
    	 System.out.println("ɾ�������ޣ�"+coll.remove("������"));
    	 System.out.println(coll);
    	 
    	 //size ���� ������Ԫ�صĸ���
    	 
    	 
    	 //Object[] toArray()
    	 Object[] array = coll.toArray();
    	 
    	 for (int i = 0; i < array.length; i++) {
			  System.out.println(array[i]);
		  }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	 }
}
