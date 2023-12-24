package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task 
{
	void meth1()
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp("Tushar",22,90000));
		al.add(new Emp("Raja",26,60000));
		al.add(new Emp("Harsh",28,80000));
		
		Stream<Emp> s1=al.stream();
		Stream<Emp>s2=s1.map(data->
		{
			if(data.getEmpAge()>25)
			{
				data.setEmpSal(data.getEmpSal()*1.10f);
			}
			return data;
		});
		
		ArrayList<Emp>li=(ArrayList<Emp>)s2.collect(Collectors.toList());
		for(Object o:li)
		{
			System.out.println(o);
		}
		System.out.println("--------------");
		Collections.sort(li,new Emp_Comparator());
		li.forEach(data->System.out.println(data));

	}
	
	public static void main(String[] args) 
	{
		new task().meth1();
	}
	
}
