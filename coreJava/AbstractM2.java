package coreJava;

public class AbstractM2 extends AbstractM1 {
	@Override
	void meth1() {
		System.out.println("abstract method overriden");
	}

	public static void main(String[] args) {
		AbstractM1 obj = new AbstractM2();
//		obj.meth1();
//		AbstractM1.meth2(); // static variable
//		obj.meth3();
	}
}
