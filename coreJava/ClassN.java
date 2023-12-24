package coreJava;

import com.pack1.ClassO;

public class ClassN extends ClassO {
	public void Bike() {
		this.vehicle();

		this.setvType("Bike");
		System.out.println("\nVehicle type : " + this.getvType());
		this.setvColor("Black");
		System.out.println("Vehicle color : " + this.getvColor());
		this.setvNo("mp09 7777");
		System.out.println("Vehicle Number : " + this.getvNo());
	}

	ClassN() {
		System.out.println("default N");
	}

	ClassN(int a) {
		System.out.println("Parameterized N");
	}

	public static void main(String[] args) {
		ClassN obj = new ClassN();
		obj.Bike();
	}
}
