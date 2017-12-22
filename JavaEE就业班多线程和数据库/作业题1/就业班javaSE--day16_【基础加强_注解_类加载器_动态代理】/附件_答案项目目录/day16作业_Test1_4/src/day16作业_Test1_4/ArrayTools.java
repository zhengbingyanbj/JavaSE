package day16作业_Test1_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayTools {
	public void printArray(int[] arr){
		StringBuilder bud = new StringBuilder("[");
		for(int i = 0;i < arr.length ; i++){
			bud.append(arr[i]);
			if(i < arr.length -1){
				bud.append(", ");
			}else{
				bud.append("]");
			}
		}
		System.out.println(bud.toString());
	}
	@Before
	public void check(){
		System.out.println("之前执行......");
	}
	@After
	public void log(){
		System.out.println("之后执行......");
	}
	@Test
	public void test(){
		int[] arr = {1,432,4,36,45,431,21,45,4,42,14,5,4};
		printArray(arr);
	}
}	
