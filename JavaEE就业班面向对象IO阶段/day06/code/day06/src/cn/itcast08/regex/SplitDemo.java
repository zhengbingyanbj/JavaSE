package cn.itcast08.regex;
/*
 * ������ʽ  
 */
public class SplitDemo {
     public static void main(String[] args) {
	   
    	 String s = "2017-10-27";
    	 
    	 String regex = "-";//�����һ��������ʽ  
    	                    //���ڱ�ʾ������ַ���
    	 String[] strings = s.split(regex);
    	 
    	 System.out.println(strings[0]);
    	 System.out.println(strings[1]);
    	 System.out.println(strings[2]);
	 }
}
