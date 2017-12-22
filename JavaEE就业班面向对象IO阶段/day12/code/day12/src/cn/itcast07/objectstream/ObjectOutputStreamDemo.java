package cn.itcast07.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 序列化 
 *    向 流中写对象的操作   
 *      叫做序列化 
 *       这种流 称为 序列化流  ObjectOutputStream
 *       
 *       构造
 *         ObjectOutputStream(OutputStream out)
 *         
 *       方法
 *         writeObject(Object obj)   
 *         
 *         想要序列化 那么必须实现序列化接口
 *         
 */
public class ObjectOutputStreamDemo {
  public static void main(String[] args) throws IOException {
	  //創建一個 對象
	  Person p = new Person("小狐妖", 2400);
	  
	 // 创建 序列化流 
	  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p3.person"));
	  
	  //把对象写到流中
	  oos.writeObject(p);
	  //释放
	  oos.close();
	  
  }
}
