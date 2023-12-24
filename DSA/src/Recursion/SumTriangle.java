package Recursion;

import java.util.Arrays;

public class SumTriangle {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		printSumTriangle(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void printSumTriangle(int []arr) {
		
		if(arr.length == 1) return;
		
		int [] level = new int[arr.length-1];
		
		for(int i=0; i<level.length; i++) {
			level[i] = arr[i] + arr[i+1];
		}
		
		printSumTriangle(level);
		
		System.out.print("[");
		for(int i=0; i<level.length; i++) {
			System.out.print(level[i]+" ");
		}
		System.out.println("]");
	}

}
