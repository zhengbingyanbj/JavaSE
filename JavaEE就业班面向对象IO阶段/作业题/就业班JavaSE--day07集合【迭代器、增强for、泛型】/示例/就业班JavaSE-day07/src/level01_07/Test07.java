package level01_07;

/*
 * �Զ��巺����GenericClass<E>,����E���͵ĳ�Ա����,�ṩget/set����,��ʹ�����������
 */
public class Test07 {

	public static void main(String[] args) {
		// 4.�������������.��ָ����������
		GenericClass<Integer> g = new GenericClass<Integer>();
		// 5.����set���������Ӧ������
		g.setElement(100);
		
		// 6.����get������ȡ��Ա������ֵ
		Integer i = g.getElement();
		System.out.println(i);
	}

}

// 1.�Զ��巺����
class GenericClass<E> {

	// 2.����E���͵ĳ�Ա����
	private E element;

	// 3.���get/set����
	public void setElement(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}
}
