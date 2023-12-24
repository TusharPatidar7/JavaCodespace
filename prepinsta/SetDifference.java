package prepinsta;

import java.util.HashSet;

public class SetDifference 
{
	void meth1()
	{
		HashSet<Integer> hs1=new HashSet<Integer>();
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs2.add(1);
		hs2.add(4);
		hs2.add(5);
		System.out.println(hs1+"\n");

		System.out.println(hs2+"\n");
		
//		Iterator<Integer> i1=hs1.iterator();
//		Iterator<Integer> i2=hs2.iterator();
//		
//		while(i1.hasNext())
//		{
//			while(i2.hasNext())
//			{
//				if(i1.next()==i2.next())
//					i1.remove();
//			}
//		}
		
		hs1.removeAll(hs2);
		System.out.println(hs1);
	}
	public static void main(String[] args)
	{
	    new SetDifference().meth1();	
	}

}
