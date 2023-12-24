package dsaPractise;

public class ModularArithmaticFactorial {

	static long ans=0;
	public static void main(String[] args) {
		
		int n = 10;
		
		ans = findFactorial(n);
		
		System.out.println(ans);
	}

	private static long findFactorial(int n) {
		
		if(n==1) return 1;
		
		ans += (n*findFactorial(n-1))%1000000007;
		
		System.out.println(ans);
		
		return ans;
	}
	
	

}
