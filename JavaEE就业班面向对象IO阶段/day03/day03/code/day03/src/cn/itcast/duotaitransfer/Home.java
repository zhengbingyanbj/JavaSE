package cn.itcast.duotaitransfer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * ��    
 * 
 * ������  
 * 
 *    ����ת�� 
 *    
 *    ����ת�� 
 *    
 *    ����ת�͵�ʱ�� ���׳��� ����ת���쳣  
 *     ��ô����� 
 *     
 *     ��������ת��֮ǰ ��һ���ж� 
 *       �ж�  �ø������� �Ƿ� ָ����  Ҫת�ɵ���������
 *       
 *       instanceof
 *       ������   instanceof  ����
 *       �ж� ������� �Ƿ� �����������
 */
public class Home {
    public static void main(String[] args) {
	   //��̬��ʽ  �������� ָ���������  
    	Animal a = new Cat();
    	/*
    	 *   double d = 3;
    	 *    ��int���͵�3 ����Ϊdouble  
    	 *    
    	 *    ��ʽת��
    	 *    
    	 *   Animal a = new Tiger();
    	 *   ���������� ����Ϊ ��������
    	 *    ����ת��
    	 */
    	
    	feedAnimal(a);
    	
    	
    	/*
    	 *   double d = 3.0;
    	 *   
    	 *   int i = (int)d;  
    	 *     ��double����d ǿ��ת����int���� 
    	 *     ǿ��ת��
    	 *     
    	 *     ��������������  ��ԭ�� ��Ӧ����������   ����������ָ��˭ ��ԭ��˭��
    	 *     Tiger t = (Tiger)a;  
    	 *     
    	 *     ����ת��
    	 *       ��������  ������ = ���������ͣ���������;
    	 *     
    	 */
    	if(a instanceof Tiger){//�ж�a�Ƿ�ָ����Tiger���Ͷ���
    		
    		Tiger t = (Tiger)a;
    		
    		t.daDuner();
    	}
//    	a.daDuner();
    	
    	System.out.println("-------------");
    	
    	if(a instanceof Cat){//�ж�a�Ƿ�ָ����Cat���Ͷ���
    		
    		Cat c = (Cat)a;
    		
    		c.play();
    	}
    	//ClassCastException ����ת���쳣
    	
	}
    
    public static void feedAnimal(Animal a){
    	                        
    	a.eat();
    	a.shout();
    }

}
