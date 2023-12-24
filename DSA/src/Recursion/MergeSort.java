package Recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,2,3,8,4,6};
		int n = 6;
		arr = mergeSort(arr, 0, n-1);
		
		Arrays.stream(arr).forEach(System.out::println);
	}
	static int[] mergeSort(int[] arr, int low, int high) {
		
		if(low >= high) return arr;//base case
		
		int mid = (low+high)/2;
		
		arr = mergeSort(arr, low, mid);//left part
		
		arr = mergeSort(arr, mid+1, high);//right part
		
		arr = merge(arr, low, mid, high);//merging sorted parts
		
		return arr;
	}
	static int[] merge(int[] arr, int low, int mid, int high) {
		
		int[] temp = new int[high-low+1];
		
		int left = low;
		int right = mid+1;
		int k=0;
 		while(left<=mid && right <= high) {
 			if(arr[left] <= arr[right]) {
 				temp[k++] = arr[left++];
 			}
 			else {
 				temp[k++] = arr[right++];
 			}
 		}
 		while(left<=mid) {
 			temp[k++] = arr[left++];
 		}
 		while(right<=high) {
 			temp[k++] = arr[right++];
 		}
 		
 		//Modifying the original array after sorting
 		for(int i=low; i<=high; i++) {
 			arr[i] = temp[i-low];
 		}
 		return arr;
	}
}
