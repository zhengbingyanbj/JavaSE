package day16作业_Test1_3;

import org.junit.Test;

public class ArrayTools {
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 0;i < arr.length ; i++){
			max = arr[i] > max ? arr[i] : max;
		}
		return max;
	}
	@Test
	public void test(){
		int[] arr = {1,3,4,32,43254,41,4,3,5,664,67,887,1645,1,4,5647516};
		System.out.println("最大值：" + getMax(arr));
	}
}
