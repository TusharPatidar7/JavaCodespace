package oops;

public class GarbageCollecting
{
	@Override
	protected void finalize() //present in object class //internally called by gc
	{
		System.out.println("Garbage has been collected");
	}
	void meth1()
	{
		System.out.println("meth1() called\n");
		GarbageCollecting obj = new GarbageCollecting(); 
		// 3rd way 
		//all the objects that are created inside methods will be destroyed after method execution
	}
	public static void main(String[] args) 
	{
		GarbageCollecting aobj1 = new GarbageCollecting();
		GarbageCollecting aobj2 = new GarbageCollecting();
		
		System.out.println("Object 1 : "+aobj1.hashCode());
		System.out.println("Object 2 : "+aobj2.hashCode()+"\n");
		
		aobj1.meth1();
		
//		1st way
		aobj2=aobj1; //Reassigning the reference variable
		
//		2nd way
//		aobj1 = null;//Nullifying the reference variable
		
		
		System.gc();
		
		
		System.out.println("Object 1 : "+aobj1.hashCode());
		System.out.println("Object 2 : "+aobj2.hashCode()+"\n");
		
		//Or we can use Runtime class instead of System class
		
//		Runtime r = Runtime.getRuntime();
//		r.gc();
		
	}
}
