package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap 
{
	void meth1()
	{
		System.out.println("Implementing tree map");

//		TreeMap<Object, Object> tm=new TreeMap<Object,Object>();
		
		Hashtable<Object, Object> tm=new Hashtable<Object,Object>();
		
		tm.put(101, "Java");//Insertion order is NOT Maintained but keys will be in sorting order
//		tm.put("Java", "Java");//Heterogeneous keys are not allowed and values are allowed
//		tm.put(107, null);//null keys are not allowed and null values are allowed
		tm.put(105, 1000);//Duplicate values are allowed
		tm.put(102, "Oracle");//It is available from java 1.2v
		tm.put(103, "Sql");//It's default capacity is 16
		tm.put(106, "Testing");//It's size increases by DOUBLE
		tm.put(104, 1000);//It is NOT Synchronized
		tm.put(101, "NareshIT");
		System.out.println(tm);
		
		System.out.println("Reteriving data using HashSet");
		HashSet<Object> hs=new HashSet<Object>(tm.entrySet());
		Iterator<Object> i=hs.iterator();
		
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	
	public static void main(String[] args) {
		new Treemap().meth1();
	}
}
