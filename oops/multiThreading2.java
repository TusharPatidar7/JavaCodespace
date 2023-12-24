package oops;

public class multiThreading2 implements Runnable
{
 @Override
 public void run()
 {
	for(int i=1;i<5;i++)
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" : "+i+" : "+Thread.currentThread().getPriority());
	}
 }
 public static void main(String[] args) 
 {
	multiThreading2 obj = new multiThreading2();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);
	Thread t3 = new Thread(obj);
	
	t1.setName("first-thread");
	t2.setName("second-thread");
	t3.setName("third-thread");
	
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
	t1.run();
 }
}
