package coreJava;

public class Grade {
	char meth1(int marks) {
		if (marks < 25)
			return 'F';
		else if (marks >= 25 && marks < 45)
			return 'E';
		else if (marks >= 45 && marks < 50)
			return 'D';
		else if (marks >= 50 && marks < 60)
			return 'C';
		else if (marks >= 60 && marks < 80)
			return 'B';
		else
			return 'A';
	}

	public static void main(String[] args) {
		char grade = new Grade().meth1(95);
		System.out.println("Your Grade is " + grade);
	}
}
