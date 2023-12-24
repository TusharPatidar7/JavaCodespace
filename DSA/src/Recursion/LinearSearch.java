package Recursion;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 11, 9, 9 };
		int key = 1;
		System.out.println(search(arr, arr.length, key));
	}

	static boolean search(int[] arr, int length, int key) {

		if (length == 0)
			return false;

		if (arr[0] == key)
			return true;
		else {
			int temp[] = Arrays.copyOfRange(arr, 1, length);
			return search(temp, length - 1, key);
		}
	}

}
