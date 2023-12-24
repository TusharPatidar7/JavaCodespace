package java8;

public class test3 {

	public void m1() {
		System.out.println("child Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new test3()::m1;
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread");
	}

}
