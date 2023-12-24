package coreJava;

import java.util.Scanner;

public class EmpDetails {
	void emp() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter The Following Details :");
		System.out.println("1. Employee Name");
		String ename = sc.nextLine();
		System.out.println("2. Employee ID");
		int id = sc.nextInt();
		System.out.println("3. Employee Salary");

		long sal = sc.nextLong();
		sc.nextLine();

		System.out.println("4. Employee Department");
		String dept = sc.nextLine();
		System.out.println("5. Employee Address");
		String add = sc.nextLine();

		System.out.println("Check the details that you had entered\n");
		System.out.println("Employee Name = " + ename);
		System.out.println("Employee ID = " + id);
		System.out.println("Employee Salary = " + sal);
		System.out.println("Employee Department = " + dept);
		System.out.println("Employee Address = " + add);

		sc.close();
	}

	public static void main(String[] args) {
		new EmpDetails().emp();
	}
}
