package oops;

public class DeadLock 
{
	public static void main(String[] args)   
	{
		final String A = "Java";
		final String B = "Python";
		
		Thread t1 = new Thread()
		{//Anonymous Inner Class Starts here
			@Override
			public void run() 
			{ 
				synchronized(A)//Thread 1 is holding Java 
				{
					System.out.println("Thread 1 locked on A");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			
					synchronized(B)//Thread will be waiting for B (Python)
					{
						System.out.println("Thread 1 locked on B");
					}
					System.out.println("No Dead Lock");
				}
			}
		};
		Thread t2 = new Thread()
		{//Anonymous Inner Class Starts here
			@Override
			public void run() 
			{ 
				synchronized(B)//Thread 2 is holding Python 
				{
					System.out.println("Thread 2 locked on B");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			
					synchronized(A)//Thread will be waiting for A (Java)
					{
						System.out.println("Thread 2 locked on A");
					}
					System.out.println("No Dead Lock");
				}
			}
		};
		
	 t1.start();
	 t2.start();
	}	   
}  
