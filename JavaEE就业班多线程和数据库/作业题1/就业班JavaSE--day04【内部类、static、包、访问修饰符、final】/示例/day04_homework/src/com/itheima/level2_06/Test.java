package com.itheima.level2_06;
/*
 ���ô��������� 
ĳ��У�ٳ���һ��������ֲ�,ֻҪ�ǻ������,������,������Ŀ��Բμ�.
Ҫ��: ʹ�õ��ӿ�,�ӿ���Ϊ����,�����ڲ���.
��ʾ: �Ѵ�����,������,�������ܳ�ȡ���ӿ��� ,�ڲ��������ṩ������ֲ��ľ�̬����,����Ϊ�ӿ���; 

1.����ӿ�(Player)
	a)���󷽷�: ������(playBasketball),������(playFootball),������(playVolleyball)
2.���������Test
	a)���徲̬����:�������л�(join(Player p)),�ڷ����е���p�� ������,������,������ ����
	b)�ṩmain����
		c)��main������
		i.����join(Player p),����ʹ��Player �ӿڵ������ڲ��ഴ������������; 
		ii.�������ڲ�����
			1.��дplayBasketball()����
				a)���: �ڴ�����
			2.��дplayFootball()����
				a)���: ��������
			3.��дplayVolleyball()����
				a)���: �ڴ�����
 */
public class Test {
//	a)���徲̬����:�������л�(join(Player p)),�ڷ����е���p�� ������,������,������ ����
	public static void join(Player p){
		p.playBasketball();
		p.playFootball();
		p.playVolleyball();
	}
	
	public static void main(String[] args) {
//		i.����join(Player p),����ʹ��Player �ӿڵ������ڲ��ഴ������������; 
		join(new Player() {
//			ii.�������ڲ�����
//			1.��дplayBasketball()����
//				a)���: �ڴ�����
		   public void playBasketball() {
			   System.out.println("������");
			}
//			2.��дplayFootball()����
//				a)���: ��������
			public void playFootball() {
				System.out.println("������");
			}
//			3.��дplayVolleyball()����
//				a)���: �ڴ�����
	
			public void playVolleyball() {
				System.out.println("������");
			}
		});
	}
}
