package dsaPractise;

import java.util.HashSet;

public class LongestSubString 
{
	//abcabcbb
	 public int lengthOfLongestSubstring(String s) {
	    HashSet hs=new HashSet<>();
	    int mL=0;
	    int init=0;
	    for(int r=0 ; r<s.length() ; r++){
	       if(!hs.contains(s.charAt(r)))
	       {
	    	   hs.add(s.charAt(r));
	    	   mL=Math.max(mL, hs.size());
	       }
	       else{
	    		   hs.clear();
	    		   r=init;
	    		   init++;
	       }
	    }
	    return mL;
	}
	 public static void main(String[] args) {
		int out=new LongestSubString().lengthOfLongestSubstring("aab");
		System.out.println(out);
	}
}
