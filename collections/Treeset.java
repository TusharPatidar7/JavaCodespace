package collections;

import java.util.Iterator;
import java.util.TreeSet;

import oops.ClassD;

public class Treeset 
{
	void meth1()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(10);//Insertion order is not maintained but data will be stored in sorting order
//		ts.add("Java");//Heterogeneous data is NOT Allowed
//		ts.add(null);//null is not allowed
		ts.add(10);//duplicates are not allowed
		ts.add(11);//It is available from Java 1.2v
		ts.add(12);//It's default capacity is 16
		ts.add(13);//It's size increases by DOUBLE
		ts.add(14);//It is NOT Synchronized
		ts.add(15);
		System.out.println(ts+"\n");
		
		System.out.println("Reteriving data using Iterator");
		Iterator<Object> i=ts.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		System.out.println("Reteriving data in reverse(descending) order");
		Iterator<Object> i2=ts.descendingIterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
		}
		System.out.println("\n");
		System.out.println("headSet() : "+ts.headSet(12));
		System.out.println("tailSet() : "+ts.tailSet(12));
	}
	void emp()
	{
		ClassD e1 = new ClassD(1);
		ClassD e2 = new ClassD(2);
		ClassD e3 = new ClassD(3);
		ClassD e4 = new ClassD(4);
		
		TreeSet<Object> ts =new TreeSet<Object>();
		
		ts.add(e4);
		ts.add(e3);
		ts.add(e2);
		ts.add(e1);
		ts.add(new ClassD(5));
		
		
		for(Object o:ts)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		Treeset obj = new Treeset();
		obj.meth1();
//		obj.emp();
	}
}
