package com.itheima.level3;

/*
��ʹ�ô���ʵ��
	�ֱ�ʹ��String��+= ��StringBuilder��append�������ַ�����100000��ƴ��,
	����Stringƴ��100000�λ���ʱ����StringBuilderƴ��100000��������ʱ�䲢��ӡ
1.�ڰ�com.itheima.level3��,������Test19��,��Test19����
2.�ṩmain����,��main������
	a) ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĿ�ʼʱ��,ʹ��start��������
	b)��Ҫ����ִ�����ܵĴ���
	c)ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĽ���ʱ��,ʹ��end��������
	d)�������ִ�л��ѵ�ʱ�� end - start,�������ִ�����ĵ�ʱ��
3.дһ����̬����: testString(),�ڸ÷�����
	a)����һ���ַ��� str,��������
	b)дһ��ѭ��100000��forѭ��,��ѭ����д��
		i.str +=��������ݡ� ; ���ﲻҪдstr += (str+��xxx��) �����ᵼ�¶��ڴ��������.
	c)��mian������,��Ҫ�������ܵĴ��봦,���ñ�����
	d)���г���,��¼ִ�е�ʱ��
	e)ע�͵��������
4.дһ����̬����:testStringBuilder(),�ڷ�����
	a)����һ��StringBuilder����sb,��ʼ������testString()�е��ַ�����ͬ
	b)дһ��ѭ��100000��forѭ��,��ѭ����д��
		i.����sb.append()����,�����������testString()������+=���������һ��
	c)ѭ����������sb.toString()����ת��Ϊ�ַ���
	d)��mian������,��Ҫ�������ܵĴ��봦,���ñ�����
	e)���г���,��¼ִ�е�ʱ��
 */
public class Test19 {
	public static void main(String[] args) {
//		a) ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĿ�ʼʱ��,ʹ��start��������
		long start = System.currentTimeMillis(); 
//		b)��Ҫ����ִ�����ܵĴ���
		//testString(); //����ʱ��: 29295����
		testStringBuilder();//����ʱ��:6����
//		c)ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĽ���ʱ��,ʹ��end��������
		long end = System.currentTimeMillis();
//		d)�������ִ�л��ѵ�ʱ�� end - start,�������ִ�����ĵ�ʱ��
		System.out.println("�����ѵ�ʱ��Ϊ:"+(end-start));
	}
	
//	3.дһ����̬����: testString(),�ڸ÷�����
	public static void  testString(){
//	a)����һ���ַ��� str,��������
		String str = "hello";
//	b)дһ��ѭ��100000��forѭ��,��ѭ����д��
		for(int i = 0; i<100000;i++){
//		i.str +=��������ݡ� ; ���ﲻҪдstr += (str+��xxx��) �����ᵼ�¶��ڴ��������.
			str += "world";
		}
	}
// 4. дһ����̬����:testStringBuilder(),�ڷ�����
	public static void testStringBuilder(){
//		a)����һ��StringBuilder����sb,��ʼ������testString()�е��ַ�����ͬ
		StringBuilder sb = new StringBuilder("hello");
//		b)дһ��ѭ��100000��forѭ��,��ѭ����д��
		for(int i = 0; i<100000;i++){
//			i.����sb.append()����,�����������testString()������+=���������һ��
			sb.append("world");
		}
//		c)ѭ����������sb.toString()����ת��Ϊ�ַ���
		String newStr = sb.toString();
	}
}
