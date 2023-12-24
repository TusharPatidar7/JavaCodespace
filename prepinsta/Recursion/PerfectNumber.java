package prepinsta.Recursion;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 6;
		if(PerfectNumber.check(number)) {
			System.out.println(number+" is a perfect Number!!");
		}
		else {
			System.out.println(number+" is not a perfect Number!!");
		}
		if(PerfectNumber.usingRecursion(number, 1) == number) {
			System.out.println(number+" is a perfect Number!!");
		}
		else {
			System.out.println(number+" is not a perfect Number!!");
		}
	}
	static boolean check(int num) {
		int sum=0;
		int i=1;
		while(i<=num/2) {
			if(num%i==0)
				sum=sum+i;
			i++;
		}
		System.out.println(sum);
		return sum==num;
	}
	static int sum=0;
	static long usingRecursion(int num, int i) {
		if(i<=num/2) {
			if(num%i==0) {
				sum+=i;
			}
			usingRecursion(num, ++i);
		}
		return sum;
	}
}
