package coreJava;

public interface InterfaceB {
	void show(String s);

	default void MI() {
		System.out.println("Interface B method");
	}
}
