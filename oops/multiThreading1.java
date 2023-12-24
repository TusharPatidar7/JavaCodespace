package oops;

public class multiThreading1 extends Thread
{
//	@Override
//	public void run()
//	{
//		System.out.println("Ready for Interview");
//		for(int i=0;i<=5;i++)
//		{
//			System.out.println("This is my "+i+" interview!");
//		}
//		System.out.println("I Got Placed!");
//		try 
//		{
//			Thread.sleep(10000);
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("Exception occured");
//		}
//		System.out.println("Time to go to office");	
//	}
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		multiThreading1 o = new multiThreading1();
		
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o);
		t1.setName("first-thread");
		t2.setName("second-thread");
		
		t1.start();
//		t1.run();
		
		t1.join();
		
		t2.start();
//		t2.run();
		
//		t2.join();
//		
//		t2.interrupt();
		
		String name = Thread.currentThread().getName();
		
		for(int i=1;i<=5;i++)
		{
//			Thread.sleep(1000);
			
			System.out.println("Java : "+name);
			
			
		}
	}
}
