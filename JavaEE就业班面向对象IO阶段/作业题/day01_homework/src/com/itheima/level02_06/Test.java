package com.itheima.level02_06;

/*
     ���ô�������
	 ��ɫ��Tomè��Ժ�ץ����
	 ��ɫ��Jerry����ԺͿ���
	 Ҫ��: ��è�͹��Ĺ��Գ�ȡ���������� 
  
4.���������Test
	a)�ṩmain����
	b)��main������
		i.ʹ�ÿղι���,����Cat����c
		ii.��c����ĳ�Աname��ֵΪTom
		iii.��c����ĳ�Աcolor��ֵΪ ��ɫ
		iv.����c�����Ա����eat����
		v.����c����ĳ�Ա����catchMouse()
		vi.ʹ�ÿղι���,����Dog���� d
		vii.��d����ĳ�Աname��ֵΪJerry
		viii.��d����ĳ�Աcolor��ֵΪ ��ɫ
		ix.����d�����Ա����eat����
		x.����d�����Ա���� lookHome����
 */
public class Test {
	public static void main(String[] args) {
//		i.ʹ�ÿղι���,����Cat����c
		Cat c = new Cat();
//		ii.��c����ĳ�Աname��ֵΪTom
		c.name = "Tom";
//		iii.��c����ĳ�Աcolor��ֵΪ ��ɫ
		c.color = "��ɫ";
//		iv.����c�����Ա����eat����
		c.eat();
//		v.����c����ĳ�Ա����catchMouse()
		c.catchMouse();
//		vi.ʹ�ÿղι���,����Dog���� d
		Dog d = new Dog();
//		vii.��d����ĳ�Աname��ֵΪJerry
		d.name = "Jerry";
//		viii.��d����ĳ�Աcolor��ֵΪ ��ɫ
		d.color = "��ɫ";
//		ix.����d�����Ա����eat����
		d.eat();
//		x.����d�����Ա���� lookHome����
		d.lookHome();
	}
}
