package prepinsta.Recursion;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int ans = Factorial.find(num);
		System.out.println(ans);
	}

	private static int find(int num) {
		if(num==1) return 1;
		
		return find(num-1)*num;
	}
}
