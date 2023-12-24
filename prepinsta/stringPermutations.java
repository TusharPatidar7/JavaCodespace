package prepinsta;

import java.util.ArrayList;
import java.util.List;

public class stringPermutations 
{
	// functFI for returning permutations
    public static List permutations(String s){
        List permutations = new ArrayList<>();
        
        // functFI calling to return permutations of a string
        permutationsHelper(s, "", permutations);
        return permutations;
    }
    
    // Helper function to take permutations
    private static void permutationsHelper(String s, String chosen, List permutations){
        
        // if the string is empty
        if (s.isEmpty()) {
            permutations.add(chosen);
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // choose
                chosen += c;
                s = s.substring(0, i) + s.substring(i + 1);
                // explore
                permutationsHelper(s, chosen, permutations);
                // un-choose
                s = s.substring(0, i) + c + s.substring(i);
                chosen = chosen.substring(0, chosen.length() - 1);
            }
        }
    }
    

	public static void main(String[] args) {
		String s="abc";
		System.out.println(permutations(s));
	}

	
}
