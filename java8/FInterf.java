package java8;
//Not required below code
//class MyRunnable implements Runnable
//{
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=0; i<10; i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}

public class FInterf {

	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
		
		//instead of above class we can use lambda expression
		Runnable r = ()->{
			for(int i=0; i<10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
