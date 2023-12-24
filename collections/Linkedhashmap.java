package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Linkedhashmap 
{
	void meth1()
	{
		System.out.println("Implementing LinkedHashMap Class");
		
		LinkedHashMap<Object, Object> lhm =new LinkedHashMap<Object, Object>();
		lhm.put(101, "Java");//Insertion order is not maintained
		lhm.put("Java", "Java"); // heterogeneous key & value are allowed
		lhm.put(null, null);//null key & null value are allowed
		lhm.put(105, 1000);//duplicate value is allowed
		lhm.put(102, "DBMS");//It is available from java 1.4v
		lhm.put(101, "SQL");//It's default capacity is 16
		lhm.put(103, 1000);//It's size increases by Double
		lhm.put(104, "Oracle");//It is NOT synchronized
		System.out.println(lhm+"\n");
		
		System.out.println("Reteriving keys by using HashSet");
		HashSet<Object> hs =new HashSet<Object>(lhm.keySet());
		Iterator<Object> i =hs.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		
		System.out.println("Reteriving keys by using LinkedHashSet");
	   	LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(lhm.keySet());
		Iterator<Object> i2 =lhs.iterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
		}
		System.out.println("\n");
		
		System.out.println("Reteriving keys by using LinkedList");
		LinkedList<Object> ll = new LinkedList<Object>(lhm.keySet());
		Iterator<Object> i3 =ll.iterator();
		while(i3.hasNext())
		{
			System.out.print(i3.next()+" ");
		}
		System.out.println("\n");
	
		System.out.println("Reteriving keys and values");
		HashSet<Object> hs2 =new HashSet<Object>(lhm.entrySet());
		Iterator<Object> i4=hs2.iterator();
		while(i4.hasNext())
		{
//			System.out.println(i4.next());
			Entry<Object, Object> e=(Entry)i4.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args) {
		new Linkedhashmap().meth1();
	}
	
}
