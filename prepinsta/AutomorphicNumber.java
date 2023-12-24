package prepinsta;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		
		if((num*num)%10 == num) {
			System.out.println("Automorphic");
		}else {
			System.out.println("Not a Automorphic");
		}
	}

}
