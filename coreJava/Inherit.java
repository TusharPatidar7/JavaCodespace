package coreJava;

public class Inherit {
	static int s;
	public int a;

	public void meth1() {
		System.out.println("Parent class object");
		System.out.println("Initialised in child class s : " + s);
		System.out.println("a : " + a);
	}

	void meth5() {
		System.out.println("Void method 5");
		this.meth6();
	}

	static void meth6() {
		System.out.println("10");
	}

}
