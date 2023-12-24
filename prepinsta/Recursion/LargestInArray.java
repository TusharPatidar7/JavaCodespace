package prepinsta.Recursion;

public class LargestInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-15,-6};
		
		System.out.println(Largest(arr, arr.length));
	}
	
	static int Largest(int[] arr, int n) 
	{
		if(n==1) return arr[0];
		return Math.max(arr[n-1],Largest(arr, n-1));
	}
}
