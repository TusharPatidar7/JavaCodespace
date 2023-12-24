package oops;

public class MinimumAccBal extends Exception
{
	String message;
	public MinimumAccBal(String message)
	{
		this.message = message;
	}
	
	@Override
	public String toString()
	{
		return message;
	}

}
