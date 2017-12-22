package cn.itcast02.exception;
/*
 * Throwable 类是 Java 语言中所有错误或异常的超类 
 * 
 *   回顾一下你知道的异常 
 *      空指针异常  索引越界异常  类型转换异常  数学异常
 *      
 *      IO异常  文件找不到异常
 * 
 *    异常体系
 *      Throwable 
 *         |---Error 错误 系统级别   艾滋  癌症
 *            OutOfMemoryError  内存溢出  
 *                
 *         |---Exception  异常   代码级别
 *          ArrayIndexOutOfBoundsException 索引越界异常 
 *             感冒  阑尾炎 
 *             |-- 编译期异常 非RuntimeException
 *                   编译期的时候 代码提示出来的 
 *                    需要你给出处理方式 否则编译不通过
 *                   如果代码执行过程中 有了问题 那么会爆出 
 *             |-- 运行期异常 RuntimeException
 *                   编译期没有任何提示
 *                   如果代码执行中 有了问题  会爆出
 *             
 */
public class ExceptionDemo {
      public static void main(String[] args) {
		   //int[] arr = new int[1024*1024*1024];
    	  
    	  int[] arr = {1,2,1};
    	  
    	  System.out.println(arr[3]);
	  }
}
