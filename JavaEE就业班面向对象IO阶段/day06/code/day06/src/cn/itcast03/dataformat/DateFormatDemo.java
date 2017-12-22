package cn.itcast03.dataformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   
 *   DateFormat ���ڸ�ʽ����  �����ڶ��� ����ָ���� ��ʽ����չʾ
 *   
 *     ��һ�����ڶ���  ת���� ָ����ʽ��  �ַ���
 *     
 *     ��¼������ ����"yyyy-MM-dd"��ʽ      ��ָ����ʽ��ʱ���ַ���  ������  Date����
 *     
 *    DateFormat �����ڸ�ʽ�� �����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ��
 *    
 *       ���ڸ�ʽ�����ࣨ�� SimpleDateFormat��
 *      
 *    SimpleDateFormat ����
 *      SimpleDateFormat(String pattern) 
 *            String pattern ���� ��ָ��ת�����ַ�������ʽ
 *       
 *       �������
 *    String format(Date date)     
 *       ��ʽ����Ҳ�������� -> �ı���  Date���� ת�����ַ���
 *    Date parse(String source)    
 *       �������ı�-> ���ڣ�     ���ַ��� ������ Date����
 */
public class DateFormatDemo {
   public static void main(String[] args) {
	     Date date = new Date();
	     //�� ��ǰ��ʱ�� ת���� һ��  2017��11��27��  15:52:30
	     //���� SimpleDateFormat���� ��ָ�� �ַ�������ʽ
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
	     
	     //����  ��ʽ������
	     String s = sdf.format(date);
	     
	     System.out.println(s);
	     
	     
   }
}
