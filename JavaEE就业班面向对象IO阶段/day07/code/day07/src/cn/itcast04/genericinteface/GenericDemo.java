package cn.itcast04.genericinteface;
/*
 *  ���ͷ����ĵ���
 *  
 *   ��ʵȷ��  �����ķ��;��������
 *   
 *      ����ֻ������������
 */
public class GenericDemo {
      public static void main(String[] args) {
		   GenericMethod  gm = new GenericMethod();
		   
		   gm.show("������");
		   
		   gm.show(124);
		   
		   gm.show(true);
	  }
}
