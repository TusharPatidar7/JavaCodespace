package prepinsta.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(findReverse(arr, 0)));
	}

	static int[] findReverse(int[] arr, int i) {
		if (arr.length%2 == 0 && i == arr.length/2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			return arr;
		}
		else if(i == arr.length/2) {
			return arr;
		}
		int temp = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = temp;
		
		return findReverse(arr,++i);
	}

}
