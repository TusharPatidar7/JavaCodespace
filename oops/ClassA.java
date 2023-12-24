package oops;

import java.util.Scanner;

class ClassA
{	
	void meth1()
	{
		try
		{
			String s=null;
			System.out.println(20/0);
			System.out.println("=>"+s.length());			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		finally
		{
			System.out.println("Java is awesome");
		}
	}
	void meth2() 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			String s=null;
			System.out.println("Enter a number");
			System.out.println(20/sc.nextInt());
			System.out.println("=>"+s.length());			
		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println(ae.toString());
//		}
		catch(RuntimeException e)
		{
			System.out.println("catch block");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Java is awesome");
			sc.close();
		}
		System.out.println(30);
	}
	public static void main(String[] args) 
	{
		new ClassA().meth2();
	}
	
}