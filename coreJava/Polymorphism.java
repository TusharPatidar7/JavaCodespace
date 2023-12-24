package coreJava;

public class Polymorphism {
	// Method overloading
	public final void m1() {
		System.out.println("hi");
	}

	protected void m1(int a) {
		System.out.println("hello");
	}

	static void meth1(String s) {
		System.out.println(s);
	}

	// Overidden methods
	public Polymorphism meth1() {
		System.out.println("Parent Class method");
		return this;
	}

	static void meth2(int a) {
		System.out.println("Parent Class method : " + a);
	}

	protected int meth3(int a, String s) {
		System.out.println("s : " + s);
		return a;
	}

	String meth4(String s) {
		System.out.println("super class method");
		return s;
	}

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.m1();
		obj.m1(0);
		meth1("Java");
	}
}
