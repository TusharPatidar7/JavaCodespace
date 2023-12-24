package prepinsta.Recursion;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "Tushar Patidar";
		
		System.out.println("Length of your name is "+LengthOfString.findLength(s));
	}
	static int findLength(String s) {
		if(s.equals("")) return 0;
		
		return findLength(s.substring(1))+1;
		
	}
	
}
