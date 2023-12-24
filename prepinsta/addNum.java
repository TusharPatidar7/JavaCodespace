package prepinsta;

import java.util.Calendar;
import java.util.Scanner;

public class addNum {
	void add()
	{
		System.out.println("Enter 2 numbers to add :");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("Sum : "+(i+j));
		sc.close();		
	}
	void addDates()
	{
		Calendar d1=Calendar.getInstance();
		Calendar d2=Calendar.getInstance();
		
		d1.set(Calendar.YEAR, 2023);
		d1.set(Calendar.MONTH, Calendar.JANUARY);
		d1.set(Calendar.DATE, 1);

		d2.set(Calendar.YEAR, 2023);
		d2.set(Calendar.MONTH, Calendar.APRIL);
		d2.set(Calendar.DATE, 1);
		
		System.out.println("before adding : "+d1.getTime());
		d1.add(Calendar.DAY_OF_MONTH, d2.get(Calendar.DAY_OF_MONTH));
		 
		d1.add(Calendar.MONTH, d2.get(Calendar.MONTH));
		
		System.out.println("after adding : "+d1.getTime());
		
	}
	public static void main(String[] args) 
	{
		new addNum().addDates();
	}
}
