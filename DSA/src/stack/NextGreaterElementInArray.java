package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementInArray {

//For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] 
//and determine the next greater element of nums2[j] in nums2. 
//If there is no next greater element, then the answer for this query is -1.

//Return an array ans of length nums1.length such that ans[i] is the next greater 
//element as described above.
	
	public static void main(String[] args) {

//		Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//				Output: [-1,3,-1]
		
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		
		System.out.println(Arrays.toString(NextGreaterElementInArray.nextGreaterElement(nums1, nums2)));

	}
	
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	 
		 int[] ans = new int[nums1.length];
		 Stack<Integer> stack = new Stack<Integer>();
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 
		 for(int num: nums2) {
			 while(!stack.isEmpty() && num>stack.peek()) {
				 map.put(stack.pop(), num);
			 }
			 stack.add(num);			 
		 }
		 int i=0;
		 for(int num: nums1) {
			 ans[i++] = map.getOrDefault(num, -1);
		 }
		 return ans;
	 }

}
