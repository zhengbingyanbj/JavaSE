package com.itheima.level1_12;
/*
  1.����һ��������(Car)
	a)��Ա����: ״̬(status),true��ʾ����״̬һ��,false��ʾֹͣ״̬.
	b)��Ա�ڲ���: ������(Engine) 
		i.��Ա����:work()
			1.�������������״̬��ӡ�������ͷ�����ת
			2.�����ӡ������ֹͣ����
	c)�ṩ:״̬(status)��getter��setter����
 */
public class Car {
//	a)��Ա����: ״̬(status),true��ʾ����״̬һ��,false��ʾֹͣ״̬.
	private boolean status;
//	b)��Ա�ڲ���: ������(Engine)
	public class Engine{
//		i.��Ա����:work()
		public void work(){
//		1.�������������״̬��ӡ�������ͷ�����ת
			if(status){
				System.out.println("�������ͷ�����ת");
			}else{
//		2.�����ӡ������ֹͣ����
				System.out.println("������ֹͣ����");
			}
		}
	}
//	״̬(status)��getter��setter����
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
