package com.itheima.level2_04;

/*
��ʹ�ô�������
дһ������ʵ���û���½,��,�����û���������
	����û�������,���׳��Զ����½�쳣(LoginException),�쳣��ϢΪ�û���������
	���������˾�Ҳ�׳���½�쳣,�쳣��ϢΪ�������.
	����û��������붼����,���: ��ӭxxx
 
˵��:��ȷ�û��������붼��admin
   
   
1.�����쳣��LoginException�̳�Exception
	a)�ṩ�ղκ��вι���
2.����������Test
	a)�ṩһ�����ڵ�½�ķ���login(String name,String pwd),�ڷŷ�����
		i.����û�������,���׳��Զ����½�쳣(LoginException),�쳣��ϢΪ�û���������
		ii.���������˾�Ҳ�׳���½�쳣,�쳣��ϢΪ�������.
		iii.�������������,��˵���û������붼�ǶԵ�,���: ��ӭxxx
	b)�ṩmain����,��main����
		i.����login����,��������û���,���г���,������ʱ�쳣,Ȼ��ע�����д���
		ii.����login����,������ȷ�û���,���������,���г���,������ʱ�쳣,Ȼ��ע�����д���
		iii.����login����,������ȷ���û���������
 */

public class Test16 {
//	a)�ṩһ�����ڵ�½�ķ���login(String name,String pwd),�ڷŷ�����
	public static void login(String name,String pwd) throws LoginException{
//		i.����û�������,���׳��Զ����½�쳣(LoginException),�쳣��ϢΪ�û���������
		if(!"admin".equals(name)){
			throw new LoginException("�û���:"+name+"������");
		}
//		ii.���������˾�Ҳ�׳���½�쳣,�쳣��ϢΪ�������.
		if(!"admin".equals(pwd)){
			throw new LoginException("�������");
		}
//		iii.�������������,��˵���û������붼�ǶԵ�,���: ��ӭxxx
		System.out.println("��ӭ"+name);
	}
	
	public static void main(String[] args) {
		
		try {
//		i.����login����,��������û���,���г���,������ʱ�쳣,Ȼ��ע�����д���
//			login("ax", "xx");
//			ii.����login����,������ȷ�û���,���������,���г���,������ʱ�쳣,Ȼ��ע�����д���
//			login("admin", "123");
//			iii.����login����,������ȷ���û���������
			login("admin", "admin");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
