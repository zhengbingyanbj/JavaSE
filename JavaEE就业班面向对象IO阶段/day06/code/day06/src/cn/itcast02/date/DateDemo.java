package cn.itcast02.date;

import java.util.Date;

/*
 *   Date  ��ʾ�ض���˲��   ��ȷ����  
 *   
 *   ����
 *     Date()   ���� ��ǰʱ���  ���ڶ���
 *     
 *     Date(long time)
 *           time���� ƫ�Ƶĺ���ֵ
 *         
 *          ����һ�� �Ի�׼ʱ�����timeƫ�Ƶ� ���ڶ���
 *          ��ʵ ����  ��׼ʱ��+����ֵ ��ʱ��
 *           
 *     
 *     ��������
 *     1970��1��1�� ��ʱ�������  
 *       ����һ����׼ʱ��
 *       
 *     1970��1��1�� ������  �˵���
 *     Thu Jan 01 08:00:00 CST 1970  
 *     
 *     
 *   ���� 
 *     toString()
 *       Mon Nov 27     15:18:46 CST   2017
 *      ����  ��  ������    ʱ   �� ��   ʱ��      ��
 *     
 *      getTime()
 *         ��ȡdate�����  ����ֵ
 *         
 *           ����ֵ 
 *             date�����ʱ�� - ��׼ʱ�� 
 *             
 *             ת���� ���������λ �Ľ��
 *        
 */
public class DateDemo {
    public static void main(String[] args) {
	   //�������ڶ��� ʹ�ÿղ�
    	Date date = new Date();
    	
    	System.out.println(date);
    	
    	System.out.println("�鿴��ǰʱ�����ֵ��"+date.getTime());
    	System.out.println("---------");
    	Date date2 = new Date(1000*60*60);
    	
    	System.out.println(date2);
    	System.out.println("�鿴ƫ��ʱ�����ֵ:"+date2.getTime());
    	
	}
}
