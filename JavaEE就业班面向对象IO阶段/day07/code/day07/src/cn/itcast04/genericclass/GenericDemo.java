package cn.itcast04.genericclass;
/*
 *   ʹ�� ������ 
 *       ��Ҫ�о�
 *       
 *          ����ʲôʱ�� ��� ȷ������������
 *          
 *          ���������ʱ��
 */
public class GenericDemo {
      public static void main(String[] args) {
		  //��������
    	  GenericClass<String>  gc = new GenericClass<String>();
    	  
    	  gc.setMVP("ղķ˹�ǵ�");
    	  
    	  String mvp = gc.getMVP();
    	  
    	  System.out.println(mvp);
    	  
    	  GenericClass<Integer>  gc2 = new GenericClass<Integer>();
    	  
    	  gc2.setMVP(123);
    	  
    	  Integer mvp2 = gc2.getMVP();
	  }
}
