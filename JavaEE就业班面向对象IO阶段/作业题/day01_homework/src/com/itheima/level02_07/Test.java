package com.itheima.level02_07;

/*
 ���ô�������
 	   	 �ĸ����ӵİ�ɫ�����������ܺͼ���
		 �������ӵĺ�ɫ�綯���г������ܺͳ��
		 Ҫ��: �������͵綯���г��Ĺ��Գ�ȡ����ͨ��������
		 
4.���������Test
	c)�ṩmain����
	d)��main������
		i.ʹ�ÿղι���,����Car ����c
		ii.��c����ĳ�Աwheel ��ֵΪ 4
		iii.��c����ĳ�Աcolor��ֵΪ ��ɫ
		iv.����c�����Ա����run����
		v.����c����ĳ�Ա����addGasoline()
		vi.ʹ�ÿղι���,����ElectricBicycle���� eb
		vii.��eb����ĳ�Աwheel ��ֵΪ2
		viii.��ed����ĳ�Աcolor��ֵΪ ��ɫ
		ix.����ed�����Ա����run����
		x.����ed�����Ա���� charge����
 */
public class Test {
	public static void main(String[] args) {
//		i.ʹ�ÿղι���,����Car ����c
		Car c = new Car();
//		ii.��c����ĳ�Աwheel ��ֵΪ 4
		c.wheel = 4;
//		iii.��c����ĳ�Աcolor��ֵΪ ��ɫ
		c.color = "��ɫ";
//		iv.����c�����Ա����run����
		c.run();
//		v.����c����ĳ�Ա����addGasoline()
		c.addGasoline();
//		vi.ʹ�ÿղι���,����ElectricBicycle���� eb
		ElectricBicycle eb = new ElectricBicycle();
//		vii.��eb����ĳ�Աwheel ��ֵΪ2
		eb.wheel = 2;
//		viii.��ed����ĳ�Աcolor��ֵΪ ��ɫ
		eb.color = "��ɫ";
//		ix.����ed�����Ա����run����
		eb.run();
//		x.����ed�����Ա���� charge����
		eb.charge();
	}
}
