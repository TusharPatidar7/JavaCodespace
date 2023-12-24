package oops;

import java.io.FileReader;

public class throwClass 
{
	int avl_amount = 10000;
	void meth1(int w_amnt)
	{
		if(avl_amount<w_amnt)
		{
			throw new ArithmeticException("Insufficient funds!");
		}
		else
		{
			System.out.println("Transaction success!");
			System.out.println("Please take : "+w_amnt);
		}
	}
	void fileOpr() throws Exception
	{
		FileReader fr = new FileReader("D:\\Movies\\new.txt");
	
		System.out.println("Hello");
		fr.close();
	}
	public static void main(String[] args) throws Exception
	{
		throwClass obj = new throwClass();
		obj.meth1(500);
		
		obj.fileOpr();
	}
}
