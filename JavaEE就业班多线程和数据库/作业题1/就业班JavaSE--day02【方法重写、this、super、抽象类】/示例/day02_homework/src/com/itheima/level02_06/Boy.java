package com.itheima.level02_06;
/*
 4.����Boy��̳�Person��
	a)��Ա����
		i.Ů���� (girlFriend)
	b)��Ա����: 
		i.��д�����  void say(String content) ����
			�����ʽ:����Ӣ�ô�������֮����������ŷ������˵:�һ��ػ���һ��һ��
		ii.���з���: ɢ�� walking() 
		�����ʽ: Ľ����Ӣ��ŷ�������ںӱߵ�����С������ǣ����ɢ��
	c)Ҫ��:
		i.�ṩ�޲κʹ��ι���
		iii.�ṩsetXxx��getXxx����
 */
public class Boy extends Person {
//a)��Ա����
//	i.Ů���� (girlFirend)
	private Girl girlFriend;
//b)��Ա����: 
//	i.��д�����  void say(String content) ����
//		�����ʽ:����Ӣ�ô�������֮����������ŷ������˵:�һ��ػ���һ��һ��
	public void say(String content){
		System.out.println(getName()+"��������֮����������"+girlFriend.getName()+"˵:"+content);
	}
//	ii.���з���: ɢ�� walking() 
//		�����ʽ: Ľ����Ӣ��ŷ�������ںӱߵ�����С������ǣ����ɢ��
	public void walking(){
		System.out.println(getName()+"��"+girlFriend.getName()+"�ںӱߵ�����С������ǣ����ɢ��");
	}
//c)Ҫ��:
//	i.�ṩ�޲κʹ��ι���
	public Boy() {
		super();
	}
	public Boy(String name, int age, double height,Girl girlFriend) {
		super(name, age, height);
		this.girlFriend = girlFriend;
	}
//	iii.�ṩsetXxx��getXxx����
	public Girl getGirlFriend() {
		return girlFriend;
	}
	public void setGirlFriend(Girl girlFriend) {
		this.girlFriend = girlFriend;
	}
}
