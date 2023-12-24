package coreJava;

import java.util.Scanner;

public class Task5 {
	static Scanner sc = new Scanner(System.in);
	StringBuffer ar[] = new StringBuffer[4];

	void exercise() {
		exercise(0);
		System.out.println("\nAdd exercies(y/n)");
		if (sc.next().equals("y")) {
			ar[3] = new StringBuffer(sc.next());
			for (int i = 0; i < ar.length; i++) {
				System.out.println("-->" + ar[i]);
			}
		} else
			System.out.println("End");
	}

	void exercise(int index) {
		System.out.println("\n1.pushup 2.pullups 3.Plank 4.Squats\nSelect any two\n");

		for (int i = index; i < index + 2; i++)

			ar[i] = new StringBuffer(sc.next());

		System.out.println("\nToday's exercise routine");
		for (int i = 0; i < index + 2; i++) {
			System.out.println("-->" + ar[i]);
		}
	}

	public static void main(String[] args) {
		Task5 obj = new Task5();
		obj.exercise();
	}
}
