package level03_03;

/*
 * ��һ���������������1000��,
 * ���4�����һ�����ʣ��2��,���7�����һ�����ʣ��3��,���9�����һ�����ʣ��5��,����������������м��ֿ���
 */
public class Test03 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 6; i < 1000; i++) {
			if ((i % 4 == 2) && (i % 7 == 3) && (i % 9 == 5)) {
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println("���� " + count + " ���");
	}
	
}