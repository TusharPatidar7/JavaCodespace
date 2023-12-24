package prepinsta;

public class ClassA 
{
	int declare()
	{
		int i=10;
		return i;
	}
	String meth1()
	{
		System.out.println("method 1 called");
		System.out.println("returned value from declare method is : "+new ClassA().declare());
		return "meth1 ends";
	}
	char meth2(int a,int b)
	{
		System.out.println("Sum of parameters : "+(a+b));
		return 'c';
	}
	boolean meth3(String s)
	{
		System.out.println("meth3 called");
		return true;
	}
	
	public static void main(String[] args) {
		ClassA a=new ClassA();
		System.out.println("Returned values from methods");
		System.out.println("declare(): "+a.declare());
		System.out.println("meth1(): "+a.meth1());
		System.out.println("meth2(): "+a.meth2(5,6));
		System.out.println("meth3():  "+a.meth3("Java"));
		
		ClassA a1=new ClassA();
		ClassA a2=a1;
		System.out.println(a1.equals(a2));//true
	}
}
