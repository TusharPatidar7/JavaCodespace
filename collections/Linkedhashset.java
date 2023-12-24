package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import oops.ClassE;

public class Linkedhashset 
{
	void meth1()
	{
		System.out.println("Implementing LinkedHashSet");
		LinkedHashSet<Object> ls =new LinkedHashSet<Object>();
		ls.add(10);//Insertion order is maintained
		ls.add("Java");//Heterogeneous data is allowed
		ls.add(null);//null is allowed
		ls.add(10);//Duplicates are not allowed
		ls.add(12);//It is available from java 1.4v
		ls.add(13);//It's default capacity is 16
		ls.add(14);//It's size increases by DOUBLE
		ls.add(15);//It is not Synchronized
		ls.add(16);
		System.out.println(ls+"\n");
		ArrayList<Object> al =new ArrayList<Object>(ls);
		System.out.println("Reteriving using listIterator");
		ListIterator<Object> li =al.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\n");
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
		
		LinkedHashSet<ClassE> ls =new LinkedHashSet<ClassE>();
		
		ls.add(e4);
		ls.add(e3);
		ls.add(e2);
		ls.add(e1);
		ls.add(new ClassE("Raja",5,"HR"));
		
		for(Object o:ls)
		{
			System.out.println(o);
		}
		
	}
	public static void main(String[] args) {
		Linkedhashset obj = new Linkedhashset();
//		obj.meth1();
		obj.emp();
	}
}
