package cn.itcast01.static01;
/*
 *  ÿ���������Լ��Ķѿռ�  
 *     ÿ������ ��ҪΪ������Ա���� ���ٿռ�
 *     ���ǿ��� ���������  
 *      ���������� 
 *        ÿ����Ա�����ֲ�һ�� ������� 
 *        ���� ������һ����  
 *        ռ������ռ�  
 *        
 *        �ܲ��� �����������ֻռ��һ��ռ� 
 *        �ṩ�����������
 *        
 *        �ܲ������ ���� 
 *        ������ java�� �и��ؼ��� static 
 *        ״̬���η�  
 *        
 *        �������εĳ�Ա  ���Ա����������
 *        ����ĳһ������
 */
public class Demo {
    public static void main(String[] args) {
		//����һ������
    	BBPlayer p1 = new BBPlayer();
    	p1.name = "ղķ˹";
    	p1.country="����";
    	p1.show();
    	
    	//��Ա2
    	BBPlayer p2 = new BBPlayer();
    	p2.name = "����";
    	//p2.country="����";
    	p2.show();
    	
    	//��Ա3
    	BBPlayer p3 = new BBPlayer();
    	p3.name="�����";
    	//p3.country="����";
    	p3.show();
	}
}
