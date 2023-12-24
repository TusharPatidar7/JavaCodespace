package coreJava;

import com.pack1.ClassO;

public class ClassM extends ClassO {
	public void car() {
		this.vehicle();
		this.setvType("Car");
		System.out.println("\nVehicle type : " + this.getvType());
		this.setvColor("Red");
		System.out.println("Vehicle color : " + this.getvColor());
		this.setvNo("mp09 1111");
		System.out.println("Vehicle Number : " + this.getvNo());
	}

	public static void main(String[] args) {
		ClassM obj = new ClassM();
		obj.car();
	}
}
