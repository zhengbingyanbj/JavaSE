package cn.itcast06.single;
/*
 * 
 *  ֻ�ö��� new һ��    ����������� ֻ����һ��
 */
public class SingleDemo {
   public static void main(String[] args) {
	 
//	   Single s = new Single();
//	   Single s2 = new Single();
//	   Single s3 = new Single();
	   
	   Single s = Single.getInstance();
	   Single s2 = Single.getInstance();
	   Single s3 = Single.getInstance();
	   
	   System.out.println(s);
	   System.out.println(s2);
	   System.out.println(s3);
   }
}
