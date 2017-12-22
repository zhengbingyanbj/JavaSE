package cn.itcast05.changeargs;
/*
 * �ɱ���� 
 * 
 *   public static int getSum(int... arr)
 *                     ���� ������
 *   public static int getSum(int[] arr)
 *   
 *   �ɱ���� �����������֮��  
 *      ���������ﴫ�ݸ����͵�����  
 *      �����Դ��� �����͵� 0~n ���� 
 *   ����д��ʱ�� ��0~n�����͵Ĳ��� 
 *     �����ڱ����ڱ����ʱ�� �� ��Щ����  ת����������ʽ   
 *      
 *      �ɱ����ֻ�����ڲ����б����
 */
public class ChangeArgs {
    
	public static void main(String[] args) {
		int[] arr = {2,42,12,31,3};
		
		System.out.println(getSum(arr));
		
		// 313,3313,1,21,3,2123,3131,331313
		//���´���һ������ ���ù���
		//3,6
		//���� ����һ������ ���ù���
		//5,33,4,143
		System.out.println(getSum(3));
		System.out.println(getSum(3,3,4,23,4321,3));
		System.out.println(getSum(3,3,4,23,4321,3,341,43,41,24));
		System.out.println(getSum());
		
	}
	/*
	 * д������ ������������Ԫ�صĺ�
	 */
//	public static int getSum(int[] arr){
//		//������ͱ���
//		int sum = 0;
//		for (int a : arr) {
//			sum += a;
//		}
//		return sum;
//	}
	/*
	 * ʹ�ÿɱ���� ��ɲ���
	 */
	public static int getSum(int... arr){
		//������ͱ���
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum;
	}
}
