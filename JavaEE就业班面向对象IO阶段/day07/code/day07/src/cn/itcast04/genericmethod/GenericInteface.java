package cn.itcast04.genericmethod;
/*
 * �����ڽӿ��� 
 *    ��ʽ 
 *     ���η�  interface �ӿ���<���͵ı�ʾ>{}
 */
public interface GenericInteface<E>{
   
	public abstract void add(E e);
	
	public abstract E get();
}
