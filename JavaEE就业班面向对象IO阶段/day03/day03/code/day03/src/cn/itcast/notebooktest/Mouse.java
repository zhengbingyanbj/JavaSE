package cn.itcast.notebooktest;

public class Mouse implements USB{
     
	public void link(){
		System.out.println("鼠标正在连接中...");
	}
	
	public void unlink(){
	   System.out.println("鼠标正在断开连接");
	   System.out.println("断开了。。。");
	}
}
