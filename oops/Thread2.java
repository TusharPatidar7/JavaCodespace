package oops;

public class Thread2 
{

	public static void main(String[] args) {
		Thread1 tobj = new Thread1();
		
		new Thread()
		{
			@Override
			public void run() {
				try
				{
					tobj.withdraw(20000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			};
		}
		.start();
		new Thread()
		{
			@Override
			public void run() {
				tobj.deposit(11000);
			};
		}
		.start();
	
	}
}
