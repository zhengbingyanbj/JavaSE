package cn.itcast04.genericinteface;
/*
 *  ���ͷ��������ʽ  
 *  
 *       ���η� <���͵�����> ����ֵ���� ������(�����б�){}
 *
 */
public class GenericMethod{
    
	public <T> void show(T  t){
		
		System.out.println(t.getClass());
	}
	
     public <T> T show2(T  t){
		
		return t;
	}
	
}
