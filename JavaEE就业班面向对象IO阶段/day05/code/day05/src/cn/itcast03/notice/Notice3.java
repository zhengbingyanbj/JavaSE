package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 *   ������д���෽��ʱ  
 *        �������쳣  ������ ���෽���� �����쳣�� �Ӽ�
 *        
 *     ���������û���쳣����
 */
class Fu{
	
	public void show()throws IOException,ClassNotFoundException{}
	
	public void run(){}
}

class Zi extends Fu{
	
	public void show()throws ClassNotFoundException{}
	
	public void run() {
		
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Notice3 {

}
