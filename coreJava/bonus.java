package coreJava;

public class bonus {
	void meth1(double salary, int served) {
		if (served > 5) {
			double bonus = salary * .05;
			System.out.println("Salary : " + salary);
			System.out.println("Bonus : " + bonus);
			System.out.println("Updated salary :" + (salary + bonus));
		} else {
			System.out.println("Salary : " + salary);
		}
	}

	public static void main(String[] args) {
		new bonus().meth1(150000, 6);
	}
}
