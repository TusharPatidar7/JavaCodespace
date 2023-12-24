package coreJava;

public class Polymorphism2 extends Polymorphism {
	// Method Overridding

	@Override
	public Polymorphism2 meth1() {
		System.out.println(10);
		return new Polymorphism2();
	}

	protected static void meth2(int x)// method hiding
	{
		System.out.println(20);
	}

	public int meth3(int x, String s) {
		System.out.println(30);
		return x;
	}

	@Override
	String meth4(String data) {
		System.out.println(40);
		return data;
	}

	public static void main(String[] args) {
		Polymorphism obj1 = new Polymorphism();
		obj1.meth1();
		obj1.meth2(100);
		obj1.meth3(10, "Java");
		obj1.meth4("Hey");
		System.out.println("-------------");

		Polymorphism obj2 = new Polymorphism2();
		obj2.meth1();
		obj2.meth2(100);
		obj2.meth3(10, "Java");
		obj2.meth4("Hey");
	}

}
