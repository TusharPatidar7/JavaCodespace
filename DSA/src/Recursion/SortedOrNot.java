package Recursion;

import java.util.Arrays;

public class SortedOrNot {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 11, 9, 9 };

		System.out.println(isSorted(arr, arr.length));
	}

	static boolean isSorted(int[] arr, int length) {
		
		if(length == 0 || length ==1)
			return true;
		
		if(arr[0]>arr[1])
			return false;
		
		int temp[] = Arrays.copyOfRange(arr, 1, length);
		return isSorted(temp, length-1);
	}

}
