package level03_04;

/*
 * ��50Ԫ�һ���5Ԫ,2Ԫ��1Ԫ.ÿ������Ǯ����Ϊ0��.���м��ֶһ�����.ÿ�ֶһ�������Ǯ����ô����?
 */
public class Test04 {
	public static void main(String[] args) {
		// ����i��5Ԫ��,j��2Ԫ��,k��1Ԫ��
		for (int i = 1; i < 10; i++) {	// 5Ԫ��
			
			for (int j = 1; j < 25; j++) { // 2Ԫ��
				for (int k = 1; k < 50; k++) { // 1Ԫ��
					if (i * 5 + j * 2 + k == 50) {
						System.out.println("5Ԫ�� " + i + " ��,2Ԫ�� " + j + " ��,1Ԫ�� " + k + " ��");
					}
				}
			}
		}
	}
}