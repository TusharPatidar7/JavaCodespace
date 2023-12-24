package java8;

interface If1{
	public void add(int a, int b);
}
class Demo2 implements If1{
	@Override
	public void add(int a, int b) {
		System.out.println("Sum = "+(a+b));
	}
}
public class Test2 {

	public static void main(String[] args) {
//		new Demo2().add(4, 5);
		
		If1 i = (a,b) -> System.out.println("Sum = "+(a+b));
		i.add(4, 5);
		i.add(1000, 552);
	}

}
