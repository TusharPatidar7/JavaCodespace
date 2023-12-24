package prepinsta;

import java.util.Scanner;

public class Armstrong 
{
	
	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Write the range of numbers in which uh want all armstrong numbers");
	    	int a=sc.nextInt();
	    	int b=sc.nextInt();
	    	for(int i=a;i<b;i++)
	        {
	        	if(isArmstrongNumber(i,String.valueOf(i).length()) == i)
	        		System.out.println(i);
	        }
	    	
	    }

//	    public static boolean isArmstrongNumber(int num) 
//	    {
//	        int originalNum = num;
//	        int numOfDigits = String.valueOf(num).length();
//	        int sum = 0;
//	        while (num > 0) {
//	            int digit = num % 10;
//	            sum = sum + (int) Math.pow(digit, numOfDigits);
//	            num = num / 10;
//	        }
//	        return originalNum == sum;
//	    }
	    public static int isArmstrongNumber(double num, int len) {
	    	if(num == 0 ) return 0;
	    	
	    	int digit = (int)num % 10;
	    	
	    	return (int) (Math.pow(digit, len)+ Armstrong.isArmstrongNumber(num/10,len));
	    }
	
}
