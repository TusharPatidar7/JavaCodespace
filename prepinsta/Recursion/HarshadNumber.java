package prepinsta.Recursion;

public class HarshadNumber {

	public static void main(String[] args) {
		int num = 24;
		if(num%HarshadNumber.check(num)==0)
		System.out.println("It's an Harshad Number");
		else
			System.out.println("It's not an Harshad Number");
	}
	static int check(int num) {
		if(num==0) return 0;
		
		return (num%10)+check(num/10);
	}
}
