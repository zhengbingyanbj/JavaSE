package cn.itcast.duotaibad;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("è����");
	}

	@Override
	public void shout() {
		System.out.println("��~~��~~��~~");
	}
    
	public void play(){
		System.out.println("è��ë��");
	}
}
