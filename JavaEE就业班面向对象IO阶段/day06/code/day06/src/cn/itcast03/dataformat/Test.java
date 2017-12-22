package cn.itcast03.dataformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *   ���Ѿ����Ķȹ��˶�����
 *   
 *      1������¼�� ��ĳ�������
 *        Ҫ�� yyyy-MM-dd 
 *     
 *      2: ����¼����ַ��� ������ ���ڶ���
 *      
 *      3����ȡ��ǰ�����ڶ���
 *      
 *      4����ȡ��ǰʱ��ĺ���-�������ڵĺ���
 *      
 *      5��������ת������
 *            
 */
public class Test {
   public static void main(String[] args) throws ParseException {
	    //����¼��
	   System.out.println("��¼���������գ���ʽ yyyy-MM-dd");
	  
	   String  birthday= new Scanner(System.in).nextLine();
	   
	   //������Date����
	   //�������ڸ�ʽ���� 
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   
	   Date birthDate = sdf.parse(birthday);
	   
	   Date nowDate = new Date();
	   
	   long time = nowDate.getTime()-birthDate.getTime();
	   
	   System.out.println("�Ѿ����ζȹ��ˣ�"+(time/1000/60/60/24)+"��");
	   
    }
}
