package prepinsta.Recursion;

public class ArmstringN {

//	static int sum=0, number;
	
	public static void main(String[] args) {
		int num=407;
//		number = num;
		int length = order(num);
		
		if(num == ArmstringN.check(num,length)) {
			System.out.println(num+" is an Armstrong number");
		}
		else {
			System.out.println(num+" is an not Armstrong number");
		}
		
//		System.out.println(num+" is armstrong number : "+ArmstringN.check(num,length));
	}
	private static int check(int num, int length) {
		if(num==0) return 0;
		
		int digit= num%10;
		
		return (int)Math.pow(digit, length)+check(num/10, length);
	}
	
	private static int order(int num) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
//	static boolean check(int num, int length) {
//		if(num == 0) return (sum == number)?true:false;
//		sum += Math.pow(num%10, length);
//		num/=10;		
//		return check(num, length);
//	}

}
