package cn.itcast01.objectequals;
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
 */
public class ObjectDemo {
       public static void main(String[] args) {
		    
    	   Object o = new Object();
    	   Object o2 = new Object();
    	   
//    	   System.out.println(o==o2);
    	   System.out.println("o.equals(o2):"+o.equals(o2));
    	   
    	   Person p1 = new Person("�����˹����",44);
    	   Person p2 = new Person("����ɭ��˹̹��",45);
    	   
    	   System.out.println("p1.equals(p2):"+p1.equals(p2));
    	   
    	   Person p3 = new Person("�����˹����",44);
    	   Person p4 = new Person("�����˹����",44);
    	   System.out.println("p3.equals(p4):"+p3.equals(p4));
    	   
    	   
    	   System.out.println("--------------------");
    	   String s = new String("����");
    	   String s2 = new String("����");
    	   System.out.println("s.equals(s2):"+s.equals(s2));
	   }
}
