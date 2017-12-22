package cn.itcast03.dataformat;

import java.text.ParseException;
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
public class DateFormatDemo2 {
   public static void main(String[] args) throws ParseException {
	     //  ��¼������ ����"yyyy-MM-dd"��ʽ      ��ָ����ʽ��ʱ���ַ���  ������  Date����
	   String birthday = "2000-01-01";
	   
	   //�������ڸ�ʽ������
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	                          //����д�Ĺ��� Ҫ���������ַ��� ��Ӧ��
	   Date date = sdf.parse(birthday);
	   
	   System.out.println(date);
	     
   }
}
