package coreJava;

public class ClassE {
	void meth1() {
		System.out.println("meth1 called!");
	}

	public static void main(String[] args) {
		System.out.println("Java is awesome");
		ClassE obj = new ClassE();
		obj.meth1();
		System.out.println("---------------------");

		new ClassE().meth1();
	}

}
