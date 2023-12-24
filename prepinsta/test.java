package prepinsta;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Map.Entry;

import collections.Treemap;

class test 
{
	/*>>Collection
	 * List:
	 * 1.ArrayList
	 * 2.LinkedList
	 * 3.Vector
	 * Set:
	 * 1.HashSet
	 * 2.LinkedHashSet
	 * 3.TreeSet
	 * Queue:
	 * 1.PriorityQueue
	 * 2.LinkedList
	 * 
	 *>>map
	 * 1.HashMap
	 * 2.LinkedHashMap
	 * 3.TreeMap
	 * 4.HashTable
	 * */
	static void vector()
	{
		Vector<Object> v=new Vector<Object>();
		v.add('a');//Insertion order is maintained
		v.add(1);//heterogeneous data is allowed
		v.add('a');//duplicated are allowed
		v.add(null);//nulls are allowed
		v.add('d');//It's default size is 16
		v.add('e');//It's size increases by DOUBLE
		v.add('f');//It is available from java 1.0 (Legacy class)
		v.add('g');//It is Synchronized
		System.out.println(v);
		
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement()+" ");
		}
	}
	static void Arraylist() {
		ArrayList<Object> al =new ArrayList<Object>();
		al.add("Ram");//Insertion order is maintained
		al.add(1008);//Heterogeneous data allowed
		al.add(null);//null allowed
		al.add("Shiva");//it's default size is 10
		al.add("Ram");//Duplicates are allowed
		al.add("Ganesh");//size increases by Half
		al.add("Rudra");//Available from java 1.2v
		al.add("Krishna");//Not synchronized
		al.add("Hanuman");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(1));
		if(!al.contains("Vishnu"))
		al.add("Vishnu");
		System.out.println("----------------\nRetriving IN frwrd");
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("----------------\nRetriving IN Backward");
		ListIterator li=al.listIterator();
		while(li.hasNext()) {li.next();}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("\n"+al.isEmpty());
	}
	static void Linkedlist()
	{
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(100);//insertion order is NOT maintained
		ll.add("rank");//Heterogeneous data allowed
		ll.addFirst(null);//null allowed
		ll.add(100);//duplicates allowed
		ll.add(50);//size increases by double
		ll.add(90);//default size is 0
		ll.add(40);//Available from java 1.2v
		ll.add(30);//Not synchronized
		
		System.out.println(ll);
		System.out.println(ll.size());
		
		for(Object i:ll)
		{
			System.out.println(i);
		}
	}
	static void hashset()
	{
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(1000);//Insertion order is not maintained
		hs.add(null);//nulls allowed
		hs.add(1000);//Duplicates not allowed
		hs.add("data");//Heterogeneous data allowed
		hs.add(9000);//version java 1.2v
		hs.add(8000);//it's default size is 16
		hs.add(7000);//Size increases by DOUBLE
		hs.add(2000);//Not Synchronized
		System.out.println(hs);
		
		for(Object i:hs) {
			System.out.println(i);
		}
	}
	static void LinkedhasSet()
	{
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		lhs.add('A');//Insertion order is maintained
		lhs.add(10);//Heterogeneous data is allowed
		lhs.add('A');//Duplicates are not allowed
		lhs.add(null);//Null is allowed
		lhs.add('b');//version java 1.4v
		lhs.add('c');//It's default size is 16
		lhs.add('d');//It's size increases by DOUBLE
		lhs.add('e');//Not synchronized
		lhs.add('f');
		System.out.println(lhs+"\n");
		ArrayList<Object> al=new ArrayList<Object>(lhs);
		ListIterator<Object> li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("----------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}
	static void treeset()
	{
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add("red");//Insertion order is not maintained but data will be sorted
//		ts.add(10);//Heterogeneous data not allowed
//		ts.add("red");//duplicates not allowed
//		ts.add(null);//null is not allowed
		ts.add("blue");//version java 1.2v
		ts.add("green");//It's default size is 16
		ts.add("yellow");//Its's size increases by double
		ts.add("white");//It is not synchronized
		System.out.println(ts);
		Iterator<Object> d=ts.descendingIterator();
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
		
		System.out.println("\n");
	}
	static void priorityQ()
	{
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(1.2f);//Insertion order is not maintained
//		pq.add(1);//Heterogeneous data not allowed
		pq.offer(1.2f);//duplicates are allowed
//		pq.add(null);//null is not allowed
		pq.add(5.1f);//Version 1.5v
		pq.add(0.0f);//it's default size is 11
		pq.add(3.4f);//size increases by double
		pq.add(1.7f);//It is not synchronized
		System.out.println(pq+"\n");
		System.out.println(pq.poll()+" \n"+pq);
	}
	static void linkedlistQ()
	{
		LinkedList ll=new LinkedList();
		ll.offer(123);
	}
	
	static void hashmap()
	{
		HashMap<Object,Object> hm=new HashMap<Object,Object>();
		hm.put(1, "ram");//Insertion order is not maintained
		hm.put("hi", 2);//heterogeneous data allowed
		hm.put(3, "ram");//duplicate values allowed
		hm.put(null, "radhe");//null key and null value allowed
		hm.put(4, "parth");//version history 1.2v
		hm.put(5, "vishnu");//it's default size is 16
		hm.put(6, null);//size increases by double
		hm.put(7, "name");//It is not synchronized
		System.out.println(hm);
	}
	static void LinkedHashmap()
	{
		LinkedHashMap<Object,Object> lhm=new LinkedHashMap<Object,Object>();
		lhm.put('a', 11);//Insertion order is MAINTAINED
		lhm.put('a', 12);//duplicate values allowed
		lhm.put(null, null);//null key and values allowed
		lhm.put(1, "hey");//heterogeneous data allowed 
		lhm.put('d', 15);//size 16
		lhm.put('e', 13);//size increases by double
		lhm.put('f', 17);//1.4v
		lhm.put('g', 19);//not synchronized
		System.out.println(lhm);
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
	static void treemap()
	{
		TreeMap<Object,Object> tm=new TreeMap<Object,Object>();
		tm.put('a', 11);//Insertion order is not MAINTAINED but sorted
		tm.put('a', 12);//duplicate values allowed
//		tm.put(null, null);//null key not allowed but values are allowed
//		tm.put(1, "hey");//heterogeneous keys not allowed but values are allowed 
		tm.put('d', 15);//size 16
		tm.put('m', 13);//size increases by double
		tm.put('f', 17);//1.2v
		tm.put('e', 19);//not synchronized
		System.out.println(tm);
		HashSet hs=new HashSet<>(tm.entrySet());
		Iterator i= hs.iterator();
		
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	static void hashTable()
	{
		Hashtable<Object, Object> ht=new Hashtable<>();
		ht.put('a', 11);//Insertion order is not MAINTAINED 
		ht.put('a', 12);//duplicate values allowed
//		ht.put(null, null);//null key not allowed but values are allowed
		ht.put(1, "hey");//heterogeneous keys not allowed but values are allowed 
		ht.put('d', 15);//size 11
		ht.put('m', 13);//size increases by double
		ht.put('f', 17);//1.0v
		ht.put('e', 19);//synchronized
		System.out.println(ht);
	}
	public static void main(String[] args) {
//	 	Arraylist();
//		Linkedlist();
//		vector();
//		hashset();
//		LinkedhasSet();
//		treeset();
//		priorityQ();
//		linkedlistQ();
//		hashmap();
//		LinkedHashmap();
//		treemap();
		hashTable();
	}
}
