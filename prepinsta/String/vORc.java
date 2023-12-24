package prepinsta.String;

public class vORc {

	public static void main(String[] args) {
		String c = "a";		
		
		System.out.println(c+" is : "+vORc.check(c));
	}
	static String check(String c) {
		switch(c.toLowerCase()) {
		case "a": return "vowel";
		case "e": return "vowel";
		case "i": return "vowel";
		case "o": return "vowel";
		case "u": return "vowel";
		}
		return "consonant";
	}

}
