package level01_09;

/*
 * �Զ���һ�����ͽӿ�Inter <E>,����show(E e)���󷽷�. 
 * 	ʹ��1.����ʵ����ʱȷ�����͵�����, 
 * 		2.����ʵ����ʱ��ȷ�����͵�����2�ַ�ʽ����ʵ����.��ʹ��ʵ����
 */
public class Test09 {

	public static void main(String[] args) {
		// 7.�ڲ������д���Imple01����
		Imple01 i1 = new Imple01();
		// 8.����Imple01���show��������String����
		i1.show("Hello");
		
		// 9.�ڲ������д���Imple02����,��ȷ������ΪInteger����
		Imple02<Integer> i2 = new Imple02<>();
		// 10.����Imple02���show��������Integer����
		i2.show(1234);
	}
}
