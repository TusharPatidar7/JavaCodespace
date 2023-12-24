package oops;

public class ClassB 
{
	public static void main(String[] args) throws InterruptedException
	{
		multiThreading1 obj = new multiThreading1();
		
		Thread t =new Thread(obj);
		
		t.start();
//		t.join();
		Thread.yield();
		t.interrupt();
		
		String name=Thread.currentThread().getName();
		
		Thread.sleep(2000);
		t.interrupt();
		for(int i=1;i<=5;i++)
		{
//			Thread.sleep(1000);
			
			System.out.println("Java : "+name);
			
			
		}
	}
}
