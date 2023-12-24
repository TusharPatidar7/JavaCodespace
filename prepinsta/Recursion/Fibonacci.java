package prepinsta.Recursion;

public class Fibonacci {

	static int a=0,b=1,count=0;
	public static void main(String[] args) {
		int range = 15;
		
		Fibonacci.find(8,range);
	}
	
	static void find(int n,int r) {
		if(r==0) return;
		count++;
		int next = a;
		a = a+b;
		b = next;
//		System.out.println(next);
		if(count == n) System.out.println(n+"th value is : "+next);
		find(n,r-1);
	}

}
