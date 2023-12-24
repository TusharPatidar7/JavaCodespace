package oops;

public class InnerClass 
{
	int x=10;
	static int y=20;
	static
	{
		System.out.println("Outer class static block");
	}
	{
		System.out.println("Outer class Instance block");
	}
	public InnerClass() {
		System.out.println("Outer class Constructor");
	}
	class Inner2//Nested Inner Class
	{
		static
		{
			System.out.println("Inner class Static block");
		}
		void show()
		{
			System.out.println("x : "+new InnerClass().x);
			System.out.println("y : "+y);
		}
		Inner2()
		{
			System.out.println("Inner2 Class Constructor");
		}
		public static void main(String[] args) {
			System.out.println("Inner class main");
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Outer Class main()");	
		new InnerClass().new Inner2();
	}
}
