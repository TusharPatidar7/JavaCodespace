package oops;

import java.io.Serializable;

public class ClassE implements Serializable
{
	String empName;
	int empid;
	String deptName;
	@Override
	public String toString() {
		return empName +" " + empid+" "+deptName;
	}
	public ClassE(String empName,int empid,String deptName) 
	{
		this.empName=empName;
		this.empid=empid;
		this.deptName=deptName;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpid() {
		return empid;
	}
	public String getDeptName() {
		return deptName;
	}
	 
}
