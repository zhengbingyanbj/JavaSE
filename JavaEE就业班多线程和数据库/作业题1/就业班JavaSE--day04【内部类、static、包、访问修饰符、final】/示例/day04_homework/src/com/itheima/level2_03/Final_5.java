package com.itheima.level2_03;
/*
 5. ��֤:���γ�Ա��������Ҫ�ڴ�������ǰ��ֵ�����򱨴�(��û����ʽ��ֵʱ��������췽���ľ���ҪΪ�丳ֵ��
 */
public class Final_5 {
//	����final��Ա����a,����ʾ��ֵ
	public final int a = 10;
	public final int b;
	

	public Final_5() {
//	    �������仰ע��,���뱨��: The blank final field b may not have been initialized
		b = 20;
	}
	
	public Final_5(int a,int b) {
//	  �������仰ע��,���뱨��: The blank final field b may not have been initialized
		this.b = b;

//		this.a = a; //��final���γ�Ա����ֻ�ܸ�ֵһ��
	}
}
