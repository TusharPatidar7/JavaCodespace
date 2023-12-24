/**
 * 
 */
package prepinsta;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Tushar Patidar
 *
 */
class C extends test{
//	void meth1()
//	{
//		int a[]= {5,5,2,5,5};
//		int count=0;
//		for(int i=0;i<a.length-1;i++)
//		{
//			if(a[i]==a[i+1])
//			{
//				count++;
//			}
//			else
//			{
//				if(count>1)
//				{
//					if(count!=5)
//						System.out.println(a[0]);
//					else
//					System.out.println(a[i+1]);
//				break;
//				}
//				
//					
//			}
//		}
//	}
//	 
	
	//Difference of two sets
	void meth2()
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
//	long start=System.currentTimeMillis();
//	new C().meth2();
//	long end=System.currentTimeMillis();
		
//		int[] a= {1,2,3};
//		int[] b= {2,1,3};
//		int count = 0;
//		for (int i=0;i<3;i++)
//		{
//			if(a[i]!=b[i])
//			{
//				count+=1;
//				break;
//			}
//		}
//		System.out.println(count);
		
		
	}
	
}
