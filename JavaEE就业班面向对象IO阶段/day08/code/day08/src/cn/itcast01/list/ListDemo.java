package cn.itcast01.list;

import java.util.ArrayList;
import java.util.List;

/*
 * ����� collection��Ҳ��Ϊ���У����˽ӿڵ��û����Զ��б���ÿ��Ԫ�صĲ���λ�ý��о�ȷ�ؿ���
 *      
 *      List���� �� ���򼯺� �ص� Ԫ��������  ��ȡ˳��һ�� 
 *        ����׼ȷ���ҵ�ĳ��λ�õ�Ԫ�� 
 *        
 *        ��ô�������еĹ��ܶ���������ص� 
 */
public class ListDemo {
     public static void main(String[] args) {
		  
    	 //����List���϶���
    	 List<String> list = new ArrayList<String>();
    	 
    	 //���Ԫ�ص�����  �������� ���� ����ӵ����ϵ����
    	 list.add("����");
    	 list.add("��ɲ���");
    	 list.add("���ʽ�");
    	 
    	 System.out.println(list);
	      //add(int index,String s)  ��ָ��λ�����Ԫ��
    	 list.add(1, "����");
    	 
    	 System.out.println(list);
    	 
    	 //String remove(int index) ɾ��ָ��λ��Ԫ�� �����ر�ɾ����Ԫ��
    	 System.out.println("ɾ������λ��Ϊ2��Ԫ��");
    	 System.out.println(list.remove(2));
    	 System.out.println(list);
    	 
         // String set(int index,String newE)
    	 // ���µ�Ԫ���滻��ָ��λ��Ԫ�� ���ر��滻��Ԫ��
    	 System.out.println("˭���滻�ˣ�"+list.set(0, "³���ߺ�"));
    	 System.out.println(list);
    	 
    	 
    	 // String get(int index) ��ȡָ��λ��Ԫ��
    	 //size()  ��ɱ���
    	 for(int i = 0;i<list.size();i++){
    		 System.out.println(list.get(i));
    	 }
    	 
    	 
    	 
     }
}
