package level01_09;

/*
 * ����һ������add����0�������ϵ�int��������,��������������ǽ������int���͵�ֵ�������,��������Ӻ�Ľ��
 */
public class Test09 {
	public static void main(String[] args) {
		// 6.����add�������������int���͵Ĳ���
		add(1);
		add(1, 2);
		add(1, 3, 5);
	}

	// 1.����add����.�����ǿɱ����(int... arr)
	public static int add(int... arr) {
		// 2.��add����������ͱ���sum
		int sum = 0;
		
		// 3.ʹ����ǿfor��ȡÿ������
		for (int i : arr) {
			// 4.��ÿ���������ӵ���ͱ���sum��
			sum += i;
		}
		// 5.����sum
		return sum;
	}

}