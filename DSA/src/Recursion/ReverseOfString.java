package Recursion;

public class ReverseOfString {

	public static void main(String[] args) {
		String name = "TUSHAR patidar";
		
		String rev = reverse(name,0);
		System.out.println("Reverse of "+name+" is "+rev);
	}
	static String reverse(String name, int n) {
		int l = name.length();
		if(n == l/2) return name;
		
		char temp = name.charAt(n);
		char last = name.charAt(l-n-1);
		name = name.substring(0,n)+ last + name.substring(n+1,l-n-1)+temp+name.substring(l-n);
		
		return reverse(name, n+1);
	}
}
