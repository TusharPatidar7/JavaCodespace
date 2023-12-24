package oops;

import java.util.Comparator;

public class Emp 
{
	String empName;
	float empSal;
	int empAge;
	
	public Emp(String empName,int empAge,float empSal)
	{
		this.empName=empName;
		this.empAge=empAge;
		this.empSal=empSal;
//		if(empAge>=25)
//		{
//			this.empSal=empSal*1.1;
//		}
//		else
//		{
//			this.empSal=empSal;
//		}
	}	
	public int getEmpAge() 
	{
		return empAge;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public float getEmpSal() 
	{
		return empSal;
	}
	public void setEmpSal(float empSal) 
	{
		this.empSal = empSal;
	}

	@Override
	public String toString() 
	{
		return "[empAge=" + empAge + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
}
