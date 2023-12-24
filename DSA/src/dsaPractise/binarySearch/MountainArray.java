package dsaPractise.binarySearch;

public class MountainArray {

	public static void main(String[] args) {
		int []arr = {0,3,5,12,2};
		System.out.println(new MountainArray().peakIndexInMountainArray(arr));
	}
	public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;

           if(arr[mid]>arr[mid+1]){
            	//you are in dec part of array, this may be the an
                //but look at left, this is way end != mid-1
                end = mid;
            }
           else {
        	   start =mid+1;
           }
        }
        return start;
    }
}
