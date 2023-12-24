package collections;

public class comparable implements Comparable<comparable>
{
	String empName;
	int empId;
	String empDept;
	
	public comparable(String empName,int empId,String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	
	@Override
	public String toString() 
	{
		return empName+" "+empId+" "+empDept;
	}
	
	public int compareTo(comparable o) 
	{
//		return this.empId-o.empId;
//		return this.empName.compareTo(o.empName);
		return this.empDept.compareTo(o.empDept);
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpDept() {
		return empDept;
	}
	
}
