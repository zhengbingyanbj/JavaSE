package com.itheima.level2_01;
/*
 2.�����ֻ���(Phone)��
	a)����: Ʒ��(brand),�۸�(price)
	b)����: 
		i.��绰(call(String name))
			1.�����ʽ: ��ʹ��100 Ԫ ŵ���� �ֻ� �� ���� ��绰
		ii.������(sendMessage(String name))
			1.�����ʽ: ��ʹ��100 Ԫ ŵ���� �ֻ� �� ���� ������
	c)�ṩ �ղ�,�вι���;setters��getters����
 */
public class Phone {
//	a)����: Ʒ��(brand),�۸�(price)
	private String brand;
	private int price;
//	b)����: 
//		i.��绰(call(String name))
//			1.�����ʽ: ��ʹ��100 Ԫ ŵ���� �ֻ� �� ���� ��绰
	public void call(String name){
		System.out.println("��ʹ��"+price+"Ԫ "+brand+" �ֻ� �� "+name+" ��绰");
	}
//		ii.������(sendMessage(String name))
//			1.�����ʽ: ��ʹ��100 Ԫ ŵ���� �ֻ� �� ���� ������
	public void sendMessage(String name){
		System.out.println("��ʹ��"+price+"Ԫ "+brand+" �ֻ� �� "+name+" ������");
	}
//	c)�ṩ �ղ�,�вι���;setters��getters����
	public Phone() {
		super();
	}
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
