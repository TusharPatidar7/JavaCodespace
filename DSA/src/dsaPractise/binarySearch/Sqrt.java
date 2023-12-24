package dsaPractise.binarySearch;

public class Sqrt {

	public static void main(String[] args) {
		int n=8;
		
		int tempSol = findSqrt(n);;
		
		
		System.out.println(preciseAns(n, 4, tempSol));
	}
	static double preciseAns(int n, int precision, int tempSol) {
		double ans = tempSol;
		double factor = 1;
		
		for(int i=0; i<precision; i++) {
			
			factor = factor/10;
				
			System.out.println(ans+factor);
			for(double j=ans; j*j<n; j+=factor) {
				
				ans=j;
			}
			System.out.println(ans);
		}
		return ans;
	}
	static int findSqrt(int n) {
		int s=0;
		int e=n;
		long ans=0;
		while(s<=e) {
			long mid=s+(e-s)/2;
			long square=mid*mid;
			
			if(square==n) {
				return (int)mid;
			}
			else if(square>n) {
				e=(int)mid-1;
			}
			else {
				ans = mid;
				s = (int)mid+1;
			}
		}
		return (int)ans;
	}

}
