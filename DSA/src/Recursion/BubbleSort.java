package Recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4};
		
		int[] ans = sort(arr, arr.length);

		Arrays.stream(arr).forEach(System.out::print);
	}
	static int[] sort(int[] arr, int n) {
		//base case
		if(n==0 || n==1) return arr;
		
		
		//1st case solved
		for(int i=0; i<n-1; i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		//Recursive call
		return sort(arr, n-1);
	}

}
