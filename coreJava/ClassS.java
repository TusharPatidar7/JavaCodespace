package coreJava;

public class ClassS {
	void meth1(int units) {
		int total_cost = units * 100;
		if (total_cost < 1000) {
			System.out.println("Final bill is " + total_cost);
			System.out.println("Purchase of " + (1000 - total_cost) + " can get 25% discount on your bill!!!");
		} else {
			float discount = (total_cost * 0.25f);
			System.out.println("Total Amount : " + total_cost);
			System.out.println("Discounted Amount : " + discount);
			System.out.println("Final bill : " + (total_cost - discount));
		}
	}

	public static void main(String[] args) {
		new ClassS().meth1(15);
	}
}
