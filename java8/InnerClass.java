package java8;

public class InnerClass {

	public static void main(String[] args) {
//		Runnable r = new Runnable() 
//		{                             //Anonymous Inner Class that implements Runnable Interface
//			@Override
//			public void run() {
//				for(int i=0; i<5; i++) {
//					System.out.println("Inner Class Thread");
//				}				
//			}
//		};
		
		Runnable r = ()->{				//Lambda Expression
			for(int i=0; i<5; i++) {
				System.out.println("Inner Class Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}

}
