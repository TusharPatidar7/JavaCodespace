package prepinsta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class test2 
{
	static void increment()
	{
		ArrayList<emp> e =new ArrayList<emp>();
		e.add(new emp("raj",20,15000));
		e.add(new emp("Praful",25,35000));
		e.add(new emp("Shyam",26,25000));
		e.add(new emp("Harsh",29,45000));
		e.add(new emp("hari",30,55000));
		
		Stream<emp> s1=e.stream();
		Stream<emp> s2 = s1.map(data ->
		{
			if(data.getAge()>25)
			{
				data.setSalary(data.salary*1.1f);
			}
			return data;
		});
		ArrayList<emp>li=(ArrayList<emp>)s2.collect(Collectors.toList());
		for(Object o:li)
		{
			System.out.println(o);
		}
		System.out.println("--------------");
		Collections.sort(li,new emp_comparator());
		li.forEach(data->System.out.println(data));
		
	}
	public static void main(String[] args) {
		increment();
	}

}
