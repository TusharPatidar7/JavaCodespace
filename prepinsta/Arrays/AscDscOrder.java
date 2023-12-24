package prepinsta.Arrays;

import java.util.Arrays;

public class AscDscOrder {

	public static void main(String[] args) {
		int[] arr = { 1,7, 2, 3,  5, 8};
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(findReverse(arr, arr.length-1)));
	}

	private static int[] findReverse(int[] arr, int n) {
		
		for(int i=n/2+1 ; i<=n; i++,n--) {
			int temp=arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}
		return arr;
		
	}

}
