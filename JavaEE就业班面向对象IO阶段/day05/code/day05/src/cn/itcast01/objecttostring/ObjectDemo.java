package cn.itcast01.objecttostring;
/*
 *  toString����
 *    toString�������ظö�����ַ�����ʾ
 *    �÷���Դ��
 *     public String toString() {
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *               ����ȫ·��  + @ + ��ϣֵ��ʮ�����Ʊ�ʾ��ʽ
 *      
 *      }
 *      
 *      ���û����дObject�е� toString����
 *       ��ô ���ص�ֵ  �Ǹö���� ����ֵַ��
 *       
 *      ��� ��дtoString���� 
 *        һ�� ����ֵ ��  չʾ ��ǰ���������
 *                               �����еĳ�Ա����
 *                               
 *      ��ݼ� 
 *       alt+shift+s   s
 *       
 *       ���������������е��������������ʱ�� 
 *       ��ʵ �ǵ����˸ö���� toString���� 
 */
public class ObjectDemo {
       public static void main(String[] args) {
		    
    	   Object o = new Object();
    	   
    	   System.out.println(o.toString()); 
    	   System.out.println(o);
    	   
    	   Person p = new Person("�����",33);
    	   System.out.println(p.toString());
    	   System.out.println(p);
    	   
    	   String s = new String("������");
    	   System.out.println(s.toString());
    	   System.out.println(s);
    	   
	   }
}
