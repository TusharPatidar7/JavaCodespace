package oops;

public class clone implements Cloneable
{
	public String empName;
	int empId;
	
	public clone(String empName,int empId)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public clone meth2() throws CloneNotSupportedException
	{
		clone obj = (clone)super.clone();
		return obj;
	}
}	
