package prepinsta.Recursion;

public class ReverseOfNum {
	
	public static void main(String[] args) {
		int n = 1234;
		reverse(n);
	}
	static void reverse(int n) {
		if(n<10) {
			System.out.print(n);
			return;
		}else {
			System.out.print(n%10);
			reverse(n/10);
		}
	}

}
