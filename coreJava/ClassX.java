package coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ClassX {
	void meth1() {
		System.out.print("Enter movie name ");
		Scanner sc = new Scanner(System.in);
		String movie = sc.next();
		System.out.print("\nHow many tickets you want to book ");
		int tick = sc.nextInt();
		System.out.println("Enter seat(A-Z)");
		String seat = sc.next();
		String[] arr = new String[tick];
		System.out.println("Enter " + tick + " names");
		int j = 0;
		for (int i = 0; i < tick; i++) {
			arr[i] = sc.next() + seat + ++j;
		}

		for (String s : arr) {
			System.out.println(s + " ");
		}
	}

	void TDarray() {
		int[] arr[] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		new ClassX().meth1();
		// new ClassX().TDarray();
	}
}
