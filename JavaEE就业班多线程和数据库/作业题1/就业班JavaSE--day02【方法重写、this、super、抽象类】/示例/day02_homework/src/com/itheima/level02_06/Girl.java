package com.itheima.level02_06;

/*
 3. ����Girl��̳�Person��
	a)��Ա����
		i.����(String face)
	b)��Ա����: 
		i.��д�����  void say(String content) ����
			1.�����ʽ: ŷ������΢Ц������������������Ľ����Ӣ˵:�������ҾͰ���.
		ii.���з���: ϴ�·� wash(Clothes c) 
			�����ʽ: ŷ��������ϴһ����ɫ���������ӵ��·�
	c)Ҫ��:
		i.�ṩ�޲κʹ��ι���
		ii.�ṩsetXxx��getXxx����
 */
public class Girl extends Person {
//a)��Ա����
//	i.����(String face)
	private String face;
//b)��Ա����: 
//	i.��д�����  void say(String content) ����
//		1.�����ʽ: ŷ������΢Ц������������������Ľ����Ӣ˵:�������ҾͰ���.
	public void say(String countent){
		System.out.println(getName()+"΢Ц������������������Ľ����Ӣ˵:"+countent);
	}
//	ii.���з���: ϴ�·� wash(Clothes c) 
//		�����ʽ: ŷ��������ϴһ����ɫ���������ӵ��·�
	public void wash(Clothes c){
		System.out.println(getName()+"��ϴһ��"+c.getColor()+"��"+c.getBrand()+"���ӵ��·�");
	}
//c)Ҫ��:
//	i.�ṩ�޲κʹ��ι���
//	ii.�ṩsetXxx��getXxx����
	public Girl() {
		super();
	}
	public Girl(String name, int age, double height,String face) {
		super(name, age, height);
		this.face = face;
	}
}
