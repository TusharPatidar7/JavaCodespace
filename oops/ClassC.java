package oops;

public class ClassC
{
	int empno;
	String ename;
	
	public ClassC(int empno,String ename) {
		this.empno=empno;
		this.ename=ename;
	}
	@Override
	public String toString() {
		return empno + " "+ ename;
	}
}