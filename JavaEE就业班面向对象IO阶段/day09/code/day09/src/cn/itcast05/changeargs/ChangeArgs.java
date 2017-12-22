package cn.itcast05.changeargs;
/*
 * 可变参数 
 * 
 *   public static int getSum(int... arr)
 *                     本质 是数组
 *   public static int getSum(int[] arr)
 *   
 *   可变参数 这种现象出来之后  
 *      可以往这里传递该类型的数组  
 *      还可以传递 该类型的 0~n 参数 
 *   我们写的时候 是0~n该类型的参数 
 *     但是在编译期编译的时候 将 这些参数  转换成数组形式   
 *      
 *      可变参数只能用在参数列表最后
 */
public class ChangeArgs {
    
	public static void main(String[] args) {
		int[] arr = {2,42,12,31,3};
		
		System.out.println(getSum(arr));
		
		// 313,3313,1,21,3,2123,3131,331313
		//重新创建一个数组 调用功能
		//3,6
		//重新 创建一个数组 调用功能
		//5,33,4,143
		System.out.println(getSum(3));
		System.out.println(getSum(3,3,4,23,4321,3));
		System.out.println(getSum(3,3,4,23,4321,3,341,43,41,24));
		System.out.println(getSum());
		
	}
	/*
	 * 写个方法 求数组中所有元素的和
	 */
//	public static int getSum(int[] arr){
//		//定义求和变量
//		int sum = 0;
//		for (int a : arr) {
//			sum += a;
//		}
//		return sum;
//	}
	/*
	 * 使用可变参数 完成操作
	 */
	public static int getSum(int... arr){
		//定义求和变量
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum;
	}
}
