package coreJava;

public class sunday {
	final static int x;
	static {
		System.out.println();
		x = 50;
	}

	static public void meth1() {
		System.out.println("hi");

	}

	public static void main(String[] args) {
		System.out.println(args);
		sunday.meth1();
	}
}
