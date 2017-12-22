package cn.itcast06.single;
/*
 * 
 * 
 * 1:����˽��  
 *   ����޷�new�� 
 *   
 * 2:�ṩ �����Ļ�ȡ��ʽ  ��̬
 * 
 * 3:����һ����̬����  
 * ��֤  Single���� ֻ�� ����һ�� 
 * 
 * ��̬�ı��� ֻ������һ�� 
 *    private static Single single =  new Single();
 *    
 *    
 *    ����ģʽ 
 *        ��֤ ���������� ������ ��ֻ��һ������
 *        
 *        ����ʽ  ���Ѽ���  ��������� 
 *    
 */
public class Single {
    
	private Single(){}
	
	private static Single single =  new Single();
	
	
	public static Single getInstance(){
		
		return single;
	}
}
