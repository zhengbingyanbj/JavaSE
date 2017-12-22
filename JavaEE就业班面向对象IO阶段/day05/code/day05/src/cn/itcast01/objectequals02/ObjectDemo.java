package cn.itcast01.objectequals02;
/*
 *  �� Object �����νṹ�ĸ��ࡣ
 *    ÿ���඼ʹ�� Object ��Ϊ���ࡣ
 *    ���ж���ʵ�������ķ�����
 *    
 *    �κ��� ��ֱ�ӻ��Ӽ̳���Object,��ôObject����Ŀɼ̳й��ܣ��κ��඼��
 *    
 *    �κζ��� �����Ե��� Object�пɼ̳еķ���
 *        
 *        
 *        boolean equals(Object obj) 
 *        
 *          ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 *       public boolean equals(Object obj) {
 *            return (this == obj);
 *       }    
 *       
 *       Object�ж�equals�� ʵ�� ��  �Ƚ���������ĵ�ֵַ 
 *       
 *       ���û����дObject��equals����  ��ô ����Ƚ��ǵ�ֵַ
 *       ��� ��дObject�е�equals���� ��ôһ����˵  �Ƚϵ��Ƕ����е�����
 *                                             �Ƚϵ��ǳ�Ա����
 *       
 *       ��ݷ�ʽ 
 *        alt+shift+s h    
 */
public class ObjectDemo {
       public static void main(String[] args) {
		    
    	
    	   
    	   Person p1 = new Person("�����˹����",44);
    	   Person p2 = new Person("����ɭ��˹̹��",45);
    	   
    	   System.out.println("p1.equals(p2):"+p1.equals(p2));
    	   System.out.println("--------------------");
    	   
    	   Person p3 = new Person("�����˹����",44);
    	   Person p4 = new Person("�����˹����",44);
    	   System.out.println("p3.equals(p4):"+p3.equals(p4));
    	   
    	   
    	  
	   }
}
