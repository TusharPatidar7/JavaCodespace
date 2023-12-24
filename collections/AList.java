package collections;

import java.util.HashSet;
import java.util.Set;

import prepinsta.al;

public class AList {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add("A");//Insertion order is not maintained
		s.add("A");//Duplicates are not allowed
		s.add(1);//Heterogeneous data is allowed
		s.add(null);//null is allowed
		s.add("n");//Available from java 1.2v
		s.add("w");//default capacity is 16
		s.add("e");//size increases by double
		s.add("r");//not synchronized
		
		System.out.println(s);
		
		
	}
}
