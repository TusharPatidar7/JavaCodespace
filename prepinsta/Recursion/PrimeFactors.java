package prepinsta.Recursion;

public class PrimeFactors {

	public static void main(String[] args) {
		int num=15;
		
		PrimeFactors.find(num);
	}
	static void find(int num) {
		for(int j=2; j<num; j++) {
			if(num%j==0 && primeNumber(j,2))
			System.out.println(j);
		}
	}
	static boolean primeNumber(int number,int i) {
		if(i == number) return true;
		if(number%i == 0) return false;
		if(i*i > number) return true;
		return primeNumber(number,i+1);
	}
	
	public static boolean isprime(int n){

	      for(int i = 2; i<=Math.sqrt(n); i++){
	        if(n%i==0)
	          return false;
	      }

	      return true;
	   }
}
