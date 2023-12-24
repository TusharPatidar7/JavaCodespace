package oops;

public class Test2 implements InterfaceA, InterfB{
	
	@Override
	public void meth1() {
		
		InterfaceA.super.meth1();
		InterfB.super.meth1();
	}
	
	
	public static void main(String[] args) {
		new Test2().meth1();
	}

}
