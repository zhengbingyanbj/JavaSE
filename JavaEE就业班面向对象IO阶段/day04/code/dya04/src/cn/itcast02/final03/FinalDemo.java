package cn.itcast02.final03;
/*
 * 
 *  ��� final���εľֲ������ǻ������� 
 *  
 *       final���εı��� ֻ�ܸ�ֵһ��  
 *                  �����ǲ��ɱ��ֵ 
 *                  
 *                  ��������  ��ֵ���ɱ� 
 *                  
 *                  ��������  ��ֵַ���ɱ�
 */
public class FinalDemo {
  public static void main(String[] args) {
	 
//	  int  a;
//	  
//	  a=20;
//	  a=30;
//	  System.out.println(a);
	  
	 final int a = 10;
	 
//	 a=20;
	 System.out.println(a);
	 
	 
	final Student stu = new Student("С��");
	 
	 stu.name = "С��";
//	 
//	 stu = new Student("����");
	 
	 
	 
  }
}
