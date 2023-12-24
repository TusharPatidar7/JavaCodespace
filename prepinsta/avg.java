package prepinsta;

public class avg 
{
	void average(int []a)
	{
		int sum=0;
		for(int x:a)
		{
			sum+=x;
		}
		System.out.println("Average is "+(sum/a.length));
	}
	public static void main(String[] args) 
	{
		int [] ar={4,1,4};
		new avg().average(ar);
	}

}
