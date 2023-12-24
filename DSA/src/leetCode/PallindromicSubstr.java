package leetCode;

import java.util.Arrays;

public class PallindromicSubstr {

	public static void main(String[] args) {
		String s = "bbcbaba";
		System.out.println(countPalindromicSubsequence(s));

	}

	private static int countPalindromicSubsequence(String s) {
		int first[] = new int[26], 
			last[] = new int[26], 
			res = 0;
		
	    Arrays.fill(first, Integer.MAX_VALUE);
	    
	    for (int i = 0; i < s.length(); ++i) 
	    {
	        first[s.charAt(i) - 'a'] = Math.min(first[s.charAt(i) - 'a'], i);
	        last[s.charAt(i) - 'a'] = i;
	    }
	    System.out.println(Arrays.toString(first));
	    System.out.println(Arrays.toString(last));
	    for (int i = 0; i < 26; ++i)
	        if (first[i] < last[i])
	            res += s.substring(first[i] + 1, last[i]).chars().distinct().count();
	    return res;
	}
	 
//	static public int countPalindromicSubsequence(String s) {
//	      
//		HashSet<String> hs = new HashSet<String>();
//		StringBuilder sb = new StringBuilder();
//		
//		int i=0; 
//		int k=s.length()-1;
//		
//		while(i<k) {
//			if(s.charAt(i)==s.charAt(k)) {
//				sb.append(s.charAt(i));
//				for(int j=i+1; j<k; j++) {
//					sb.append(s.charAt(j));
//					sb.append(s.charAt(k));
//					hs.add(sb.toString());
//					sb.deleteCharAt(1);
//					sb.deleteCharAt(1);
//				}
//			}
//			i++;k--;
//		}
////		for(int i=0; i<s.length()-2; i++) {
////			char ch = s.charAt(i);
////			sb.append(ch);
////			for(int j=0; j<s.length()-2; j++) {
////				sb.append(s.substring(j,j+2));
////				if(isPallindrome(sb.toString())) {
////					hs.add(sb.toString());
////				}
////				sb.replace(j, j+2, "");
////			}
////		}
//		System.out.println(hs);
//		return hs.size();
//	}
//	static boolean isPallindrome(String s) {
//		String r ="";
//		for(int i=s.length()-1; i>=0; i--) {
//			r+=s.charAt(i);
//		}
//		if(s.equals(r)) {
//			return true;
//		}
//		return false;
//	}

}
