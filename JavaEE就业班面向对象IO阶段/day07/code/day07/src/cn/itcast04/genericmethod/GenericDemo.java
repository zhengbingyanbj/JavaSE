package cn.itcast04.genericmethod;
/*
 *  
 *  
 *  �����ڽӿ��� 
 *    ʲôʱ��  ȷ������ �������Ͱ�
 *    
 *    ʵ���� 
 *      1����ʵ����ʵ�ֵ�ʱ�� ��ȷ����������
 *      public class MyImp1 implements GenericInteface<String>
 *      2:ʵ����ʵ�ֵ�ʱ��ȷ��
 *      public class MyImp2<E> implements GenericInteface<E>{
 *        ����ʵ��������ʱ��ȷ��
 */
public class GenericDemo {
      public static void main(String[] args) {
		  MyImp2<String> m = new MyImp2<String>();
		  
		  m.add("aaa");
	  }
}
