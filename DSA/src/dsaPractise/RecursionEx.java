package dsaPractise;

public class RecursionEx {
	//Example1 : Sum of digits
	int SumOfDigits(int n) {
		if(n<0)
			return -1;
		if(n==1 || n==0)
			return n;
		return n%10 + SumOfDigits(n/10);
	}
	
	//Example2 : Power of a number
	int power(int m, int n) {
		if(m<0 || n<0)
			return -1;
		if(n==0)
			return 1;
		if(n==1)
			return m;
		return m * power(m,n-1); 
	}
	
	//Example3 : GCD
	int gcd(int n1, int n2)
	{
		if(n1<0 || n2<0)
			return -1;
		if(n2==0)
			return n1;
		return gcd(n2, n1%n2);
	}
	
	//Example4 : decimal to binary
	int dToB(int n) {
		if(n==0||n==1)
			return n;
		return n%2 +  dToB(n/2)*10;
	}
	public static void main(String []args) {
		RecursionEx obj =new RecursionEx();
		
//		int sum= obj.SumOfDigits(10018);
//		System.out.println(sum);
		
//		int pow = obj.power(5, 2);
//		System.out.println(pow);
		
//		int div = obj.gcd(8, 12);
//		System.out.println(div);
		
		int binary = obj.dToB(10);
		System.out.println(binary);
	}
}
