package prepinsta.Recursion;

public class PermutationOfString {

	public static void main(String[] args) {
		String s = "ANF";
		
		 printPermute(s,"");

	}

	
	static void printPermute(String str, String ans) {

        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        System.out.println("str: "+str);
        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character
            String r = str.substring(0, i) + str.substring(i + 1);
            
            // Recurvise call
            printPermute(r, ans + ch);
            
        }
	}
}
