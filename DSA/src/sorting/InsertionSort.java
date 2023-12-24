package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5,2,3,9,1,7};
		//1st  {2,5,3,9,1,7}
		//2nd  {1,2,3,5,9,7}.....
		sort(arr);
	}
	static void sort(int[] arr) {
		
		int n=arr.length; 
		
		for(int i=1; i<n; i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0) {
				if(arr[j]>temp) {
					//shift
					arr[j+1] = arr[j];
				}
				else
				{
					break;
				}
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
