package dsaPractise.binarySearch;

public class PivotIndex {

	public static void main(String[] args) {
		int[] arr = {4,5,10,17,1,2,3};
		
		System.out.println(findPivot(arr));
		
	}
	
	static int findPivot(int[] arr) {
		int s=0;
		int e=arr.length-1;
		int mid= s + (e-s)/2;
		
		while(s<e) {
			if(arr[mid]>=arr[0]) {
				s = mid+1;
			}
			else {
				e = mid;
			}
			mid = s + (e-s)/2;
		}
		return s;
	}

}
