package cn.itcast.notebooktest;

public class Keyboard implements USB{

	@Override
	public void link() {
		System.out.println("��������");
	}

	@Override
	public void unlink() {
		System.out.println("���̶Ͽ�");
	}

}
