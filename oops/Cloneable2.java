package oops;

public class Cloneable2 
{
	void meth1() throws Exception
	{
		clone aobj1 = new clone("Kishan",101);
		System.out.println(aobj1.empName+" "+aobj1.empId);
		
		clone aobj2 = aobj1.meth2();
		aobj2.empId = 500;
		
		System.out.println(aobj2.empName+" "+aobj2.empId);
		System.out.println(aobj1.empId);
	}
	public static void main(String[] args) throws Exception
	{
		new Cloneable2().meth1();
	}
}
