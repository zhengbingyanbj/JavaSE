package cn.itcast.notebooktest;

public class Test {
   public static void main(String[] args) {
	   NoteBook nb = new NoteBook();
	   
	   nb.run();
	   
	   //����ʹ����귽��  
	   
	   //��Ҫ Mouse����  ���� Mouse����
	   Mouse m = new Mouse();
//	   nb.useMouse(m);
	   
//	   USB u = new Mouse();
	   
	   
	   nb.useUSB(m);//��ҪUSB���� 
	   
//	   nb.useMouse(new Mouse());
	   
	   nb.useUSB(new Keyboard());
	   
	   
	   nb.close();
   }
}
