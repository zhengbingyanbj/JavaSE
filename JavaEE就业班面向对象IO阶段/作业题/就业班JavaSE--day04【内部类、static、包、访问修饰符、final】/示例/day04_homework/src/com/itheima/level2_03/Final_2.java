package com.itheima.level2_03;
/*
 2.��֤: final���εķ��������Ա�����,��������û�б�final���η��������า�Ǻ���Լ�final
 
 a)������(Final_2),������֤�ڶ��ص�
	i.��Ա����:
		1.��final���εĳ�Ա���� finalMethod
		2.��ͨ���� normalMethod
b)��������(Sub2) �̳� Final_2
	i.���� finalMethod���뱨��,�����ŵ���ɫx����,��ʾ:Cannot override the final method from Final_2: ��final���η������ܱ�����(��д);
	ii.ע�͵����������,������ʹ��ע��д��: final���η������ܱ�����(��д);
	iii.����normalMethod ����,��Ȩ�����η� �ͷ���ֱֵ�Ӽ���final,����ͨ��,�������������ʹ��ע��д��: ������û�б�final���η��������า�Ǻ���Լ�final
*/

public class Final_2 {
//	1.��final���εĳ�Ա���� finalMethod
	public final void finalMethod(){}
//	2.��ͨ���� normalMethod
	public void normalMethod(){}
}

class Sub2 extends Final_2{
//	final���εķ��������Ա�����
//	public final void finalMethod(){}
	
//	������û�б�final���η��������า�Ǻ���Լ�final
	public final void normalMethod(){}
}


