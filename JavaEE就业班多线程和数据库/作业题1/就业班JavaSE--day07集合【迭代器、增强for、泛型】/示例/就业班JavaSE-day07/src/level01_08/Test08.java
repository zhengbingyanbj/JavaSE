package level01_08;

/*
 * �Զ��巺�ͷ���function.���Դ���������������t.����������д�ӡ�����t.��ʹ��������ͷ���
 */
public class Test08 {

	public static void main(String[] args) {
		// 3.����function�����ַ���
		function("Hello");
		// 4.����function��������
		function(123);
	}

	// 1.���巺�ͷ���
	public static <E> void function(E e) {
		// 2.�ڷ��ͷ�����,������Ĳ����ŵ���������
		System.out.println(e);
	}
}
