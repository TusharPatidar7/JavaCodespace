package prepinsta.Recursion;

public class HCF {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 12;
		
		int result = HCF.find(num1, num2);
		System.out.println(result);
	}
	
	static int find(int num1, int num2) {
		if(num2 == 0) return num1;
		
		return find(num2, num1%num2);
	}

//	private static int find(int num1, int num2) {
//		if(num1==0) {
//			return num2;
//		}
//		if(num2==0) {
//			return num1;
//		}
//		if(num1==num2) {
//			return num1;
//		}
//        
//		if(num1 < num2)
//			return find(num1,num2-num1);
//		return find(num1-num2, num2);
//		
//	}
//	

}
