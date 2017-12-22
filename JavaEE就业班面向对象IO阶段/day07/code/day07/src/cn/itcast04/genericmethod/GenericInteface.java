package cn.itcast04.genericmethod;
/*
 * 定义在接口上 
 *    格式 
 *     修饰符  interface 接口名<泛型的表示>{}
 */
public interface GenericInteface<E>{
   
	public abstract void add(E e);
	
	public abstract E get();
}
