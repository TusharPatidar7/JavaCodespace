package dsaPractiseArrays;

import java.util.Arrays;

public class SortArray {

	static int[] arr= {1,1,1,0,0,1,0,1,1,0};
	
	static void sort(int[] arr) {
		int n=arr.length-1;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				while(i<n && arr[n]==1 ) 
				{
					n--;
				}
				int temp = arr[i];
				arr[i]=arr[n];
				arr[n]=temp;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		SortArray.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
