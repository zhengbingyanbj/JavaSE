package cn.itcast05.changeargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Collections ���Ϲ�����
 *      static <T> boolean addAll(Collection<T> c, T... elements) 
 *                                 ����                      ����������ӵ�Ԫ��
 *                             
 *      public static void shuffle(List<?> list) //  ����Ԫ�ش洢λ�ô���
 *      
 *      
 *      public static <T> void sort(List<T> list) 
 *      ����
 *      
 *  Arrays ���鹤����
 *      sort(���� ) �����������   ����  
 *       (����ѧ��ð�� ѡ��)
 *        
 */
public class CollectionsDemo {
  public static void main(String[] args) {
	  //�������϶���
	  ArrayList<Integer>  list = new ArrayList<Integer>();
//	  list.add(23);
//	  list.add(33122);
//	  list.add(233);
//	  list.add(1123);
	  //ʹ�ù�����
	  Collections.addAll(list,13,11,30,9,7);
	  
	  System.out.println(list);
	  //����
	  Collections.sort(list);
	  System.out.println(list);
  }
}
