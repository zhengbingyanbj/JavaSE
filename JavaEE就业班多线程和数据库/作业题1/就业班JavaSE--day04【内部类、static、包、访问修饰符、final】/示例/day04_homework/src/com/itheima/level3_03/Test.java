package com.itheima.level3_03;
/*
 ��ʹ�ô�������
    ĳ��˾����һ����Ӿ���ֲ�,ֻҪ�ǻ���Ӿ�Ķ����Լ���;
    Ҫ��: ʹ�õ��ӿ�,�ӿ���Ϊ����,�����ڲ���.
    ��ʾ: ����Ӿ���ܳ�ȡ���ӿ��� ,�ڲ��������ṩ�μ��˶���ľ�̬����    
    
1.������Ӿ�߽ӿ�(Swimmer)
	a)���󷽷�: ��Ӿswim
2.���������Test
	a)���������Ӿ���ֲ��ķ���: join(Swimmer s)
		i.�ڷ����е���s��swim����
	b)�ṩmain����
	c)��main������
		i.����join(Swimmer s) ����ʹ�ýӿ�Swimmer�������ڲ��ഴ���Ķ���
		ii.�������ڲ�������дswim����: ���:������Ӿ   
 */
public class Test {
//  a)���������Ӿ���ֲ��ķ���: join(Swimmer s)
	public static void join(Swimmer s){
//		i.�ڷ����е���s��swim����
		s.swim();
	}
	
	public static void main(String[] args) {
//		i.����join(Swimmer s) ����ʹ�ýӿ�Swimmer�������ڲ��ഴ���Ķ���
		join(new Swimmer() {
//			ii.�������ڲ�������дswim����: ���:������Ӿ   
			public void swim() {
				System.out.println("������Ӿ");
			}
		});

	}
}
