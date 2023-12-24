package Recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,21,3,6,23};
		
		int[] ans = sort(arr, arr.length);

		Arrays.stream(arr).forEach(System.out::println);
	}
	static int[] sort(int[] arr, int n) {
		//base case
		if(n==0 || n==1) return arr;
		
		int i = arr.length-n;
		int minIndex = i;
		for(int j = i+1; j< arr.length; j++) {
			if(arr[j]<arr[minIndex]) {
				minIndex = j;//storing smallest number index
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[i];;
		arr[i] = temp;
		
		return sort(arr, n-1);
	}

}
