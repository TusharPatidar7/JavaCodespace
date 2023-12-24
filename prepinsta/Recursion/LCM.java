package prepinsta.Recursion;

public class LCM {
//LCM * HCF = n1 * n2
	public static void main(String[] args) {
		int n1 =2, n2=5;
		
		System.out.println("LCM = "+(n1*n2)/LCM.findHCF(n1,n2));
	}
	static int findHCF(int n1, int n2) {
		if(n1==0) return n2;
		if(n2==0) return n1;
		if(n1==n2) return n1;
		
		if(n1>n2) 
			return findHCF(n1-n2,n2);
		return findHCF(n1,n2-n1);
	}
	 // This method improves complexity of repeated subtraction
    // By efficient use of modulo operator in euclidean algorithm
	static int getHCF(int a, int b) {
        return b == 0 ? a : getHCF(b, a % b);
    }
}
