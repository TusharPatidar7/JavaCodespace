package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class B1 
{
	void meth1()
	{
		ArrayList<A1> al =new ArrayList<A1>();
		
		A1 e1=new A1(101, "Tushar", "Java");
		A1 e2=new A1(103, "Allen", "Oracle");
		A1 e3=new A1(102, "Smith", "Spring");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
//		Collections.sort(al);
		Collections.sort(al,new C1());
		
	    Iterator<A1> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new B1().meth1();
	}
}
