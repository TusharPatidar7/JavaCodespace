package dsaPractise;

public class PaintingWalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[] = {2,3,4,2};
		int time[] = {1,1,1,1};
		
		System.out.println(new PaintingWalls().addStrings("77","222"));

//		String s1 = "java";
//
//		String s2 = "java";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
	}
	
	 public String addStrings(String num1, String num2) {
	        StringBuffer ans = new StringBuffer();
	        int l1 = num1.length()-1;
	        int l2 = num2.length()-1;
	        if(l1>l2) {
	        for(int i = l1, j =l2; i>=0; i--){
	            if(j>=0) {
	                int sum = num1.charAt(i) + num2.charAt(j);
	                if(sum<9) 
	                ans.append(sum);
	                else {
	                	ans.append(sum%10);
	                	num1.replace(num1.charAt(i),(char)(num1.charAt(i)+ (sum/10))) ; 
	                }
	                j--;
	            }
	            ans.append(num1.charAt(i));
	        }
	        }
	        else {
	        	for(int i = l2, j =l1; i>=0; i--){
		            if(j>=0) {
		                int sum = (int)num1.charAt(j) + (int)num2.charAt(i);
		                if(sum<=9) 
		                ans.append((char)sum);
		                else {
		                	ans.append(sum%10);
		                	num2.replace(num2.charAt(i),(char)(num2.charAt(i)+ (sum/10))) ; 
		                }
		                j--;
		            }
		            else {
		            ans.append(num2.charAt(i));
		            }
		        }
	        }
	        return ans.reverse().toString();
	       
	    }
	
//	A paid painter that paints the ith wall in time[i] units of time and takes cost[i] units of money.
//	A free painter that paints any wall in 1 unit of time at a cost of 0. But the free painter can only 
//	be used if the paid painter is already occupied.

//	public int paintWalls(int[] cost, int[] time) {
//		
//			int n = cost.length;
//			int p1[] = new int[n/2];
//			int p2[] = new int[n];
//			int s =0, e=0;
//		
//			for(int i=0; i<n; i++) {
//				
//			}
//				
//	        return 0;
//	}


}
