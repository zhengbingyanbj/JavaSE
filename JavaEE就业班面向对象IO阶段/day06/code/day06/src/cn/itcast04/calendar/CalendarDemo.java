package cn.itcast04.calendar;

import java.util.Calendar;

/*
 * Calendar�������࣬��Date����֣��滻�������Date�ķ��������ཫ���п����õ���ʱ����Ϣ��װΪ��̬��Ա�����������ȡ��
 * 
 * 
 * CalendarΪ�����࣬
 *     �������������ԣ�Calendar���ڴ�������ʱ����ֱ�Ӵ�����
 *       ����ͨ����̬�����������������������ݴ���ã��ٷ����������
 *       
 *     static  Calendar  getInstance()
 */
public class CalendarDemo {
    public static void main(String[] args) {
	    //��ȡ  Calendar  ����
    	Calendar c = Calendar.getInstance();
    	
    	System.out.println(c);
	}
}
