package coreJava;

public class ClassQ extends ClassN {
	void BikeType() {
		super.Bike();
		System.out.println("\nBike Name : Bullet");
	}

	ClassQ() {
		super(50);
		System.out.println("\nQ default constructor");
	}

	public static void main(String[] args) {
		ClassQ obj = new ClassQ();
		obj.BikeType();
	}
}
