package coreJava;

import java.util.Scanner;

public class InputTest {
	static InputTest obj = new InputTest();
	Scanner sc = new Scanner(System.in);

	void display() {
		System.out.println("Enter two Numbers :");
		int a = sc.nextShort();
		int b = sc.nextShort();

		System.out.println("Mul of " + a + " and " + b + " = " + (a * b));
	}

	void checkElligibility() {
		System.out.println("Enter Your Good Name");
		String name = sc.nextLine();

		System.out.println("Enter Your Age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println(name + " You are elligible to vote!");
		} else {
			System.out.println("As your age is " + age);
			System.out.println("You will be elligible after " + (18 - age) + " years!");
		}
	}

//	void jump()
//	{ 
//		for(int i=0; i<10; i++)
//		{
//			if(i==5)
//				return;
//			System.out.println(i);
//		}
//		System.out.println("Out");
//	}
	public static void main(String[] args) {
		// Tobj.display();
		obj.checkElligibility();
		// obj.jump();
	}
}
