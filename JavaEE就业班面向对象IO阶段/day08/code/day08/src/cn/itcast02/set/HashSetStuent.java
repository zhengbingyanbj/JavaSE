package cn.itcast02.set;

import java.util.HashSet;

/*
 * ʹ��HashSet�洢 �Զ������Ͷ���  
 *    �������� �� ��������  ���������Ա������ȫһ�� ��Ϊ�� ͬһ������ 
 *    
 *    ���ڵ�ǰ   ��Ϊ ѧ������������һ���� ��ͬһ����  �ظ�
 *    
 *    �����Ҫʵ����������� 
 *      ������д hashCode �� equals����
 *      
 *      ��ݼ����� alt+shift+s  h 
 */
public class HashSetStuent {
     public static void main(String[] args) {
	   
    	 //����HashSet����
    	 HashSet<Student> set = new HashSet<Student>(); 
    	 Student stu1 = new Student("����",36);//0x11
    	 set.add(stu1);//0x11
    	 set.add(new Student("����", 50));//0x22
    	 set.add(new Student("����֥", 60));//0x33
    	 set.add(new Student("����", 50));//0x44
    	 set.add(stu1);//0x11 
    	 
    	 for (Student stu : set) {
			System.out.println(stu);
		 }
	 }
}
