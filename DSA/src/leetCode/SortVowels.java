package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SortVowels {

	public static void main(String[] args) {
		String s = "lEetcOde";
		
		String ans = sortVowels(s);
		
		System.out.println(ans);

	}
	public static String sortVowels(String s) {
        
		int n = s.length();
		List<Character> vow = new ArrayList<Character>();
		List<Integer> pos = new ArrayList<Integer>();
		char[] ans = s.toCharArray();
		

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { // condition to check for vowel
                vow.add(ch);
                pos.add(i); // storing positions of vowel
            }
        }
		Collections.sort(vow);
		
		for(int i=0; i<pos.size(); i++) {
			ans[pos.get(i)] = vow.get(i);
		}
		
		return new String(ans);
				
    }

}
