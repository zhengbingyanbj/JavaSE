package cn.itcast02.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 *   LinkedHashSet
 *       ��ϣ�� ��֤Ԫ�ص� Ψһ�� 
 *       ����������ϼ���һ������   ά���˴��˳��
 */
public class LinkedHashSetDemo {
  public static void main(String[] args) {
	  
	  //����set����
//	  HashSet<String>  set = new HashSet<String>();
	  LinkedHashSet<String>  set = new LinkedHashSet<String>();
	  
	  set.add("����è");
	  set.add("����");
	  set.add("�˾�");
	  set.add("����");
	  set.add("����");
	  set.add("����");
	  
	  for (String s : set) {
		  System.out.println(s);
	   }
	  
  }
}
