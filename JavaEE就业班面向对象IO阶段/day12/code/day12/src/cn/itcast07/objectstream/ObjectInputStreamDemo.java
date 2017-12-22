package cn.itcast07.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 *  反序列化操作
 *      必须是对象文件  而且 这个对象的类型  需要 有.class文件
 *      
 *      ObjectInputStream
 *      ObjectInputStream(InputStream in)
 *      
 *      方法
 *        Object readObject()
 */
public class ObjectInputStreamDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	  //创建反序列化对象
	  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p3.person"));
     
	  //读取文件 
	  Object obj = ois.readObject();
	  
	  System.out.println(obj);
	  
	  ois.close();
  }
}
