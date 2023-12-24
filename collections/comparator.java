package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class comparator 
{
	void meth1()
	{
		ArrayList<comparable> al=new ArrayList<comparable>();
		
		comparable e1=new comparable("Kishan",101,"Java");
		comparable e2=new comparable("Bhavi",104,"AWS");
		comparable e3=new comparable("Allen",102,"Spring");
		comparable e4=new comparable("Divyansh",103,"AI");
		
		al.add(e4);
		al.add(e3);
		al.add(e2);
		al.add(e1);
		
//		Collections.sort(al);// for Comparable
		Collections.sort(al,new comparator2());//for Comparator
		
	    Iterator<comparable> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new comparator().meth1();
	}
}
