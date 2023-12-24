package prepinsta;

public class FriendlyNumber 
{
	public static void main(String[] args) {
		int a = 6;
		int b = 12;
		
		int aSum = FriendlyNumber.sumOfFactors(a, 1, 0);
		int bSum = FriendlyNumber.sumOfFactors(b, 1, 0);
		
		int aratio = aSum/a;
		int bratio = bSum/b;
		
		if(aratio == bratio){
			System.out.println("Friendly no.");
		}
		else{
			System.out.println("Not Friendly");
		};
		
	}
	static int sumOfFactors(int n, int i, int sum) {
		if(i==n/2) {
			return sum+n/2; 
		}
		if(n%i == 0) {
			sum+=i;
		}
		
		return sumOfFactors(n, ++i, sum);
	}
}
