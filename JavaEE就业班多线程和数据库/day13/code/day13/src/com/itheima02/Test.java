package com.itheima02;
/*
 * �����̵߳ĵ�һ�ַ�ʽ
 * 
 * java.lang.Thread��
 * 		String getName()  ��ȡ�߳�����
 * 		void setName(String name)  �����߳�����
 * 		static Thread currentThread() ��ȡ��ǰ�̶߳���
 * 
 * 
 * 1.����һ����̳�Thread��
 * 2.��дrun���� (Ҫ���߳���ִ�еĴ���   �߳�����)
 * 3.�����߳� 
 * 		�����������
 * 		����start����
 * 
 * run������start����������
 * �������run���� ������һ�����̵߳ĳ���
 * �������start���� �����µ��߳�  ����jvm���Զ�����run����
 * 
 */
public class Test {

	public static void main(String[] args) {
		SubThread st = new SubThread();
		
		st.setName("С��");
//		st.run();
		st.start();
		
		SubThread st2 = new SubThread();
		st2.setName("��ʣ");
		st2.start();
		//��ȡ��ǰ�̶߳��� ����ǰ�̶߳��������߳� ��ȡ���ľ������̵߳��̶߳���
		Thread mainThread = Thread.currentThread();
		
		for (int i = 0; i < 50; i++) {
			System.out.println(mainThread.getName()+".."+i);
		}
		
	}
}
