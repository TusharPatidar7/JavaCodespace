package Recursion;

public class Pallindrome {

	public static void main(String[] args) {
		String name = new String("nayan");
		if(checkPallindrome(name.toCharArray(), 0)) {
			System.out.println(name+" is pallindrome");
		}
		else {
			System.out.println(name+" is not a pallindrome");
		}
	}
	static boolean checkPallindrome(char[] name, int i) {
		
		if(i == name.length/2) return true;
		
		if(name[i] != name[name.length-i-1])
			return false;
		
		return checkPallindrome(name, i+1);
	}

}
