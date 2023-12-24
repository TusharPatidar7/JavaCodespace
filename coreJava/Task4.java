package coreJava;

public class Task4 extends Task3 {
	void display() {
		System.out.println("hi");
		super.meth4();
	}

	static int show(int a) {
		System.out.println(a + a);
		return a + a++;
	}

	Task4() {

		this(show(50));

		for (int i = 1;; i++) {
			super.meth4();
			break;
		}
		System.out.println("hi");
		System.out.println(show(50));
	}

	Task4(int a) {
		// super();//by-default
		System.out.println("===>" + (a++ + show(50)));
	}

	public static void main(String[] args) {
		new Task4().display();
	}
}
