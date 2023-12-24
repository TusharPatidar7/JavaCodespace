package coreJava;

public class Switch2 {
	void meth1(int i, int j) {
		do {
			if (i < 0)
				System.out.println("i value is -ve");
			else if (i > 0)
				System.out.println("i value is +ve");
			else
				System.out.println("i=0");
			if (j < 0)
				System.out.println("j value is -ve");
			else if (j > 0)
				System.out.println("j value is +ve");
			else
				System.out.println("j=0");
			System.out.println("while loop");
			i++;
			j--;
		} while (i < 5 && j > 0);
	}

	public static void main(String[] args) {
		new Switch2().meth1(1, -5);
	}
}
