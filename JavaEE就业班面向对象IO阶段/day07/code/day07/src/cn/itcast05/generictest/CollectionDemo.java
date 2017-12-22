package cn.itcast05.generictest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
   public static void main(String[] args) {
	  
	   ArrayList<String>  list = new ArrayList<String>();
	   list.add("�����Ȱ�");
	   list.add("��������");
	   list.add("�������");
	    
	   printCollection(list);
	   TreeSet<Integer>  set = new TreeSet<Integer>();
	   
	   set.add(12);
	   set.add(14);
	   set.add(18);
	   printCollection(set);
	 
	   LinkedList<Student> ll = new LinkedList<Student>();
	   
	   ll.add(new Student());
	   ll.add(new Student());
	   ll.add(new Student());
	   printCollection(ll);
	  
	   HashSet<Worker> ts = new HashSet<Worker>();
	   ts.add(new Worker());
	   ts.add(new Worker());
	   ts.add(new Worker());
	   printCollection(ts);
	   
   } 
   /*
    * дһ�������ķ��� ���� �������м���    
    * 
    * Collection<Object> coll = new ArrayList<String>();���Ƕ�̬
    * 
    * Collection<Object> coll = new ArrayList<Object>();
    * Collection<String> coll = new ArrayList<String>();
    * 
    */
//   public static <T> void printCollection(Collection<T> coll){
//	   
//	   for (T t : coll) {
//		  System.out.println(t);
//	   }
//   }
    /*
     * 
     * ���� ���Collection< >  ��������������Ͳ�ȷ�� 
     *      ʲô���Ͷ�Ӧ���ܽ��� 
     *      
     *      ? ͨ��� 
     *        ��ʲô����ʲô     ?�൱�� ռס���λ��  ��ʲô���Ͷ�����
     *      
     */
    public static  void printCollection(Collection<?> coll){
	   
	    for (Object object : coll) {
			System.out.println(object);
		}
   }
}
