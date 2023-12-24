package Recursion;

public class PowerOfN {

	public static void main(String[] args) {

		int ans = findPower(3,11);
		System.out.println(ans);
	}
	static int findPower(int a, int b) {
		
		if(b == 0) return 1;
		if(b == 1) return a;
		
		//Recursive Call
		int ans = findPower(a, b/2);

		//check even
		if(b%2 == 0)
			return ans*ans;
		else 
			//check odd
			return ans*ans*a; 
	}

}
