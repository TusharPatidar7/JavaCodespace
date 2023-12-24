package prepinsta.Recursion;

public class SmallestInArray {

	static int min =Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		int []arr = {11,12,33,44,55,-1241242,1231};
		
		int ans = SmallestInArray.findSmallest(arr,0);
		System.out.println(ans);
	}
	
	static int findSmallest(int[] arr, int i) {
		
		if(i==arr.length-1) return Math.min(min, arr[i-1]);
		
		min = Math.min(min, arr[i]);
		i++;
		return findSmallest(arr,i);
	}

}
