package cn.itcast03.maptest;

import java.util.HashMap;
import java.util.Set;

/*
 * // ʹ��map���ϴ洢  �Զ�������	
 * ��ϰ��ÿλѧ�������������䣩�����Լ��ļ�ͥסַ��
 *   ��ô����Ȼ�ж�Ӧ��ϵ����ѧ������ͼ�ͥסַ�洢��map�����С�
 *   ѧ����Ϊ��, ��ͥסַ��Ϊֵ��
 *   ע�⣬ѧ��������ͬ����������ͬ��Ϊͬһ��ѧ����
 */
public class MapTest {
     public static void main(String[] args) {
	    // ʹ��map���ϴ洢  �Զ�������	
    	 //���� map���� 
    	 HashMap<Student, String> map = new HashMap<Student,String>();
    	 
    	 //�洢 
    	 map.put(new Student("�����", 33), "����");
    	 map.put(new Student("����", 35), "����");
    	 map.put(new Student("����", 37), "¥��");
    	 map.put(new Student("����", 35), "¥��");
    	 
    	 //���� 
    	 Set<Student> stus = map.keySet();
    	 for (Student stu : stus) {
			  String address = map.get(stu);
    		 System.out.println("����"+address+"��"+stu.getName());
		 }
	 }
}
