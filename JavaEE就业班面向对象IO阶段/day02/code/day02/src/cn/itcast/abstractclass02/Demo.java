package cn.itcast.abstractclass02;
/*
 * 
 *   抽象类 也是一个类 
 *     区别 
 *      1：写法不一样 抽象类需要abstract 
 *      2: 有构造 但是不能创建对象 
 *        为什么不能创建对象  
 *         因为 创建对象调用抽象方法没有意义 所以不可以
 *         抽象类有构造，是为子类服务的 ，子类创建时初始化父类数据用的
 *      3：研究 抽象类的子类 
 *           可以是抽象类 但是一般不这样写 除非特殊设计要求
 *           可以是具体的类 
 *             那么必须 要将 抽象类中 未实现的方法 进行实现 
 *             
 *             也就是 重写所有的抽象方法
 *      
 */
public class Demo {
   public static void main(String[] args) {
	 
//	   Animal a = new Animal();
   }
}
