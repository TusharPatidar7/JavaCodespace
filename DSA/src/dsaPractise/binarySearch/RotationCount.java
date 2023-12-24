package dsaPractise.binarySearch;

public class RotationCount {

	public static void main(String[] args) {
		int [] arr = {0,1,2};
		
		System.out.println(rotation(arr)+1);
	}
	static int rotation(int [] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			
			int mid=start+(end-start)/2;
			//4 cases
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]<arr[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}	
		return -1;
	}

}
