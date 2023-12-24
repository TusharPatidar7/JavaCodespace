package prepinsta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class al {
	public static void main(String[] args) {
		new al().m2();
	}
	void m1()
	{
		ArrayList<Object> al1=new ArrayList<Object>();
		al1.add("tushar");
		al1.add(22);
		al1.add('y');
		
		Iterator i=al1.iterator();
		String data="";
		while(i.hasNext())
		{
			data+=i.next();
		}
		System.out.println(data);
		
	}
	void m2()
	{
		String s = "Allen,Smith,David";
		String []ar = s.split(", ");
		ArrayList al=new ArrayList(Arrays.asList(ar));
		
		System.out.println(al);
		
	}
}
