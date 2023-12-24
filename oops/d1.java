package oops;

import java.util.HashSet;

public class d1 implements InterfaceB
{
	
	public void meth6(int p)
	{
		System.out.println();
	}
	void display(int s)
	{
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(110);
		hs.add(20);
		hs.add(200);
		hs.add(50);
		
		System.out.println(hs);
	}
}
