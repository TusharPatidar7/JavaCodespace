package dsaPractise.binarySearch;

public class InMountainArray {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,0};
		int target = 0;
		System.out.println(new InMountainArray().findInMountainArray(target, arr));
	}
	//Find element in Mountain Array
	
	public int findInMountainArray(int target, int[] arr) {
		
		int start = 0;
        int end = arr.length-1;
        //Search for peak index
        while(start<end){
           int mid = start + (end-start)/2;

           if(arr[mid]>arr[mid+1]){
            	//you are in dec part of array, this may be the ans
                //but look at left, this is way end != mid-1
                end = mid;
            }
           else {
        	   start =mid+1;
           }
        }
        //Start==end is the peak index
        
        //Search in the first half
        int a = binarySearch(arr, 0, end, target);
        if(a==-1) {
        	//Search in second half
        	a = binarySearch(arr, end+1, arr.length-1, target);
        }
        return a;
	}
	
	//order Agnostic binary search
	int binarySearch(int [] arr, int s, int e, int target) {
		int start = s;
		int end =e;
		boolean isAsc =arr[start] <arr[end];
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target) {
            	return mid;
            }
            
            if (isAsc) {
            	if(target < arr[mid]) {
            		end = mid-1;
            	}else {
            		start = mid+1;
            	}
            }
            else {
            	if(target > arr[mid]) {
            		end = mid-1;
            	}else {
            		start = mid+1;
            	}           	
            }
        }
        return -1;
	}
}
