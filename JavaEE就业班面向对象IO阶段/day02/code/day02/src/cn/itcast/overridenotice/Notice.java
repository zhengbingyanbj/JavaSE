package cn.itcast.overridenotice;

import java.io.FileReader;

/*
 *    ��д��ע������
 *     1��������дʱ  ��д�ķ��� ���� �� ����д�ĸ����еķ���  ����������������  ����ֵ����  �����б�һģһ��
 *     
 *     2��������д���෽����Ȩ��  ������ڵ��� ���෽����Ȩ��
 *     
 *      ���� Ȩ��  �������η�  
 *      
 *       public  > ʲô����д Ĭ��(default)  > private
 */
class Fu{
	
	 void show(){}
	 
//	 private void method(){}
}
class Zi extends Fu{
	
	public void show(){}
	
	public void method(){}
}
public class Notice {
      
}
