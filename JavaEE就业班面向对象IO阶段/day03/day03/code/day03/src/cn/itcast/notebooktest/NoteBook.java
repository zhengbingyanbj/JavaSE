package cn.itcast.notebooktest;

public class NoteBook {
   
	public void run(){
		System.out.println(".......��ӭ...����windowsϵͳ");
	}
	
	public void close(){
		System.out.println("���ڹػ�������");
	}
	/*
	 * ʹ��USB�豸����
	 */
	public void useUSB(USB u){
		u.link();
		u.unlink();
	}
//	/*
//	 * ʹ�����ķ���
//	 */
//	public void useMouse(Mouse m){
//		m.link();
//		m.unlink();
//	}
}
