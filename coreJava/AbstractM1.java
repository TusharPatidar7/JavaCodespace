package coreJava;

public abstract class AbstractM1 {
	abstract void meth1();

	static void meth2() {
		System.out.println("static method");
	}

	final void meth3() {
		System.out.println("meth3");
	}

	AbstractM1() {
		System.out.println("Constructor");
		this.meth3();
		this.meth2();
		this.meth1();
	}

	static {
		System.out.println("Block");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		meth2();
	}
}
