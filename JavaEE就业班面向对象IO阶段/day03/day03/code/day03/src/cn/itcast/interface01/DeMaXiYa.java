package cn.itcast.interface01;
/*
 * 
 *   ��ʵ�� �ӿ�      ʵ�ֵ����ֶ��� ������ �̳�
 *       
 *        ������(ʵ����)ʵ�ֽӿں󣬾��൱������������Ӧ�þ߱�����ӿ��еĹ��ܡ�
 *        ��ô���Ҫ ��д ���з���
 *        
 *        ʵ�ֵĸ�ʽ
 *        
 *        class �� implements �ӿ���{
 *           ��д���з���
 *        }
 */
public class DeMaXiYa implements JiNeng{

	@Override
	public void Q() {
		System.out.println("��Ĭ");
	}

	@Override
	public void W() {
		System.out.println("����");
	}

	@Override
	public void E() {
		System.out.println("��ת");
	}

	@Override
	public void R() {
		System.out.println("�󱦽�  �����ʤ");
	}

}
