package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {6,3,5,1,8,2};
		
		sort(arr);
	}
	static void sort(int[] arr) {
		int n=arr.length;
		
		for(int i=0; i<n; i++) 
		{
			int minIndex = i;
			for(int j=i+1; j<n; j++) 
			{
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
