package cn.itcast07.baozhuanglei;
/*
 *  ��������      ��װ�� 
 *   
 *   װ�� 
 *      ��������  ת���� ��װ��  
 *   ����
 *     ��װ�� ����  ת���� ��������
 */
public class Demo2 {
    public static void main(String[] args) {
		
    	
    	int i = 100;
    	//װ�����1
    	Integer ii = new Integer(i);//����������iת�� ���ã���װ������  ����ii
	    //װ�����2
        Integer iii = Integer.valueOf(i);//���������� ת����  ���ã���װ������  ����iii
        
        //�������
        int i4 = iii.intValue();//����װ����� ת���� ��������i4
        
    }
}
