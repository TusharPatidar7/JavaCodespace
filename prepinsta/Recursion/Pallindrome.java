package prepinsta.Recursion;

public class Pallindrome {
	
	static int n;
	static int reverse=0;
	
	public static void main(String[] args) {
		
		int num = 1212;
		n=num;
		boolean result = Pallindrome.check(num);
		
		System.out.println(num+" is pallindrome : "+result);
	}
	
	static boolean check(int num) {
		
		if(num==0) return (reverse==n)? true: false;
		
		reverse *=10;
		reverse += num%10;
		num/=10;
		
		return check(num);
	}
	
//	static boolean check(int num) {
//		int n=num;
//		int reverse = 0;
//		
//		while(num!=0) {
//			reverse *= 10;
//			reverse += num%10;
//			num/=10;
//		}
//		
//		return (reverse==n)? true: false;
//	}
}
