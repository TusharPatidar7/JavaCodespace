package oops;

public class Synchronized extends Thread
{
	@Override
	public void run()
	{
		critical(); 
	}
	synchronized void critical() //Synchronized method
	{
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println(name+"("+priority+") has entered run()");
		for(int i=1; i<=5; i++)
		{
			System.out.println(name+"("+priority+")"+i);
		}
		
		System.out.println(name+"("+priority+") has completed executing run()");

	}
	public static void main(String[] args) {
		Synchronized obj = new Synchronized();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
	
	/*
	//Synchronized Block 
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println(name+"("+priority+") has entered run()");
		
		synchronized (this) //Synchronized Block
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(name+"("+priority+")"+i);
			}
		}
		
		System.out.println(name+"("+priority+") has completed executing run()");
	}
	public static void main(String[] args) {
		Synchronized obj = new Synchronized();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
	 */
}
