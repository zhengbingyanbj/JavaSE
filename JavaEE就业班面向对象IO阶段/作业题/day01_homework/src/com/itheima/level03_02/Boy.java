package com.itheima.level03_02;

/*
  	2. ����Boy��
 		1. ���ԣ� ���ƣ�name,���䣺age��Ů�ѣ�girlFriend��
 		2. ��Ϊ�� public void walking()
 		        �����ʽΪ�� 45��Ĵ��к���ں�20���СŮ�ѷ�������� 
 		3. �ṩ���ι����setXxx��getXxx����
 */
public class Boy {
//	����
	private String name;
//	����
	private int age;
//	Ů��
	private Girl girlFriend;
	
//	���
	 public void walking(){
		 System.out.println(age+"��Ĵ��к�"+name+"�ں�"+girlFriend.getAge()+"���СŮ��"+girlFriend.getName()+"��� ");
	 }

//	 ���ι���
	public Boy(String name, int age, Girl girlFriend) {
		this.name = name;
		this.age = age;
		this.girlFriend = girlFriend;
	}

//	setters��getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Girl getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(Girl girlFriend) {
		this.girlFriend = girlFriend;
	}
}
