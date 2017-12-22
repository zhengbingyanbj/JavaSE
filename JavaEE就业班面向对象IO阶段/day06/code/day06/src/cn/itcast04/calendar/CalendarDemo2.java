package cn.itcast04.calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar�������࣬��Date����֣��滻�������Date�ķ��������ཫ���п����õ���ʱ����Ϣ��װΪ��̬��Ա�����������ȡ��
 * 
 * 
 * CalendarΪ�����࣬
 *     �������������ԣ�Calendar���ڴ�������ʱ����ֱ�Ӵ�����
 *       ����ͨ����̬�����������������������ݴ���ã��ٷ����������
 *       
 *     static  Calendar  getInstance()
 *     
 *     
 *  �������� 
 *     public int get(int field)
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
	    //��ȡ  Calendar  ����
    	Calendar c = Calendar.getInstance();
    
    	//��ȡ�����е��� 
    	
//    	int year = c.get(1);
    	
    	int year = c.get(Calendar.YEAR);
    	int month = c.get(Calendar.MONTH)+1;
    	int day = c.get(Calendar.DAY_OF_MONTH);
    	
    	System.out.println(year+"��"+month+"��"+day+"��");
    	
    	//public final void set(int field,int value)//����ָ���ֶε�ֵ
    	
    	c.set(Calendar.YEAR, 2000);
    	int year2 = c.get(Calendar.YEAR);
    	int month2 = c.get(Calendar.MONTH)+1;
    	int day2 = c.get(Calendar.DAY_OF_MONTH);
    	
    	System.out.println(year2+"��"+month2+"��"+day2+"��");
    	
    	//  ��������  ʱ�����
    	//  ����������ת���� Date���� 
    	//  Date getTime()����
    	Date date = c.getTime();
    	System.out.println(date);
    	
	}
}
