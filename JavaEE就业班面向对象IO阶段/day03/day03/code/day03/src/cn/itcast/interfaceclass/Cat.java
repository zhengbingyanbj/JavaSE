package cn.itcast.interfaceclass;

public class Cat extends Animal implements MaXiTuan{

	@Override
	public void eat() {
		System.out.println("è����");
	}

	@Override
	public void shout() {
		System.out.println("��~��~��~");
	}

	@Override
	public void zuanhuoquan() {
		System.out.println("����һ��  �~~~ ��ȥ�� ");
	}

}
