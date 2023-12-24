package collections;

import java.util.LinkedList;
import java.util.ListIterator;

import oops.ClassE;

public class Linkedlist 
{
	void meth1()
	{
		LinkedList<Object> ll =new LinkedList<Object>();
		ll.add(10);//Insertion order is maintained
		ll.add("Java");//Heterogeneous data is allowed
		ll.add(null);//null is allowed
		ll.add(10);//Duplicates are allowed
		ll.add(56);//It is available from java 1.2v
		ll.add(85);//Its default size is 0
		ll.add(32);//It's size increases by DOUBLE
		ll.add(12);//It is not Synchronized
		ll.add(1);
		System.out.println(ll);
		System.out.println("\n");
		
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\n");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("\n");
		
		System.out.println("----methods-----\n");
		System.out.println("getFirst() : "+ll.getFirst());
		System.out.println("getLast() : "+ll.getLast());
		
		ll.removeLast();
		System.out.println("\nremoveFirst()\n"+ll);
		
		ll.removeFirst();
		System.out.println("\nremoveLast\n"+ll);
		
		ll.addFirst(10);
		ll.addLast(1);
		System.out.println("\naddFirst(),addLast()\n"+ll);
		
	}
	void EmpDetails()
	{
		ClassE E1 = new ClassE("Harsh",101,"Hr");
		ClassE E2 = new ClassE("Raja",102,"Java");
		ClassE E3 = new ClassE("Kishan",103,"SQL");
		ClassE E4 = new ClassE("Kundan",104,"AWS");
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(E1);
		ll.add(E2);
		ll.add(E3);
		ll.add(E4);
		ll.add(new ClassE("Bharat",105,"Oracle"));
		
		ListIterator<Object> li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("\nReteriving data in reverse order\n");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
	public static void main(String[] args) 
	{
//		new Linkedlist().meth1();
		new Linkedlist().EmpDetails();
	}
	
}
