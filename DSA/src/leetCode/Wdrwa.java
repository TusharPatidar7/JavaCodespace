package leetCode;


public class Wdrwa extends Thread {
	
	private int amount=10000;
	
	synchronized public void withdraw(int amount) {
		
		try {
			if(amount > this.amount) {
				System.out.println("Insufficent balance");
				Thread.sleep(1000);
				wait();
				Thread.sleep(1000);
				System.out.println("Amount Credited");
				this.amount-=amount;
				System.out.println("Withdraw successfull : "+amount);
			}
			else {
				this.amount -=amount;
				System.out.println("Withdraw successfull :"+amount);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized public void deposit(int amount) {
		this.amount+=amount;
		System.out.println("Money deposited");
		System.out.println("Account Balance : "+this.amount);
		notify();
	}

}
