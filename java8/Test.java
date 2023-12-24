package java8;

interface Interf
{
	public void m1();
}
class Demo implements Interf
{
	public void m1() {
		System.out.println("Hello...");
	}
}

public class Test {

	public static void main(String[] args) {
//		Demo obj = new Demo();
//		obj.m1();
		
		// Using Lambda Exp
		//Writing Lambda Exp
		Interf i = ()->System.out.println("Hello...");
		//Using Functional Interface we are invoking lambda exp.
		i.m1();
	}

}
