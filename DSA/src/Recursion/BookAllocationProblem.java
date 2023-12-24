package Recursion;

public class BookAllocationProblem {

	// You have to allocate the book to 'm' students such that
	// the maximum number of pages assigned to a student is minimum.
	static int ans = -1;

	public static void main(String[] args) {
		int arr[] = { 2, 8, 8, 4, 5  }; // pages
		int n = arr.length; // books
		int m = 6; // students
		int e = 0; // for sum of pages;

		for (int i = 0; i < n; i++) {
			e += arr[i];
		}
		int ans = allocateBooks(arr, 0, e, m, n);
		System.out.println(ans);
	}

	static int allocateBooks(int[] arr, int s, int e, int m, int n) {
		
		if(m>n) return -1;

		if (s > e)
			return ans;

		int mid = s + (e - s) / 2;

		if (isPossible(arr, m, n, mid)) {
			ans = mid;
			System.out.println(ans);
			return allocateBooks(arr, s, mid - 1, m, n);
		} 
		else {
			return allocateBooks(arr, mid + 1, e, m, n);
		}

	}

	static boolean isPossible(int[] arr, int m, int n, int mid) {

		int countS = 1;
		int pageSum = 0;

		for (int i = 0; i < n; i++) {

			if (pageSum + arr[i] <= mid) {
				pageSum += arr[i];
			} 
			else {
				countS++;

				if (countS > m || arr[i] > mid) {
					return false;
				}
				pageSum = arr[i];
			}
		}

		return true;
	}

}
