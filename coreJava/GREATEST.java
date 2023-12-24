package coreJava;

public class GREATEST {
	void meth1(int a, int b, int c) {
		if (a > b) {
			if (a > c)
				System.out.println(a + " is greatest");
			else
				System.out.println(c + " is greatest");
		} else {
			if (b > c)
				System.out.println(b + " is greatest");
			else
				System.out.println(c + " is greatest");
		}

	}

	public static void main(String[] args) {
		new GREATEST().meth1(50, 10, 15);
		;
	}
}
