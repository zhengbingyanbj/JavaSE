package cn.itcast03.package01;
/*
 * package �ؼ��� ����������˼  
 *       ��������Ч����ĵ�һ��
 *       
 *       com.baidu.baiduyun.
 *       
 *     
 *       �ĸ�����Ȩ�����η� 
 *              public  protected   Ĭ��(default)  private 
 *   ͬһ����           ��       ��            ��             ��
 *   ͬ������           ��       ��            �� 
 *  ͬ���޹���         ��       ��            �� 
 *  ����������         ��       ��  
 *  �������޹���     ��
 *  
 *  �ܽ�  
 *     private    �����ڱ�����
 *     Ĭ��    �����ڱ���  ������
 *     protected  �����ڱ���  ������  ������������
 *     public     �����ڱ���  ������  ������������  ������������
 */
public class Demo {
    // ������
	public  void show1(){
		System.out.println("public");
	}
	//�ܱ����� 
	protected void show2(){
		System.out.println("protected");
	}
	//Ĭ�ϵ�
	void show3(){
		System.out.println("default");
	}
	//˽�е�
	private void show4(){
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		//��������
		Demo d = new Demo();
		
		d.show1();
		d.show2();
		d.show3();
		d.show4();
	}
}
