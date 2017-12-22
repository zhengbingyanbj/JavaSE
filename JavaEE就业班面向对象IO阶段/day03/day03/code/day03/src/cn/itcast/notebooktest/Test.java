package cn.itcast.notebooktest;

public class Test {
   public static void main(String[] args) {
	   NoteBook nb = new NoteBook();
	   
	   nb.run();
	   
	   //调用使用鼠标方法  
	   
	   //需要 Mouse对象  传递 Mouse对象
	   Mouse m = new Mouse();
//	   nb.useMouse(m);
	   
//	   USB u = new Mouse();
	   
	   
	   nb.useUSB(m);//需要USB类型 
	   
//	   nb.useMouse(new Mouse());
	   
	   nb.useUSB(new Keyboard());
	   
	   
	   nb.close();
   }
}
