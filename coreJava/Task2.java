package coreJava;

import java.util.Scanner;

public class Task2 {
	Scanner sc = new Scanner(System.in);

	void meth1() {
		int r = 1;
		do {
			int sum = 0;
			System.out.println("Enter a number upto which you want sum");
			int num = sc.nextInt();
			System.out.println("Enter " + num + " numbers :");
			for (int i = 1; i <= num; i++) {
				int j = sc.nextInt();
				sum += j;
			}
			System.out.println("Addition is " + sum);
			System.out.println("Do you want to try again?(1/0)");
			int c = sc.nextInt();
			if (c == 0)
				break;
		} while (r == 1);
	}

	public static void main(String[] args) {
		Task2 obj = new Task2();
		System.out.println("Do you want to perform Addition(1/0)");
		int c = obj.sc.nextInt();

		if (c == 1)
			obj.meth1();
		System.out.println("End");
	}
}
