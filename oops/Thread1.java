package oops;

public class Thread1 
{
	int amount = 10000;
	final int min_amount =1000;
	
	synchronized final void withdraw(int amount) throws InterruptedException
	{
		if(this.amount < amount)
		{
			System.out.println("Insufficient balance");
			wait();
//			Thread.sleep(1000);
			System.out.println("Amount credited");
			if(this.amount-amount<min_amount)
			{
				System.out.println("Cannot withdraw "+amount+"! Atleast 1000 should be there is your account");
				System.out.println("You can withdraw atmost "+(this.amount-min_amount));
			}
			else
			{
			this.amount-=amount;
			System.out.println("With draw successful \nBalance is "+this.amount);
			}
		}
		else
		{
			this.amount -= amount;
			System.out.println("With draw succeful \nBalance is "+this.amount);
		}
	}
	synchronized final void deposit(int amount)
	{
		this.amount += amount;
		System.out.println("Deposited "+amount+" successfully \nCurrent Balance is "+this.amount);
		notify();
		//notifyAll();
	}
}
