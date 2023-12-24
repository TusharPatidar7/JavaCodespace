package coreJava;

public class Exam {

	int empno;
	String name;
	int sal;
	int yos;

	Exam(int empno, String name, int sal, int yos) {

		this.empno = empno;
		this.name = name;
		this.sal = sal;
		this.yos = yos;
	}

	void bonus(int sal, int YoS) {
		if (YoS > 5) {
			System.out.println("Bonus : " + (sal * 0.05));
			System.out.println("Upadated Salary :" + (sal * 1.05));
		}
	}

	public static void main(String[] args) {

		Exam emp = new Exam(101, "Scott", 50000, 6);
		emp.bonus(emp.sal, emp.yos);
	}

}
