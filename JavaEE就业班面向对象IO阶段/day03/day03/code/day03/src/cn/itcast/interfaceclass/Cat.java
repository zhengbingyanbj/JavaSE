package cn.itcast.interfaceclass;

public class Cat extends Animal implements MaXiTuan{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void shout() {
		System.out.println("喵~喵~喵~");
	}

	@Override
	public void zuanhuoquan() {
		System.out.println("喵的一下  飒~~~ 过去了 ");
	}

}
