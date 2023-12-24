package Recursion;

import java.util.Arrays;

public class FirstLastIndex {

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,4,4,4,5,5,5,5,6,7,8,8,9,9,9,9,9,9,10};
		int key = 9;
		
		int[] ans = { -1, -1 };

		int f = findFirstIndex(arr, 0, arr.length, key, -1);

		if (f == -1) {
			System.out.println(Arrays.toString(ans));
			return;
		} 
		else {
			int l = findLastIndex(arr, f, arr.length, key, -1);
			ans[1]=l;
		}
		ans[0]=f;
		
		System.out.println(Arrays.toString(ans));
	}

	static int findLastIndex(int[] arr, int s, int e, int key, int l) {
		int mid = s + (e - s) / 2;

		if(s > e) {
			System.out.println(l);
			return l;
		}
		if(mid < arr.length && arr[mid] == key) {
			l = mid;
			return findLastIndex(arr, mid+1, e, key, l);
		}
        if(mid < arr.length && arr[mid] < key) {
			return findLastIndex(arr, mid+1, e, key, l);
		}
		else {
			return findLastIndex(arr, s, mid - 1, key, l);
		}
	}

	static int findFirstIndex(int[] arr, int s, int e, int key, int f) {
		int mid = s + (e - s) / 2;

		if (s > e)
			return f;

		if (mid < arr.length && arr[mid] == key) {
			f = mid;
			return findFirstIndex(arr, s, mid - 1, key, f);
		}
		if (mid < arr.length && arr[mid] < key) {
			return findFirstIndex(arr, mid + 1, e, key, f);
		} else {
			return findFirstIndex(arr, s, mid - 1, key, f);
		}
	}

public int[] searchRange(int[] arr, int key) {
        
        int[] ans = { -1, -1 };

        ans = findIndex(arr, 0, key, ans);

        if(ans[0] != -1 && ans[1] == -1){
            ans[1] = ans[0];
        }

        return ans;
    }
    static int[] findIndex(int[] arr, int n, int key, int[] ans) {
		
		if(n == arr.length) return ans;
		
		if(arr[n] == key) {
			if(ans[0]==-1) {
				ans[0] = n; 
                if(arr.length-1 == n){
                    ans[1] = n;
                }
			}
			else {
				ans[1] = n;
			}
		}
				 
		return findIndex(arr, n+1, key, ans);
	}

}
