package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class priorityQueue 
{
	void meth1()
	{
		System.out.println("Implementing PriorityQueue");
		PriorityQueue<Object> pq =new PriorityQueue<Object>();
		pq.add(10);//Insertition order is NOT Maintained
					//But first element will always be the smallest element
		//pq.offer("Java");//Heterogeneous data NOT ALLOWED
		//pq.add(null);//null NOT ALLOWED
		pq.add(10);//Duplicated are ALLOWED
		pq.add(1);//It is available from java 1.5v
		pq.add(25);//It's default capacity is 11
		pq.offer(55);//It's size increases by DOUBLE
		pq.add(45);//It is NOT synchronized
		pq.add(100);
		System.out.println(pq+"\n");
		
		System.out.println("remove() : "+pq.remove()+"\n");
		
		System.out.println(pq+"\n");
		
		System.out.println("poll() : "+pq.poll()+"\n");
		
		System.out.println(pq+"\n");
		
		System.out.println("peek() : "+pq.peek()+"\n");
		
		System.out.println(pq+"\n");
		
		TreeSet<Object> ts=new TreeSet<Object>(pq);
		
		System.out.println("TreeSet : "+ts);
	}
	void meth2()
	{
		LinkedList<Object> ll1=new LinkedList<Object>();
		
		List<Object> ll2=new LinkedList<Object>();
		
		ll1.add(10);
		ll1.offer(20);
		
		ll2.add(100);
		//ll2.offer(200);//C.E bcs offer() is not present in list interface
		//here we are holding linkedlist object into list reference so we can only use list methods
	}
	public static void main(String[] args) {
		new priorityQueue().meth1();
	}
}
