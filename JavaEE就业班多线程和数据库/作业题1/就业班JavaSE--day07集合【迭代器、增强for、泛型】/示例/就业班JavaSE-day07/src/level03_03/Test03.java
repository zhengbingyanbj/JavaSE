package level03_03;

/*
 * ͳ��101-200֮���ж��ٸ���������������������������ֽ����������ǳ���1��������֮�⣬��Ҳû�������ܱ�������������
 */
public class Test03 {

	public static void main(String[] args) {
		// �����������
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			// 103 / 2 3 4 5 6 7 8 9 ... 102
			boolean flag = false;

			for (int j = 2; j < i; j++) {
				// ��������������
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) { // û�б�������������������
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("��101~200֮��һ����������" + count + "��");
	}
}
