package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A2 
{
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(30);
		
//		al.forEach(a->System.out.println(a));
		
		Stream<Integer> s1=al.stream();
//		Stream<Integer> s2=s1.filter(a->a<=20);
//		System.out.println(s2.count());
		
//		Stream s2=s1.map(b->b*1.1);
//		List<Integer> li=(List)s2.collect(Collectors.toList());
//		System.out.println(li);
	}
	public static void main(String[] args) {
		new A2().meth1();
	}
}
