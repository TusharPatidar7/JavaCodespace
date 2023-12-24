package oops;

public class examScore extends Exception
{
	String msg;
	
	public examScore(String msg)
	{
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		return msg;
	}
}
