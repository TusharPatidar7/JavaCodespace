package algorithms;

public class EuclidsGCD {
	
	static int gcd(int a, int b) {
		
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		
		while(a != b) {
			
			if(a>b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}
		return a;
	}
	
	static int recursiveGCD(int a, int b) {
		
		if(b==0) {
			return a;
		}
		else {
			return recursiveGCD(b, a%b);
		}
	}

	public static void main(String[] args) {
		int a = 72, b = 24;

		int ans  = recursiveGCD(a, b);
		
		System.out.printf("Greatest common divisor of %d, %d is %d",a,b,ans);

	}

}
