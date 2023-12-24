package dsaPractise.binarySearch;

import java.util.Arrays;

public class FirstLastIndex {

	public static void main(String[] args) {
		int [] arr = {1,2,3,3,4,5};
		
		int[] ans = findIndex(arr, arr.length-1, 3);
		System.out.println(Arrays.toString(ans));
	}
	static int[] findIndex(int[] arr, int l, int target) {
		int[] ans = {-1,-1};
		int start = 0;
		int end = l;
		while(start<=end) {
			int mid = end+(start-end)/2;
			if(arr[mid] == target) {
				ans[0]=mid;
				end = mid-1;
			}
			else if(arr[mid]>target) {
				end = mid-1;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
		}
		start = 0;
		end = l;
		while(start<=end) {
			int mid = end+(start-end)/2;
			if(arr[mid] == target) {
				ans[1]=mid;
				start = mid+1;
			}
			else if(arr[mid]>target) {
				end = mid-1;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
		}
		return ans;
	}
	
	// 2nd
	
	public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        int start=search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }
    int search(int[] nums,int target,boolean isfindstart){
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target > nums[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(isfindstart){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
