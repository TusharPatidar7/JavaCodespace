package oops;

import java.util.Optional;

public class OptionalClass {
	void meth1()
	{
		String arr[] = new String[5];
		arr[1]="Kishan";
		arr[2]="Java";
		
//		System.out.println(arr[3].toUpperCase());
		
		Optional<String> o=Optional.ofNullable(arr[3]);
		System.out.println(o);
		
		if(o.isPresent())
		 System.out.println(o.get());
		else
			System.out.println("It's Empty");
		
	}
	public static void main(String[] args) 
	{
		new OptionalClass().meth1();
	}
}
