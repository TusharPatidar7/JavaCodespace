package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Hashmap 
{
	void meth1()
	{
		System.out.println("Implementing HashMap Class");
		
		HashMap<Object, Object> hm =new HashMap<Object, Object>();
		hm.put(101, "Java");//Insertion order is not maintained
		hm.put("Java", "Java"); // heterogeneous key & value are allowed
		hm.put(null, null);//null key & null value are allowed
		hm.put(105, 1000);//duplicate value is allowed
		hm.put(102, "DBMS");//It is available from java 1.2v
		hm.put(101, "SQL");//It's default capacity is 16
		hm.put(103, 1000);//It's size increases by Double
		hm.put(104, "Oracle");//It is NOT synchronized
		System.out.println(hm+"\n");
		
		System.out.println("Reteriving data by using HashSet");
		HashSet<Object> hs =new HashSet<Object>(hm.keySet());
		Iterator<Object> i =hs.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		
		System.out.println("Reteriving data by using LinkedHashSet");
	   	LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(hm.keySet());
		Iterator<Object> i2 =lhs.iterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
		}
		System.out.println("\n");
		
		System.out.println("Reteriving data by using LinkedList");
		LinkedList<Object> ll = new LinkedList<Object>(hm.keySet());
		Iterator<Object> i3 =ll.iterator();
		while(i3.hasNext())
		{
			System.out.print(i3.next()+" ");
		}
		System.out.println("\n");
	
		System.out.println("Reteriving key-values");
		HashSet<Object> hs2 =new HashSet<Object>(hm.entrySet());
		Iterator<Object> i4=hs2.iterator();
		while(i4.hasNext())
		{
//			System.out.println(i4.next());
			Entry<Object,Object> e = (Entry)i4.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args) {
		Hashmap hobj =new Hashmap();
		hobj.meth1();
	}
}
