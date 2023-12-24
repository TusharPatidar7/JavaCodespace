package coreJava;

public class Task {
	int declare() {
		int i = 10;
		return i;
	}

	String meth1() {
		System.out.println("meth1 called");
		System.out.println("Returned value from declare method is:" + new Task().declare());
		return "Meth1 Ends";
	}

	char meth2(int a, int b) {
		System.out.println("Sum of the parameters:" + (a + b));
		return 'c';
	}

	boolean meth3(String s) {
		System.out.println("meth3 called");
		return true;
	}

	public static void main(String[] args) {
		Task obj = new Task();
		System.out.println("Returned value from the methods");
		System.out.println("declare():" + obj.declare());
		System.out.println("meth1():" + obj.meth1());
		System.out.println("meth2():" + obj.meth2(5, 6));
		System.out.println("meth3():" + obj.meth3("Java"));
	}
}
