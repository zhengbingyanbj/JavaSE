package cn.itcast.relation;

public class WangYun extends WangYunDie implements MaYun,WangJianLin{

	@Override
	public void taobao() {
		System.out.println("������ ������");
	}

	@Override
	public void wanda() {
		System.out.println("�����㳡 ������");
	}

	@Override
	public void footballteam() {
		System.out.println("����");
	}

}
