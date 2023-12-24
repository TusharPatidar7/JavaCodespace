package coreJava;

import java.util.Scanner;

public class Encaps2 {
	void meth1() {
		Scanner sc = new Scanner(System.in);
		Encaps obj = new Encaps();

		System.out.println("Enter your name : ");
		obj.setEname(sc.next());

		System.out.println("Enter your id : ");
		obj.setEid(sc.nextInt());

		System.out.println("Enter your salary : ");
		obj.setSal(sc.nextFloat());

		System.out.println("Enter your experience");
		obj.setExp(sc.nextInt(), obj.getSal());

		System.out.println("======= User Details ======");
		System.out.println("Employee Name : " + obj.getEname());
		System.out.println("Employee ID : " + obj.getEid());
		System.out.println("Employee Salary : " + obj.getSal());
		System.out.println("Employee Experience : " + obj.getExp());
		sc.close();
	}

	public static void main(String[] args) {
		new Encaps2().meth1();
	}
}
