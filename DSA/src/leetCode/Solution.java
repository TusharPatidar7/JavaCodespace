package leetCode;

//Given an integer n, break it into the sum of k positive
//integers, where k >= 2, and maximize the product of those integers.
//n(2,58)
//Return the maximum product you can get.

class Solution {
	public boolean backspaceCompare(String s, String t) {
		
	        StringBuffer sb = new StringBuffer();
	        StringBuffer st = new StringBuffer();
	        int j=0;
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)=='#'&&j>0) {
	            	sb.deleteCharAt(--j);
	            }
	            else {
	            	sb.append(s.charAt(i));
	            	j++;
	            }
	        }
	        j=0;
	        for(int i=0; i<t.length(); i++){
	            if(t.charAt(i)=='#'&&j>0) {
	            	st.deleteCharAt(--j);
	            }
	            else {
	            	st.append(t.charAt(i));
	            	j++;
	            }
	        }
	       
	        if(sb.length()>0 && sb.charAt(0)=='#') {
	        	sb.deleteCharAt(0);
	        }
	        if(st.length()>0 && st.charAt(0)=='#') {
	        	st.deleteCharAt(0);
	        }
	        
	        System.out.println(sb);
	        System.out.println(st);
	        return sb.toString().equals(st.toString()); 
	    
	}
	public static void main(String[] args) {
		System.out.println(new Solution().backspaceCompare("y#fo##f","y#f#o##f"));
	}
}