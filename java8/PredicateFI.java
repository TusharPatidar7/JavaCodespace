package java8;

import java.util.function.Predicate;

public class PredicateFI{
	public static void main(String[] args) 
	{
//		Predicate<Integer> p1 = i->i%2==0;
//		System.out.println(p1.test(10));
//		System.out.println(p1.test(11));
		
		Employee e1 = new Employee(15550, true);
		Employee e2 = new Employee(10000, true);
		Employee e3 = new Employee(9500, false);
		
		Predicate<Employee> p2 = e->e.salary>10000 && e.isHavingGF==true;
		System.out.println(p2.test(e1));
		System.out.println(p2.test(e2));
		System.out.println(p2.test(e3));
	}
}
class Employee{
	int salary;
	boolean isHavingGF;
	Employee(int salary, boolean isHavingGf){
		this.salary = salary;
		this.isHavingGF = isHavingGf;
	}
}
