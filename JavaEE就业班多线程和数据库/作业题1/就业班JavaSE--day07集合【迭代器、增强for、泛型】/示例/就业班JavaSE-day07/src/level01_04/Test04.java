package level01_04;

/*
 * ��int[]�������Ԫ��{11, 22, 33}ʹ����ǿfor���������е�Ԫ��
 */
public class Test04 {

	public static void main(String[] args) {
		// 1.��������
		int[] arr = new int[]{11,22,33};
		
		// 2.ʹ����ǿforѭ����ȡ�����е�Ԫ��
		for (int n : arr) {//����n����������������Ԫ��
			System.out.println(n);
		}

	}

}
