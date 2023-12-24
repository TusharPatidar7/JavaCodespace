package dsaPractise.binarySearch;

public class PeakElementInMount {

	public static void main(String[] args) {
		int[] arr = {0,1,2,5,0};
		System.out.println(peakIndexInMountainArray(arr));
	}
	static  int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		while(start<end) {
			if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}
			else {
				end = mid;
			}
			mid = start + (end-start)/2;
		}
        return start;
    }

}
