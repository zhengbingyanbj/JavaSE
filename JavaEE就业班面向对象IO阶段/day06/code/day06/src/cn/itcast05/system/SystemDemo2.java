package cn.itcast05.system;
/*
 *  
 *    ����������  ����ʲô�� 
 *    
 *      û��ָ��Ķ���
 */
public class SystemDemo2 {
     public static void main(String[] args) {
		//��������
    	 Person p = new Person("�����", 30);
    	 Person p2 = new Person("������", 33);
    	 
    	 p=null;
    	 p2=null;
    	 
    	 System.gc();
	}
}
