package level01_09;

// 3.����Imple01��.ʵ��Inter�ӿ�,ʹ�ö���ʵ����ʱȷ�����͵����ͷ�ʽ
public class Imple01 implements Inter<String> {
	// 4.��дImple01�е�show(String e)����.��ӡ���������
	@Override
	public void show(String e) {
		System.out.println(e);
	}

}
