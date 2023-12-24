package java8;

interface Lambda{ //must be functional interface to use lambda expression
	
	void display();
}
interface L2{
	
	void add(int a, int b);
	default void sub(int a, int b) 
	{
		System.out.println("Subtraction = "+(a-b));
	}
}
abstract class AClass{
	
	abstract void div(int a, int b);
	
	void mul(int a, int b) {
		System.out.println("Mul = "+(a*b));
	}
}
public class LambdaExpDemo{
	
	void division(int x, int y) {
		System.out.println(x/y);
	}

	public static void main(String[] args) {
		
		Lambda obj = () -> System.out.println("display() called");
		
		obj.display();
		
		L2 l2 = (a,b) -> System.out.println("Addition = "+(a+b));;
		
		l2.add(5, 2);
		
		l2.sub(5, 3);
	}
	
	

}
