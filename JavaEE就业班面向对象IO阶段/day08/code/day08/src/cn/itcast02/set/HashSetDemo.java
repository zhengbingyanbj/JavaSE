package cn.itcast02.set;

import java.util.HashSet;

/*
 *   Set  ��֤Ԫ��Ψһ�ļ���  
 *        ���ܱ�֤Ԫ�ص������� ��ȡ˳��һ��
 *        
 *        ��Ҫ�Ĳ���  ��������֤Ԫ�ش洢��  ��Ψһ�� 
 *        
 *        ��Ҫѧϰ �������� HashSet
 *        ʹ�ù�ϣ�� ����֤Ԫ�ص� Ψһ�� 
 */
public class HashSetDemo {
  public static void main(String[] args) {
	  
	  //����set����
	  HashSet<String>  set = new HashSet<String>();
	  
	  System.out.println("cba".hashCode());
	  System.out.println("abc".hashCode());
	  System.out.println("bac".hashCode());
	  set.add(new String("cba"));
	  set.add("abc");
	  set.add("cba");
	  set.add("bac");
	 
	  
	  for (String s : set) {
		  System.out.println(s);
	   }
	  
  }
}
