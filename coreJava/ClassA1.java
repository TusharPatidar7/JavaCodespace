package coreJava;

import java.util.Scanner;

public class ClassA1 {
	static Scanner sc = new Scanner(System.in);

	int meth1(int a, String b) {
		System.out.println("meth1() called");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("Enter a int value to exit from meth1");
		return sc.nextInt();
	}

	String meth2(int x, int y) {
		System.out.println("meth2() called");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.print("Enter a string value");
		sc.nextLine();
		return sc.nextLine();
	}

	int meth3(int i) {
		System.out.println("meth3() called");
		System.out.println("i : " + i);
		return i;
	}

	public static void main(String[] args) {
		ClassA1 obj = new ClassA1();
		int result = obj.meth1(obj.meth3(sc.nextInt()), obj.meth2(sc.nextInt(), sc.nextInt()));
		System.out.println("Result : " + result);

	}
}
