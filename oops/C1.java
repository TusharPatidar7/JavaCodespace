package oops;

import java.util.Comparator;

public class C1 implements Comparator<A1>
{
	@Override
	public int compare(A1 o1, A1 o2) 
	{
//		return o1.geteId()-o2.geteId();
//		return o1.geteName().compareTo(o2.geteName());
		return o1.geteDept().compareTo(o2.geteDept());
	}
	
}
