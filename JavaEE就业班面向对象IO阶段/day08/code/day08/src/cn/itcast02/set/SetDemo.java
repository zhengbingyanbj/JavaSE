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
public class SetDemo {
  public static void main(String[] args) {
	  
	  //����set����
	  HashSet<String>  set = new HashSet<String>();
	  
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
