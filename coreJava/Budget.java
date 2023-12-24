package coreJava;

public class Budget {
	static int deposit;
	static float Total_expense;
	float remainning;

	float myself(int I_n, String I_name, float amount) {
		System.out.println("Item" + I_n + " " + I_name);
		System.out.println("Amount:" + amount + "\n");
		return amount;
	}

	Budget() {
		// deposited amount by parents
		deposit = 15000;
		System.out.println("Monthly deposit : " + deposit);
		System.out.println("----------------------------------------" + "\n");
	}

	public static void main(String[] args) {
		Budget obj = new Budget();

		Total_expense = obj.myself(1, "March Hostel Rent", 10000);
		Total_expense += obj.myself(2, "Reliance Smart", 650);
		Total_expense += obj.myself(3, "Mobile Recharge", 666);
		Total_expense += obj.myself(4, "Dmart", 280);
		Total_expense += obj.myself(5, "Movie", 500);
		Total_expense += obj.myself(6, "Other", 1000);

		System.out.println("------------------------------------------");
		System.out.println("March month expenses : " + Total_expense + "\n");
		obj.remainning = deposit - Total_expense;
		System.out.println("Available Amount : " + obj.remainning);
	}
}