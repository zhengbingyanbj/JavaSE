package com.itheima.level2_05;

/*
 1.����ӿ�(Sport)
	a)���󷽷�: ��(run)
2.���������Test
	a)���徲̬����:�������л�(enter(Sport s)),�ڷ����е���s��run����
	b)�ṩmain����
	c)��main������
		i.����enter(Sport s),����ʹ��Sport�ӿڵ������ڲ��ഴ���Ķ���; 
		ii.�������ڲ�������дrun����
			1.���: �μ��˶���,���ܰ�
 */
public class Test {
//	a)���徲̬����:�������л�(enter(Sport s)),�ڷ����е���s��run����
	public static void enter(Sport s){
		s.run();
	}
	
//	ii.�������ڲ�������дrun����
//	  1.���: �μ��˶���,���ܰ�
	public static void main(String[] args) {
//		i.����enter(Sport s),����ʹ��Sport�ӿڵ������ڲ��ഴ���Ķ���; 
		enter(new Sport() {
//			ii.�������ڲ�������дrun����
//			1.���: �μ��˶���,���ܰ�
			public void run() {
				System.out.println("�μ��˶���,���ܰ�");
			}
		});
	}
}
