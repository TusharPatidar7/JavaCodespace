package leetCode;

import java.util.HashMap;
import java.util.Map;

public class NicePairsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {42,11,1,97};
		
		System.out.println(countNicePairs(arr));

	}
	 public static int countNicePairs(int[] nums) {
	        
	        int res = 0, mod = (int)1e9 + 7;
	        Map<Integer, Integer> count = new HashMap<>();
	        for (int a : nums) 
	        {
	            int b = rev(a), v = count.getOrDefault(a - b, 0);
	            count.put(a - b, v + 1);
	            res = (res + v) % mod;
	        }
	        return res;

	    }
// TLE
//	public static int countNicePairs(int[] nums) {
//
//		int count = 0;
//		for (int i = 0; i < nums.length - 1; i++) {
//			int first = nums[i];
//			int fRev = rev(first);
//
//			for (int j = i + 1; j < nums.length; j++) {
//				int second = nums[j];
//				int sRev = rev(second);
//
//				if ((first + sRev) == (second + fRev)) {
//					count++;
//				}
//			}
//
//		}
//		return count;
//
//	}

	static int rev(int n) {
		int r = 0;
		while (n > 0) {
			r = (r * 10) + n % 10;
			n /= 10;
		}
		
		return r;
	}
}
