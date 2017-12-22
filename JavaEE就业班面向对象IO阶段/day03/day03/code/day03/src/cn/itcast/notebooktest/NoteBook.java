package cn.itcast.notebooktest;

public class NoteBook {
   
	public void run(){
		System.out.println(".......欢迎...进入windows系统");
	}
	
	public void close(){
		System.out.println("正在关机。。。");
	}
	/*
	 * 使用USB设备方法
	 */
	public void useUSB(USB u){
		u.link();
		u.unlink();
	}
//	/*
//	 * 使用鼠标的方法
//	 */
//	public void useMouse(Mouse m){
//		m.link();
//		m.unlink();
//	}
}
