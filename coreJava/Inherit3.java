package coreJava;

public class Inherit3 extends Inherit {
	void meth3() {
		Inherit obj = new Inherit();// 1st point Has-A-Relation
		obj.a = 20;
		obj.meth1();

		Inherit obj2 = new Inherit3();// 2nd point Is-A-Relation
		obj2.meth1();

		Inherit3 obj3 = new Inherit3();// 3rd point
		obj3.meth1();

		// Inherit3 obj4 = new Inherit();//4th point

	}

	public static void main(String[] args) {
		new Inherit3().meth3();
	}
}
