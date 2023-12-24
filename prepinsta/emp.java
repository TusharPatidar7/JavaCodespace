package prepinsta;

import java.util.Comparator;

public class emp 
{
	 String empName;
	 int Age;
	 float salary;
	
	 public emp(String empName, int Age, float salary)
	 {
		 this.empName = empName;
		 this.Age = Age;
		 this.salary = salary;
	 }
	 
	public String getEmpName() {
		return empName;
	}
	public int getAge() {
		return Age;
	}
	public float getSalary() {
		return salary;
	}
	public float setSalary(float salary)
	{
		this.salary=salary;
		return this.salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empName + " " +Age+" "+salary;
	}
}
