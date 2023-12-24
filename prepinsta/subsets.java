package prepinsta;

import java.util.HashSet;
import java.util.Iterator;


public class subsets 
{
	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");
		
		HashSet hs2=new HashSet();
		hs2.add("A");
		hs2.add("B");
		hs2.add("C");
		
		System.out.println(hs1.containsAll(hs2));
		
	}

}
