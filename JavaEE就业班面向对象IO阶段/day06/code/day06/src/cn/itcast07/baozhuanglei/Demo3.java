package cn.itcast07.baozhuanglei;

import java.util.ArrayList;

/*
 *  ��������      ��װ�� 
 *   
 *   װ�� 
 *      ��������  ת���� ��װ��  
 *   ����
 *     ��װ�� ����  ת���� ��������
 */
public class Demo3 {
    public static void main(String[] args) {
		
    	
//    	int i = 100;
//    	//װ�����1
//    	Integer ii = new Integer(i);//����������iת�� ���ã���װ������  ����ii
//	    //װ�����2
//        Integer iii = Integer.valueOf(i);//���������� ת����  ���ã���װ������  ����iii
//        
//        //�������
//        int i4 = iii.intValue();//����װ����� ת���� ��������i4
    	
    	/*
    	 * jdk 1.5�Ժ� �����Զ�װ�� ���Զ�����
    	 *    д���� 
    	 */
    	Integer ii = 100;//�Զ�װ��
    	//Integer ii = Integer.valueOf(100);
    	
    	int i = ii;//int i = ii.intValue();  �Զ�����
    	
    	
        ArrayList<Integer>  list = new ArrayList<Integer>();
        
        list.add(new Integer(2));
        list.add(123);
    }
}
