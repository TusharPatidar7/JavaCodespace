package coreJava;

public class ClassZ extends Inherit implements InterfaceA, InterfaceB {
	@Override

	public void meth1() {
		System.out.println("Interface A abstract method overridden");
	}

	public void show(String data) {
		System.out.println(data);
	}

	public void MI() // overridding InterfaceA method
	{
		// Resolve ambiguity in interfaces(MULTIPLE INHERITANCE)
		InterfaceA.super.MI();
		InterfaceB.super.MI();
	}

	public static void main(String[] args) {
		InterfaceA aobj = new ClassZ();
		aobj.meth1();
		aobj.meth2();

		System.out.println("===================================");
		aobj.MI();

		System.out.println("===================================");
		InterfaceB bobj = new ClassZ();
		bobj.show("Interface B abstract method overridden");

		System.out.println("===================================");
		ClassZ zobj = new ClassZ();
		zobj.meth5();
	}
}
