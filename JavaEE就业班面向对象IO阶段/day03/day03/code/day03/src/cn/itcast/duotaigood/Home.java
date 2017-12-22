package cn.itcast.duotaigood;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 家    
 * 
 * 养动物  
 * 
 *    多态好处 
 *      提高代码复用性  可扩展性
 *      
 *      如果方法的参数上 是一个抽象类  那么传递其子类对象即可
 */
public class Home {
    public static void main(String[] args) throws FileNotFoundException {
		  
    	 Cat c = new Cat();
    	 
    	 feedAnimal(c);//要的是 Animal类型  可以传递其子类对象 
    	 
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
