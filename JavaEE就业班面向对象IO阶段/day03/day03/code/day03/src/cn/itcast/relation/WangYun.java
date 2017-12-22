package cn.itcast.relation;

public class WangYun extends WangYunDie implements MaYun,WangJianLin{

	@Override
	public void taobao() {
		System.out.println("开网店 卖红薯");
	}

	@Override
	public void wanda() {
		System.out.println("在万达广场 卖红薯");
	}

	@Override
	public void footballteam() {
		System.out.println("足球");
	}

}
