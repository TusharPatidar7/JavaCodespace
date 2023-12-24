package prepinsta.Recursion;

public class PerfectSquare {

	public static void main(String[] args) {
		int num = 49;
		System.out.println(PerfectSquare.find(num , 1));
	}

//	static boolean find(int num, int i) {
//		double sqr = Math.sqrt(num);
//		if(sqr*sqr == num) return true;
//		return false;
//	}
	static boolean find(int num, int i) {
		
		if(Math.floor(Math.sqrt(num)) == Math.ceil(Math.sqrt(num)))
			return true;
		
		return false;
	}
}
