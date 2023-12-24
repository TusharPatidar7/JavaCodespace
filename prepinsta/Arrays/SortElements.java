package prepinsta.Arrays;

import java.util.Arrays;

public class SortElements {

	public static void main(String[] args) {
		int arr[] = {5,3,6,2,3,8};
		
		System.out.println(Arrays.toString(sort(arr)));
	}
	static int[] sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
