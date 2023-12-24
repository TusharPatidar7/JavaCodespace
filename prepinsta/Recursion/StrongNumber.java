package prepinsta.Recursion;

public class StrongNumber {

	static int[] f = new int[10];
	
	public static void main(String[] args) {
		int num = 145;
		
		StrongNumber.factorialsOf0TO9();
		
		if(StrongNumber.checkStrong(num)) {
			System.out.println(num+" is a Strong number");
		}
		else{
			System.out.println(num+" is not a strong number");
		}
		
		
		
//		if(StrongNumber.check(num)==num) {
//			System.out.println(num+" is a Strong number");
//		}
//		else {
//			System.out.println(num+" is not a strong number");
//		}
	}
	
	
//	static int check(int num) {
//		if(num==0) return 0;
//		
//		return StrongNumber.factorial(num%10)+StrongNumber.check(num/10);
//		
//		
//	}
//	static int factorial(int num) {
//		if(num==1) return 1;
//		return factorial(num-1)*num;
//	}
	
	//Using Dynamic Approach
	
	static void factorialsOf0TO9() {
		f[0] = f[1] = 1;
		for(int i=2; i<10; i++) {
			f[i] = f[i-1] * i;
		}
	}
	static boolean checkStrong(int num) {
		int sum=0;
		
		int temp = num;
		while(temp!=0) 
		{
			sum = sum + f[temp%10];
			temp/=10;
		}
		return sum==num;
	}
}
