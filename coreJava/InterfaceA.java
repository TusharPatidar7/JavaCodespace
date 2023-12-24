package coreJava;

public interface InterfaceA {
	int a = 10; // public static final
	String s = "Java";

	void meth1();

	default void meth2() {
		System.out.println("Interface A default method : " + a);
		this.meth4();
		InterfaceA.meth3();
	}

	static void meth3() {
		System.out.println("Interface A static method : " + s);
	}

	private void meth4() {
		System.out.println("Interface A private method called");
	}

	default void MI() {
		System.out.println("Interface A method");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		InterfaceA.meth3();
	}
}
