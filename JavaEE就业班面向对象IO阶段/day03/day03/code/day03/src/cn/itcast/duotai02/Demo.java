package cn.itcast.duotai02;
/*
 * 研究 多态中 成员的访问特点
 *   
 *  多态中的成员变量访问特点 
 *   
 *     编译阶段 
 *         编译的时候 检查语法错误
 *         看左边
 *     运行阶段
 *         看左边 
 *  
 *   总结
 *     多态中成员变量访问特点  
 *      编译看左边  运行看左边       
 *      
 *   多态中 成员方法的访问特点  
 *      编译阶段
 *         检查语法错误 
 *         看左边
 *      运行阶段
 *         执行的是子类重写后的方法 
 *         先去子类中寻找方法
 *         看右边
 *         
 *      最后需要大家 记住一句话  
 *      编译永远看左边
 *      
 *      运行只有成员方法看右边
 */
public class Demo {
  public static void main(String[] args) {
	  
	  //代码体现多态  
	  Fu f = new Zi();
	 
	  System.out.println(f.num);
	  //表象为父类  这个时候是在 编译阶段
//	  System.out.println(f.num2);
	  
	  f.show();
	  
//	  f.method();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
