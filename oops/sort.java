package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort 
{
	void meth1()
	{
		int arr[]= {2,1,6,4,3,5};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)+"\n\n");
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(500);
		al.add(200);
		System.out.println(al);
		
		Collections.sort(al);//Collections.sort() only applicable for List implemented classes
		
		System.out.println(al);
	}
	public static void main(String[] args) {
		new sort().meth1();
	}
}
