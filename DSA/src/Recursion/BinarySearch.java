package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,4,5,6,7,8};
		int key = 5;
		int s = 0;
		int e = arr.length-1;
		System.out.println("Element index : "+search(arr, 0, e, key));
	}

	static int search(int[] arr, int s, int e, int key) {
		
		if(s>e)
			return -1;
		
		int mid = s + (e-s)/2;
		
		if(arr[mid] == key)
			return mid;
		
		System.out.println(arr[mid]);
		
		if(arr[mid] < key) {
			return search(arr, mid+1, e, key);
		}
		else {
			return search(arr, s, mid-1, key);
		}
	}

}
