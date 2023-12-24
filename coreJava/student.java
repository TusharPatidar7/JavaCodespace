package coreJava;

public class student {
	void meth1(int C_held, int attended) {
		int per = (attended * 100) / C_held;
		System.out.println("Percentage of class attended : " + per + "%\n");
		if (per < 75)
			System.out.println("The student is not allowed to sit in the class");
		else
			System.out.println("The student is allowed to sit in the class");
	}

	public static void main(String[] args) {
		new student().meth1(90, 80);
	}
}
