package dsaPractise.binarySearch;

//find Element in a infinite sorted array
public class InfinteArray {

	
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10,12,35,67,88};
		int target = 11;
		
		InfinteArray ir =new InfinteArray();
		//finding start and end index where element is lying
		int Index = ir.StartEnd(arr,target);
		System.out.println(Index == -1 ?  -1 : arr[Index]);
	}

	
	int StartEnd(int[] arr, int target) {
		 int start=0;
		 int end=1;
		while(target > arr[end]) {
			int temp = end+1;
			//Double the box size, end = previous
			end = end + (end - start +1)*2;
			start =temp;
		}
		return FindEle(arr, target, start, end);
	}
	
	int FindEle(int[] arr, int target, int start, int end) {
	
		while(start<=end) {
			int mid=end+(start-end)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
