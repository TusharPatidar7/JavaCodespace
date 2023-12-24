package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class AList 
{
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);//Insertion order is maintained
//		al.add("Java");//Heterogeneous data are allowed
		al.add(null);//null value allowed
		al.add(10);//duplicates allowed
		al.add(12);//version history - java 1.2
		al.add(23);// default capacity - 10
		al.add(5);// size increases by HALF
		al.add(55);//Not synchronized
		
		System.out.println(al+"\n");
		
		al.add(1, 5000);
		
		System.out.println(al+"\n");
		
		al.add(al.size(), 1000);
		System.out.println(al+"\n");
		
//		al.clear();
//		System.out.println(al+"\n");
		System.out.println("isEmpty : "+al.isEmpty());
		
		System.out.println("\nContains : "+al.contains(10));
		
		System.out.println("\nremove "+al.remove(2));
		
		System.out.println(al+"\n");
		
		System.out.println("\nremove : "+al.remove((Object)5));
		
		System.out.println(al+"\n");
		
		System.out.println("Reteriving data using for-loop\n");
		for(int i=0; i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n\nReteriving data in reverse using for-loop\n");
		for(int i=al.size()-1; i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\nReteriving data using for-each\n");
		for(Object o:al)//(Integer o:al) or (int o:al)
		{
			System.out.print(o+" ");
		}
		System.out.println("\nReteriving data using Iterator\n");
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		i.remove();
		System.out.println("\n");
		System.out.print(al);
	}
	void meth2()
	{
		ClassE eobj1 = new ClassE("Kishan",101,"HR");
		ClassE eobj2 = new ClassE("Sudhakar",102,"Oracle");
		ClassE eobj3 = new ClassE("Sujit",103,"HR");
		ClassE eobj4 = new ClassE("Pawan",104,"Spring");
		
		ArrayList<Object> al =new ArrayList<Object>();
		al.add(eobj1);
		al.add(eobj2);
		al.add(eobj3);
		al.add(eobj4);
		al.add(new ClassE("Hansh",105,"Testing"));
		System.out.println();
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		AList obj = new AList();
		System.out.format("\nCurrent Time: %tc%n\n",System.currentTimeMillis());
		obj.meth1();
//		obj.meth2();
	}
}
