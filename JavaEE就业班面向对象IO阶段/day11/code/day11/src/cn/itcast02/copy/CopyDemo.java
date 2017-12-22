package cn.itcast02.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 完成文件复制  
 *    以后想要完成 文件复制  
 *       必须 使用字节流
 *       
 *       五步
 *         1：创建字节输入流关联源文件
 *         2：创建字节输出流 关联目标文件
 *         3：读取源文件中数据到内存
 *         4：将内存中数据写入目标文件
 *         5：释放资源
 *         
 */
public class CopyDemo {
    public static void main(String[] args) throws Exception {
		//1：创建字节输入流关联源文件 
    	FileInputStream fis = new FileInputStream("悟空.jpg");
    	//2：创建字节输出流 关联目标文件
    	FileOutputStream fos = new FileOutputStream("copy\\小岳岳.jpg");
    	//3：读取数据
    	byte[] buffer = new byte[1024];
    	int len;
    	while((len=fis.read(buffer))!=-1){
    		// buffer 0  len 
    		//将内存中数据 buffer 真实读到字节  写到  目标文件中
    		//4写数据
    		fos.write(buffer, 0, len);
    	}
    	
    	//5：释放资源
    	fos.close();
    	fis.close();
	}
}
