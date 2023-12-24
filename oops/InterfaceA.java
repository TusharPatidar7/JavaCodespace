package oops;

public interface InterfaceA 
{
	default void meth1()
	{
		System.out.println("InterfaceA Method 1");
//		this.meth2();
	}
	private void meth2()
	{
		System.out.println("Private method");
	}
}
