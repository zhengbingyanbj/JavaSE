package cn.itcast.duotaibad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 家    
 * 
 * 养动物  
 * 
 *    多态弊端
 *      在多态情况下 不能访问子类特有的功能 
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
