package cn.itcast.duotaibad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * ��    
 * 
 * ������  
 * 
 *    ��̬�׶�
 *      �ڶ�̬����� ���ܷ����������еĹ��� 
 */
public class Home {
    public static void main(String[] args) {
		  
    	Animal a = new Tiger();
    	
    	feedAnimal(a);
    	
    	
//    	a.daDuner();
    	
	}
    
    public static void feedAnimal(Animal a){
    	                        
    	a.eat();
    	a.shout();
    }

}
