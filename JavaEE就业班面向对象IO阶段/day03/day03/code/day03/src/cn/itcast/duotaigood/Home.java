package cn.itcast.duotaigood;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * ��    
 * 
 * ������  
 * 
 *    ��̬�ô� 
 *      ��ߴ��븴����  ����չ��
 *      
 *      ��������Ĳ����� ��һ��������  ��ô������������󼴿�
 */
public class Home {
    public static void main(String[] args) throws FileNotFoundException {
		  
    	 Cat c = new Cat();
    	 
    	 feedAnimal(c);//Ҫ���� Animal����  ���Դ������������ 
    	 
    	 Dog d = new Dog();
    	 
    	 feedAnimal(d);
    	 
    	 Tiger t = new Tiger();
    	 
    	 feedAnimal(t);
    	 
    	
    	 BufferedReader br = new BufferedReader(new FileReader("a.txt"));
	}
    
    public static void feedAnimal(Animal a){
    	                        // Animal a = new Cat()
    	                        // Animal a = new Dog()
    	a.eat();
    	a.shout();
    }
//    public static void feedAnimal(Cat c){
//    	c.eat();
//    	c.shout();
//    }
//    
//    public static void feedAnimal(Dog d){
//    	d.eat();
//    	d.shout();
//    }
//    
//    public static void feedAnimal(Tiger t){
//    	t.eat();
//    	t.shout();
//    }
}
