package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashTable 
{
	void meth1()
	{
		System.out.println("Implementing HashTable");
	 	Hashtable<Integer, Object> ht =new Hashtable<Integer,Object>();
	 	ht.put(101, "Java");//Insertion order is NOT maintained
//	 	ht.put("Java", "Java");//Heterogeneous keys and Values are ALLOWED
//	 	ht.put(null, null);// null keys and null values are NOT allowed
	 	ht.put(105, 1000);//Duplicate values are Allowed
	 	ht.put(103, "Oracle");//It is Available from java 1.0v [It is a Legacy Class]
	 	ht.put(104, "AWS");//It's default capacity is 11
	 	ht.put(102, "Spring");//It's size increases by DOUBLE
	 	ht.put(106, 1000);//It is Synchronized
	 	System.out.println(ht+"\n");
	 	
	 	ht.put(101, "NareshIT");
	 	System.out.println(ht+"\n");
	
	 	System.out.println("Reteriving keys and values using HashSet\n");
	 	
	 	HashSet<Object> hs=new HashSet<Object>(ht.entrySet());
	 	
	 	Iterator<Object> i=hs.iterator();
	 	while(i.hasNext())
	 	{
	 		Entry<?, ?> e=(Entry<?, ?>)i.next();
	 		System.out.println(e.getKey()+" "+e.getValue());
	 	}
	}
	public static void main(String[] args) {
		new hashTable().meth1();
	}
}
