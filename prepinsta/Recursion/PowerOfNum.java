package prepinsta.Recursion;

public class PowerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOfNum.find(5,3));
	}
	static int find(int base, int exponent) {
		if(exponent == 1) return base;
		return base*find(base,--exponent);
	}

}
