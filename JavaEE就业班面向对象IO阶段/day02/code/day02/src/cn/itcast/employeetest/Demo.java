package cn.itcast.employeetest;
/*
 * ������������  
 *   1������Ա���� Employee �����Ҳ�ǳ���� 
 *      ��Ա����  id  name 
 *      ���췽��  �ղ� ����
 *      ��Ա����  abstract work()
 *            set get
 *            
 *   2:�����з�����  �̳� Ա����  Ҳ���ǳ���
 *     Develop 
 *       ��Ա���� ��
 *       ���췽��      Ҫ  �ղ� ���� 
 *       ��Ա����  ��
 *       
 *   3������Maintain ά���� 
 *      ������ Develop
 *      
 *   4������JAVAEE����ʦ  
 *         ��Ա���� ��
 *         ���췽��      Ҫ  �ղ� ���� 
 *         ��Ա����    ��д work()
 *         
 *    ���в���ʣ������
 */
public class Demo {
    public static void main(String[] args) {
		//����javaee����
    	JAVAEE ee = new JAVAEE(9527, "����");
    	
    	ee.work();
    	
	}
}
