package Recursion;

import java.util.Arrays;

public class SumArrays {

	public static void main(String[] args) {
		int arr[] = {2,4,9,9,9};
		
		System.out.println(findSum(arr, arr.length));
	}
	static int findSum(int[] arr, int size) {
		
		if(size == 0) {
			return 0;
		}
		if(size == 1) {
			return arr[0];
		}
		
		int temp[] = Arrays.copyOfRange(arr, 1, size); 
		
				
		int sum = arr[0] + findSum(temp, size-1);
		
		return sum;
	}
}
