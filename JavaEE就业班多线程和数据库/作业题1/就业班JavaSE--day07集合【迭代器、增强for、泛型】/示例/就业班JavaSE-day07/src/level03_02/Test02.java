package level03_02;

/*
 * ��дһ�����ͷ�����������֮��.���������Դ���int��long��float��double����.
 *	��ʾ:���Ͳ���ʹ�û�����������,��Ҫʹ��������������.Integer,Long,Float,Double����Number������.
 *	Number��doubleValue()����
 */
public class Test02 {

	// Number: ������ ctrl + t���Կ��������ļ̳���ϵ
	public static void main(String[] args) {
		double a = 10.5;
		double b = 2.5;
		// 3.����sum����,����2��doubleֵ
		double sum = sum(a, b);
		System.out.println(sum);

		int c = 10;
		int d = 20;
		// 4.����sum����,����2��intֵ
		System.out.println(sum(c, d));
		System.out.println(sum(10, 1.2));
	}

	// 1.���巺�ͷ���sum(T a, T b).�����޶�<T extends Number>�ò������ݵ�ʱ��ֻ�ܴ���Number��������
	public static <T extends Number> double sum(T a, T b) {
		// 2.����a��b��T���Ͳ���ֱ�ӽ������
		// 3.�����ݽ�����a��b����doubleValue������ȡ��double���͵�ֵ,�ٽ��мӷ�����
		return a.doubleValue() + b.doubleValue();
	}
}
