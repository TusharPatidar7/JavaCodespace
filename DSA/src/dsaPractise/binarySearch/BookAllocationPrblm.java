package dsaPractise.binarySearch;

public class BookAllocationPrblm {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 8, 4, 5  };
		int ans = allocateBooks(arr, arr.length, 6);
		System.out.println(ans);
	}
	
	static int allocateBooks(int arr[], int n, int m) {
		
		if(m>n) return -1;
		
		int s = 0;
		int e = 0;
		
		//maximum
		for(int i=0; i < n; i++) {
			e += arr[i];
		}
		
		int mid = s + (e-s)/2;
		int ans = -1;
		
		
		while(s<=e) {
			
			if(isPossible(arr, n, m, mid)) {
				ans = mid;
				e = mid-1;
			}else {
				s = mid+1;
			}
			mid = s + (e-s)/2;
			
		}
		return ans;
	}

	private static boolean isPossible(int[] arr, int n, int m, int mid) {
		
		int countS = 1;
		int pageSum = 0;
		
		for(int i=0; i<n; i++) {
			
			if(pageSum+arr[i] <= mid) {
				pageSum += arr[i];
			}
			else {
				countS++;
				
				if(countS > m || arr[i] > mid) {
					return false;
				}
				pageSum = arr[i];
			}
		}
		
		return true;
	}
}
