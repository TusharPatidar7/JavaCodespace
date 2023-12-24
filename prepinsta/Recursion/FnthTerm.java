package prepinsta.Recursion;

public class FnthTerm {
//	Input : 4
//	Output : 5167
//	Explanation : 1 + (2*3) + (4*5*6) + (7*8*9*10) = 5167.
	
	static int m=1;
	static long sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		
		long ans = find(num);
		System.out.println(ans);
		
	}
	static long find(int n) {
		int calculated=1 ,current=1;
		while(current != n+1) {
			int cur=1,i;
			
			for(i=calculated; i<current+calculated; i++) {
				cur*=i;
			}
			sum+=cur;
			calculated = i;
			current++;
		}
		return sum;
	}

}
