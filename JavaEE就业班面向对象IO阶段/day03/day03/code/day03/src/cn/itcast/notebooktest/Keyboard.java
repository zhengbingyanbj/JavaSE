package cn.itcast.notebooktest;

public class Keyboard implements USB{

	@Override
	public void link() {
		System.out.println("¼üÅÌÁ¬½Ó");
	}

	@Override
	public void unlink() {
		System.out.println("¼üÅÌ¶Ï¿ª");
	}

}
