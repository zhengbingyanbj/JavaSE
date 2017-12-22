package cn.itcast04.innercalss;
/*
 * 内部类 
 *    在一个类的内部 声明了一个类 
 *    
 *    举个栗子 
 *      class A{
 *         class B{}
 *      }
 *      
 *      B是A的内部类
 *      A是B的外部类
 *      
 *      内部类按照位置 分成两种 
 *        1：成员内部类
 *              定义在成员位置   类中方法外 
 *              
 *        2：局部内部类
 *             定义在局部位置    方法中
 */
public class InnerClass {
     public static void main(String[] args) {
		//Heart h = new Heart();
    	 ZhiZunBao zzb = new ZhiZunBao();
    	 
    	 ZhiZunBao.Heart zzbh = new ZhiZunBao().new Heart();
    	 
    	 zzbh.speak();
	}
}
