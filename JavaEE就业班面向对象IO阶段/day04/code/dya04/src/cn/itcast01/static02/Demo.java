package cn.itcast01.static02;
/*
 * static ״̬���η� 
 *    ��̬�� ������ģ�
 * 
 * static �ص� 
 *   1����static���εĳ�Ա ��������ĳ������ 
 *       ���� ��  ��Ϊ���Ա
 *   2�����Ա���������� 
 *   3�����ʼ��(�����)��ʱ�� �����ؾ�̬��Ա�������ڶ������
 *   
 *   
 *   4��ʹ���ص� 
 *       static���εĳ�Ա ����ֱ��ͨ����������
 *       ����ʹ����������
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
    	
    	System.out.println("�黯��Ա");
    	
    	//   ��һ���� ����   ˵����
    	p3.country = "�й�";
    	p3.show();
    	
    	p2.show();
    	p1.show();
    	
    	
    	
	}
}
