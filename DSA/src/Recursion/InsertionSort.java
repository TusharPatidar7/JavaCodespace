package Recursion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 21, 3, 6, 23 };

		int[] ans = sort(arr, arr.length);

		Arrays.stream(arr).forEach(System.out::println);
	}

	static int[] sort(int[] arr, int n) {
		//base case
		if(n==0 || n==1) return arr;
		
		int i = arr.length-n+1;
		int temp = arr[i];
		int j = i-1;
		while(j>=0) {
			if(arr[j]>arr[j+1]) {
				arr[j+1] = arr[j];
			}
			else {
				break;
			}
			j--;
		}
		arr[j+1] = temp;
		
		return sort(arr, n-1);
		
	}
}
