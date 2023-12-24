package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {4,2,7,10,3};
		
		bubbleSort(arr);
	}
	static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
