package leetCode;

public class HomogeneousStrings {

	public static void main(String[] args) {
		String s = "abbcccaa";
		System.out.println(HomogeneousStrings.countHomogenous(s));
	}
	public static int countHomogenous(String s) {
		
		var prev = '?';
	    var cnt = 1;
	    var sum = 0;

	    for (var c : s.toCharArray()) {
	      if (c != prev) {
	        cnt = 1;
	        prev = c;
	      }
	      sum = (sum + cnt++) % 1000000007;
	      System.out.println(sum);
	    }
	    return sum;
	  }
	

}
