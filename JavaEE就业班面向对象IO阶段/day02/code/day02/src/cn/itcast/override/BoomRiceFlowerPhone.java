package cn.itcast.override;

public class BoomRiceFlowerPhone extends Phone{
    
	/*
	 * �Դ�绰 ���з�����д  
	 *    ����  ���෽���� ��Ҫ ִ�� �����е�ĳ������ 
	 *      ���ʱ�����ʹ��super�ؼ��� 
	 *        super ���ʵ�ǰ��ĸ���������
	 *        
	 *             super.��Ա����  �����г�Ա����
	 */
	public void callSo(String name){
//		System.out.println("��"+name+"��绰");
		super.callSo(name);
		System.out.println("----ע��-5-4-3-2-1-����boom!!!");
	    System.out.println("�Ա��׻�");
	}
}
