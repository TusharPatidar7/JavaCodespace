package oops;

public class OuterClass 
{
	int x=100;
	static int y=200;
	{
		System.out.println("Outer Class Instance Block");
	}
	static
	{
		System.out.println("Outer class static block");
	}
	OuterClass()
	{
		System.out.println("Outer Class Constructor");
	}
	static class Inner
	{
		static
		{
			System.out.println("Inner class static block");
		}
		{
			System.out.println("Inner class Instance block");
		}
		void show()
		{
			System.out.println("x : "+new InnerClass().x);
			System.out.println("y : "+y);
		}
		Inner()
		{
			System.out.println("Inner Class Constructor");
		}
		public static void main(String[] args) {
			System.out.println("Inner class main()");
			new Inner().show();
		}
	}
	public static void main(String[] args) {
		new OuterClass.Inner().show();
	}
}
