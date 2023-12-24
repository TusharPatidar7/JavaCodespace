package oops;

import java.util.Scanner;

public class UserDefinedException 
{
	static double cr_balance = 100;
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter withdrawal amount");
		int n = sc.nextInt();
		
		try
		{
			if(cr_balance<n)
			{
				throw new MinimumAccBal("Insufficient balance! "
						+ "Your Current Balance id : "+cr_balance);
			}
			else
			{
				System.out.println("Please take : "+n);
			}
		}
		catch(MinimumAccBal e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("Give your Exam grades");
		float grade = sc.nextFloat();
		try 
		{
			if(grade<0)
			{
				throw new examScore("The score cannot be negative!");
			}
			else
			{
				System.out.println("Your Grades : "+grade);
			}
		}
		catch(examScore e)
		{
			e.printStackTrace();
		}
		finally
		{
		   sc.close();
		}
	
	}
	
}
