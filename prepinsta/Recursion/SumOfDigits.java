package prepinsta.Recursion;

public class SumOfDigits {

//	static int sum =0;
	public static void main(String[] args) {
		int i = 1234;
		
		int sum = sumDigits(i);
		
		System.out.println(sum);
	}
	
	static int sumDigits(int num) {
		if(num==0) return 0;
		
		return (num%10) + sumDigits(num/10);
	}

}
