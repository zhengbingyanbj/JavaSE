package cn.itcast05.generictest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo2 {
   public static void main(String[] args) {
	  
	   ArrayList<String>  list = new ArrayList<String>();
	   list.add("�����Ȱ�");
	   list.add("��������");
	   list.add("�������");
	    
	   //printCollection(list);
	   TreeSet<Integer>  set = new TreeSet<Integer>();
	   
	   set.add(12);
	   set.add(14);
	   set.add(18);
       
	   //printCollection(set);
	 
	   LinkedList<Student> ll = new LinkedList<Student>();
	   
	   ll.add(new Student());
	   ll.add(new Student());
	   ll.add(new Student());
	   printCollection(ll);
	  
	   HashSet<Worker> ts = new HashSet<Worker>();
	   ts.add(new Worker());
	   ts.add(new Worker());
	   ts.add(new Worker());
	   
	  // printCollection(ts);
	   
	   HashSet<Person> tss = new HashSet<Person>();
	   tss.add(new Person());
	   tss.add(new Person());
	   tss.add(new Person());
	   
	   printCollection(tss);
   }
   
   
   
   /*
    * ��Ҫ������� ֻ�Է���Ϊ   Student  Worker Person ��Ч ? 
    * 
    *   �޶����ͷ�Χ
    *       ��������� �̳�Person������ Person����
    *       �������ķ���  Ҫô�̳�Person Ҫô��Person
    *       
    *    �޶��� ���͵����� 
    *    
    *      ? extends Person  Person��������
    */
//   public static  void printCollection(Collection<? extends Person>  coll){
//	  	 
//	  	 for (Object o : coll) {
//				System.out.println(o);
//			  }
//	   }

 
   
   /*
    * ��Ҫ������� ֻ�� Student  ����Person   Object��Ч ? 
    *     �޶����͵ķ�Χ 
    *        Ҳ����˵ �������ķ��� Ҫô��Student ҪôStudent�ĸ���
    */
   public static  void printCollection(Collection<? super Student>  coll){
	  	 
	  	 for (Object o : coll) {
				System.out.println(o);
			  }
	   }

   
   
}
