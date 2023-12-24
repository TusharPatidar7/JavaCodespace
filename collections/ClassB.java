package collections;

public class ClassB extends ClassA{
	@Override
	void meth1() {
		System.out.println("Overridding method");
	}
	public static void main(String[] args) {
		ClassA aobj1 = new ClassA();
		ClassA aobj2 = new ClassB();
		ClassB bobj1 = new ClassB();
//		ClassB bobj2 = new ClassA(); // CE point4
		
		aobj1.meth1();//ClassA method
		aobj2.meth1();//ClassB method
		bobj1.meth1();//ClassB method
	}
}
