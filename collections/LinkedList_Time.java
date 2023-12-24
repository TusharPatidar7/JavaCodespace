package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Time 
{
	public static Object arr[];
	
	static
	{
		arr = new Object[100000];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = new Object();
		}
	}
	void ArrayList()
	{
		long start;
		long end;
		
		ArrayList<Object> al =new ArrayList<Object>();
		start = System.currentTimeMillis();
		for (Object o : arr) 
		{
			al.add(o);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList Construction time : "+(end-start));
	}
	void LinkedList()
	{
		long start;
		long end;
		
		LinkedList<Object> ll =new LinkedList<Object>();
		start = System.currentTimeMillis();
		for (Object o : arr) 
		{
			ll.add(o);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList Construction time : "+(end-start));
	}
	void meth1()
	{
		for (Object o: arr) 
		{
			System.out.println(o);	
		}
	}
	
	public static void main(String[] args) 
	{
		LinkedList_Time llt =new LinkedList_Time();
		llt.ArrayList();
		llt.LinkedList();
//		llt.meth1();
	}
}
