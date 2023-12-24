package prepinsta;

public class Anagram {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
//		int count=0;
//		for(int i=0;i<s1.length();i++)
//		{
//			for(int j=0;j<s2.length();j++)
//			{
//				if(s1.charAt(i)==s2.charAt(j))
//				{
//					count+=1;
//					break;
//				}
//			}
//		}
//		if(count==s2.length())
//			System.out.println("ANAGRAM STRINGS");
//		else
//			System.out.println("Not anagram");
		//---------------------------------------

        if (areAnagrams(s1, s2)) {
            
            // prints true if the strings are anagrams
            System.out.println("The strings are anagrams.");
        } else 
            
            // prints false if the strings are not anagrams
            System.out.println("The strings are not anagrams.");
        
	}
	public static boolean areAnagrams(String s1, String s2){
	    
        // Check if the two strings have the same length
        if (s1.length() != s2.length()) {
            return false;
        }
        // Create two arrays to store the character counts
        int[] count1 = new int[128];
        int[] count2 = new int[128];

        // Iterate through the first string and increment the
        // corresponding element in the first array
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i)]++;
        }

        // Iterate through the second string and increment the
        // corresponding element in the second array
        for (int i = 0; i < s2.length(); i++) {
        	count2[s2.charAt(i)]++;
        }
        
        // Check if the two arrays are equal
        for (int i = 0; i < 128; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
