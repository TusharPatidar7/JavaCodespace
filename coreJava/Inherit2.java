package coreJava;

public class Inherit2 extends Inherit {
	public void meth2() {
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		Inherit pobj = new Inherit();// HAS-A-Relation
		s = 10;
		pobj.meth1();

		Inherit2 cobj = new Inherit2();
		cobj.meth2();
	}

}
