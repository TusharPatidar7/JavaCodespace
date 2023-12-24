package coreJava;

public class Forloop {
	void meth1() {
		for (int i = 0; i < 6; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i + i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 8; k >= i + i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++)
				System.out.println("");
			new Forloop().meth1();
		}
	}
}
