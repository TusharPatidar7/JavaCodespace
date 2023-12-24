package prepinsta.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(findSum(arr, 0)); 
	}
	static int findSum(int[] arr, int i) {
		if(i==arr.length-1) return arr[i];
		
		return arr[i]+findSum(arr,++i);
	}

}
