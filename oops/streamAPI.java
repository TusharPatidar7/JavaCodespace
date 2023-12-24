package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class streamAPI 
{
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(40);
		al.add(30);
		System.out.println("Before : "+al);
		
//		Stream<Integer> s1=al.stream();
//		Stream<Integer> s2=s1.map(i->i*2);
//		
//		List li=s2.collect(Collectors.toList());
//		System.out.println("After : "+li);
		
		List<Integer> li = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("After : "+li);
		
//		Collections.sort(al);
		
		List<Integer> li2 = al.stream().sorted().collect(Collectors.toList());
		System.out.println("After : "+li2);
	}
	void meth2()
	{		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(40);
		al.add(30);
		
		al.forEach(data->System.out.print(data+" "));
		/*
		forEach(Consumer) => It will accept consumer
		functional Interface as its parameter, So we have
		written lambda expression for "accept()" which is
		present in Consumer Interface
		 */
	}
	void meth3()
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Raja");
		al.add("Tushar");
		al.add("Harsh");
		al.add("Divyansh");
		al.add("Kiyansh");

//		Stream<String> s1=al.stream();
//		Stream<String> s2=s1.filter(data->data.length()<=5);
//		long num = s2.count();
//		System.out.println(num);

		System.out.println("No. of elements having length <=5 : "+al.stream().filter(data->data.length()<=5).count());
	}
	public static void main(String[] args) 
	{
		System.out.println("Implementing Stream API");
		streamAPI obj=new streamAPI();
		obj.meth2();
	}
}
