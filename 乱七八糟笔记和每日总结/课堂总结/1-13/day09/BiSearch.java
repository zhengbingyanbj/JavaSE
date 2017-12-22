package com.itcast.demo1;

public class BiSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		biSearch(arr,3 );
	}
	public static int biSearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }

}
