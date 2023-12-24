package coreJava;

import java.util.Arrays;

public class ArrayLP {
	int[] meth1() {
		int[] arr = { 3, 1, 4 };

		return arr;
	}

	int meth2(int arr[]) {
		return arr.length;
	}

	int[] meth3() {
		int arr[] = { 1, 2, 3 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 2 && arr[i + 1] == 3) {
				arr[i + 1] = 0;
			}
		}
		return arr;
	}

	int meth4(int[] arr) {
		if (arr.length >= 2)
			return arr[0] + arr[1];
		else if (arr.length == 1)
			return arr[0];
		else
			return 0;
	}

	public boolean fl6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public boolean sfl(int a[]) {
		if (a.length >= 1 && a[0] == a[a.length - 1])
			return true;
		return false;
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] && a[a.length - 1] == b[b.length - 1])
			return true;
		return false;
	}

	// 2

	public int[] rotateleft3(int[] nums) {
//		int x=nums[0];
//		nums[0]=nums[1];
//		nums[1]=nums[2];
//		nums[2]=x;

		int x = nums[0];
		for (int i = 0; i < 2; i++) {
			nums[i] = nums[i + 1];
		}
		nums[2] = x;
		return nums;
	}

	public int[] maxEnd3(int[] nums) {
		if (nums[0] >= nums[nums.length - 1]) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = nums[0];
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = nums[nums.length - 1];
			}
		}
		return nums;
	}

	public int[] middleWay(int[] a, int[] b) {
		int c[] = { a[1], b[1] };
		return c;
	}

	public int[] makeEnds(int[] nums) {
		int arr[] = { nums[0], nums[nums.length - 1] };
		return arr;
	}

	public int[] makeLast(int[] nums) {
		int arr[] = new int[nums.length * 2];

		arr[arr.length - 1] = nums[nums.length - 1];
		return arr;
	}

	public static void main(String[] args) {
		ArrayLP obj = new ArrayLP();

		// int[] result = obj.meth1();
		// System.out.println(Arrays.toString(result));
		// System.out.println(obj.meth2(result));

		// System.out.println("meth3 : "+Arrays.toString(obj.meth3()));

		// int[] nums = {5,3,4};
		// System.out.println("sum = "+obj.meth4(nums));

		// int[] arr = {6,8,9};
		// System.out.println("meth4 : "+obj.fl6(arr));

		// int arr[] = {3,2,3};
		// System.out.println("sfl = "+obj.sfl(arr));

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 1, 4, 3 };
		System.out.println(obj.commonEnd(a1, a2));

		int arr[] = { 1, 2, 3 };
		System.out.println("new array :" + Arrays.toString(obj.rotateleft3(arr)));

		int arr2[] = { 11, 2, 3 };
		System.out.println(Arrays.toString(obj.maxEnd3(arr2)));

		int a3[] = { 7, 7, 7 };
		int a4[] = { 3, 6, 0 };
		System.out.println(Arrays.toString(obj.middleWay(a3, a4)));

		int ar[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(obj.makeEnds(ar)));

		int ar1[] = { 4, 5, 6 };
		System.out.println(Arrays.toString(obj.makeLast(ar1)));
	}
}
