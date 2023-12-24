package oops;

public class A1 implements Comparable<A1>
{
	int eId;
	String eName;
	String eDept;
	
	public A1(int eId,String eName,String eDept)
	{
		this.eDept=eDept;
		this.eId=eId;
		this.eName=eName;
	}
	@Override
	public String toString() {
		return eId+" "+eName+" "+eDept;
	}
	
	@Override
	public int compareTo(A1 o) {
		return this.eId-o.eId;
	}
	public int geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public String geteDept() {
		return eDept;
	}
	
	
}
