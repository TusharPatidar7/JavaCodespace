package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import oops.ClassE;

public class VectorClass 
{
	void meth1()
	{
		ClassE eobj1 = new ClassE("Harsh",101,"Java");
		ClassE eobj2 = new ClassE("Raja",102,"Oracle");
		ClassE eobj3 = new ClassE("Bharat",103,"AWS");
		Vector<Object> v =new Vector<Object>();
		v.add(eobj1);
		v.add(eobj2);
		v.add(eobj3);
		v.add(new ClassE("Tushar",104,"Spring"));
		System.out.println("Reteriving Data by using Iterator Interface\n");
		Iterator<Object> i =v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" \n");
		}
		System.out.println("\n------>> Methods\n");
		v.add(0, new ClassE("Vasu",105,"JS"));
		
		System.out.println("\nContains : "+v.contains(eobj3)+"\n");
//		v.clear();
		System.out.println(v.elementAt(1)+"\n");
		System.out.println("isEmpty(): "+v.isEmpty()+"\n");
		
		System.out.println("remove(): "+v.remove(eobj1)+"\n");
		
		System.out.println("get(): "+v.get(0)+"\n");
		
		Iterator<Object> i2 =v.iterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" \n");
		}
	}
	void meth2()
	{
		Vector<Object> v = new Vector<Object>();
		v.add(10);//Insertion order is maintained
		v.add("Java");//Hetereogenous data is allowed
		v.add(null);//null allowed
		v.add(10);//duplicates allowed
		v.add(50);//version history : 1.0v
		v.add(60);//deafult capacity 10
		v.add(70);//size increases by DOUBLE
		v.add(10);// It is synchronized
		v.add(true);
		
		System.out.println(v);
		System.out.println("size() : "+v.size());
		System.out.println("capacity : "+v.capacity());
		
		v.add(v.size(),5500);
		v.add(v.size()-1,4400);
		System.out.println("\n"+v);
		
		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n");
		for(Object o:v)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n");
		System.out.println("Enumeration Interface");
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\n");
		System.out.println("Iterator Interface");
		Iterator<Object> i=v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		new VectorClass().meth1();
//		new VectorClass().meth2();
	}
}



