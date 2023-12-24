package prepinsta.String;

public class AlphaChar {

	public static void main(String[] args) {
		String s = "tAziusf234";
		System.out.println(check(s,2));
	}
	static boolean check(String s, int i) {
		if(s.charAt(i)>=65&&s.charAt(i)<=90 || s.charAt(i)>=97&&s.charAt(i)<=122) {
			return true;
		}
		return false;
	}

}
