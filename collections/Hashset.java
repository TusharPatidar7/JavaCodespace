package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

import oops.ClassE;

public class Hashset 
{
	void meth1()
	{
		System.out.println("Implementing HashSet");
		
		HashSet<Object> hs =new HashSet<Object>();
		hs.add(10);//Insertion Order is not maintained
		hs.add("Java");//Heterogeneous data is allowed
		hs.add(null);//null is allowed
		hs.add(10);//duplicated are not Allowed
		hs.add(13);//It is available from Java 1.2v
		hs.add(55);//It's default capacity is 16
		hs.add(45);//It's size increases by DOUBLE
		hs.add(13);//It is NOT Synchronized
		hs.add(1);
		System.out.println(hs+"\n");
		
		System.out.println("Passing HashSet to ArrayList\n");
		ArrayList<Object> al=new ArrayList<Object>(hs);
		ListIterator<Object> li =al.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\n\nReteriving data in reverse order");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
	}
	void emp()
	{
		ClassE e1 = new ClassE("Allen",1,"HR");
		ClassE e2 = new ClassE("Yuvraj",2,"HR");
		ClassE e3 = new ClassE("Dhoni",3,"HR");
		ClassE e4 = new ClassE("David",4,"HR");
		
		HashSet<Object> hs =new HashSet<Object>();
		hs.add(e4);
		hs.add(e3);
		hs.add(e2);
		hs.add(e1);
		hs.add(new ClassE("Raja",5,"HR"));
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
	}
	public static void main(String[] args) {
		new Hashset().meth1();
//		new Hashset().emp();
	}
}
