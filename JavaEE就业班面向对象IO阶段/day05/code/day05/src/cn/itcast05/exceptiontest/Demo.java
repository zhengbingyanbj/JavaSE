package cn.itcast05.exceptiontest;
/*
 * ��һ���µ����� ������ 
 *   ����Ƿ�����  
 *     ������Զ���һ���쳣  
 *     �ڳ�������ĵط�
 *       ������쳣 throw�׳� 
 *         ֹͣ����ִ��
 *         
 *      �Զ����쳣 
 *        ����Ƿ��쳣 �̳� Exception
 *          д������
 */
public class Demo {
   public static void main(String[] args) throws UnAgeException {
	  
	   Person p = new Person("������С��", 18);
	   System.out.println(p);
	   
	   Person p2 = new Person("�����",-20);
	   System.out.println(p2);
   }
}
