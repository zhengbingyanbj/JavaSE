package com.itheima.level2_01;
/*
  ��ʹ�ô���������
	100Ԫŵ�����ֻ�(Phone)���Դ�绰(call)�ͷ�����(sendMessage)
	3000Ԫ�Ļ�Ϊ�����ֻ����Դ�绰,�����ź�����Ϸ(playGame)
	2000Ԫ��iPad ƽ��,��������(listenMusic)������Ϸ.
	Ҫ��: ���ֻ��Ĺ�����ȡ��������,���ԵĹ��ܷŵ��ӿ�.  

1.��������Ϸ(PlayGame)�ӿ�
	a)�������� playGame()
2.�����ֻ���(Phone)��
	a)����: Ʒ��(brand),�۸�(price)
	b)����: 
		i.��绰(call(String name))
			1.�����ʽ: ��ʹ��100 Ԫ ŵ���� �ֻ� �� ���� ��绰
		ii.������(sendMessage(String name))
			1.�����ʽ: ��ʹ��100 Ԫ ŵ���� �ֻ� �� ���� ������
	c)�ṩ �ղ�,�вι���;setters��getters����
3.���������ֻ�(SmartPhone)��̳��ֻ���(Phone),ʵ������Ϸ�ӿ�(PlayGame())
	a)ʵ��playGame()����
		i.��ʹ��3000Ԫ�� ��Ϊ �ֻ�����Ϸ
	b)�ṩ�ղ�,�вι���
4.����ƽ��(Pad)��,ʵ��PlayGame�ӿ�
	a)����:Ʒ��(brand),�۸�(price)
	b)��Ա����
		i.ʵ��playGame()����
			1.�����ʽ: ��ʹ��2000Ԫ��iPadƽ������Ϸ
		ii.���з���: ������(listenMusic)
			1.�����ʽ: ��ʹ��2000Ԫ��iPadƽ��������
	c)�ṩ�ղ�,�вι���,setters��getters����
5.���������Test
	a)�����ֻ����� njy,Ʒ�Ƹ�ֵΪŵ����,�۸�ֵΪ100
	b)�����ֻ����� njy�Ĵ�ӡ�绰�ͷ����Ź���,���� ����
	c)���������ֻ����� sp,Ʒ�Ƹ�ֵΪ��Ϊ,�۸�ֵΪ3000
	d)�����������ݶ���sp�Ĵ�绰,�����Ź��ܶ�������˼��, ��������Ϸ����
	e)����ƽ����� p,Ʒ�Ƹ�ֵΪiPad,�۸�ֵΪ2000
	f)����ƽ��p��������������Ϸ����.

 */
public class Test {
	public static void main(String[] args) {
//		a)�����ֻ����� njy,Ʒ�Ƹ�ֵΪŵ����,�۸�ֵΪ100
		Phone njy = new Phone();
		njy.setBrand("ŵ����");
		njy.setPrice(100);
//		b)�����ֻ����� njy�Ĵ�ӡ�绰�ͷ����Ź���,���� ����
		njy.call("����");
		njy.sendMessage("����");
//		c)���������ֻ����� sp,Ʒ�Ƹ�ֵΪ��Ϊ,�۸�ֵΪ3000
		SmartPhone sp = new SmartPhone("��Ϊ", 2000);
//		d)�����������ݶ���sp�Ĵ�绰,�����Ź��ܶ�������˼��, ��������Ϸ����
		sp.call("��˼��");
		sp.sendMessage("��˼��");
		sp.playGame();
//		e)����ƽ����� p,Ʒ�Ƹ�ֵΪiPad,�۸�ֵΪ2000
		Pad p = new Pad("iPad", 2000);
//		f)����ƽ��p��������������Ϸ����.
		p.listenMusic();
		p.playGame();
	}
}
