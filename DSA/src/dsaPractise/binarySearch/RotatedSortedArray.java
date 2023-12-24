package dsaPractise.binarySearch;

public class RotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,8,1,3};
		int target = 1;
		
		//taking pivot as 1 in above array
		int pivot = new RotatedSortedArray().findPivot(arr);
		int ans;
		
		if(target>=arr[pivot] && target<=arr[arr.length-1]) {
			ans = new RotatedSortedArray().binarySearch(arr, target, pivot, arr.length-1);
		}
		else {
			ans = new RotatedSortedArray().binarySearch(arr, target, 0, pivot-1);
		}

		//taking pivot as 8 in above array
//		 ans = new RotatedSortedArray().binarySearch(arr, target, 0, pivot-1);
//		if(ans==-1) {
//			ans = new RotatedSortedArray().binarySearch(arr, target, pivot, arr.length-1);
//		}
		System.out.println(ans);
	}
	
	int findPivot(int[] arr) {
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
	
	int binarySearch(int arr[], int target, int s, int e) {
		int mid = s+(e-s)/2;
		while(s<=e) {
			if(arr[mid]==target) {
				return mid;
			}
			else if(target>arr[mid]) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
			mid = s+(e-s)/2;
		}
		return -1;
	}
	
	
//	int findPivot(int[] arr) {
//		int start = 0;
//		int end = arr.length-1;
//		
//		while(start<=end) {
//			int mid = start +(end - start)/2;
//			// 4 case over here
//			
//			if(mid < end && arr[mid]>arr[mid+1]) {
//				return mid;
//			}
//			if(mid > start && arr[mid] < arr[mid - 1]) {
//				return mid-1;
//			}
//			if(arr[mid] <= arr[start]) {
//				end = mid-1;
//			}else {
//				start = mid+1;
//			}
//		}
//		return -1;
//	}
//	int binarySearch(int arr[], int target, int start, int end) 
//	{
//	
//		while(start<=end) {
//			int mid = start +(end-start)/2;
//			
//			if(target>arr[mid]) {
//					start=mid+1;
//			}
//			else if(target<arr[mid]){
//					end=mid-1;
//			}
//			else {
//				return mid;
//			}
//		}
//		return -1;
//	}

}
