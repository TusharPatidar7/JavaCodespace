package dsaPractiseArrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
//
		int[] a = { 2, 4, 6, 0,0,0,0 };
		int[] b = { 1, 3, 5, 8 };
		
		merge(a, 3, b, b.length);
		
//		int l1 = a.length;
//		int l2 = b.length;
//		int[] c = new int[l1 + l2];
//		int i = 0, j = 0, k = 0;
//		while (i < l1 && j < l2) {
//			if (a[i] < b[j]) {
//				c[k++] = a[i++];
//			} else {
//				c[k++] = b[j++];
//			}
//		}
//
//		while (j < l2) {
//			c[k++] = b[j++];
//		}
//
//		while (i < l1) {
//			c[k++] = a[i++];
//		}
//
//		System.out.println(Arrays.toString(c));
	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	 
		 int i = m-1, j=n-1;
		 int k = m+n-1;
		 while(j>=0) {
			 if(i>=0 && nums1[i]>nums2[j]) {
				 
				 nums1[k--] = nums1[i--];
			 }
			 else {
				 nums1[k--] = nums2[j--];				 
			 }
		 }
		 System.out.println(Arrays.toString(nums1));
	 }
		

}
