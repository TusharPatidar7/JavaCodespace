package prepinsta;

public class TwoBoolean {
	 public static void main(String[] args){
		    // prints true  
		    System.out.println(checkTwoTrue(true, true, true));
		    
		    // prints true
		    System.out.println(checkTwoTrue(true, true, false));  
		    
		    // prints false
		    System.out.println(checkTwoTrue(true, false, false));  
		    
		    // prints false
		    System.out.println(checkTwoTrue(false, false, false));  
		  }

		  public static boolean checkTwoTrue(boolean b1, boolean b2, boolean b3){
		    // check for b1 & b2 for   
		    if (b1 && b2) {
		      return true;
		    }
		    
		    // check for b1 & b3 for 
		    if (b1 && b3) {
		      return true;
		    }
		    
		    // check for b2 & b3 for 
		    if (b2 && b3) {
		      return true;
		    }
		    
		    // false if above 3 if block will not return any value
		    return false;
		  }
}
