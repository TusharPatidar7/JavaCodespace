package collections;

import java.util.TreeSet;

import oops.MyComparator;

public class CompComp{

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<Object>(new MyComparator());
		ts.add("B");
		ts.add("Anna");
		ts.add(new StringBuffer("KK"));
		ts.add(new StringBuffer("Tiger"));
		ts.add("Z");
		ts.add("M");
		ts.add("B");
		System.out.println(ts);
		
		
	}

}
