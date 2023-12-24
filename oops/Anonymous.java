package oops;

public class Anonymous 
{
	void meth1()
	{
		System.out.println("meth1()");
		String s="Java";
		class inner //Method Local Inner Class
		{
			void msg()
			{
				String data=s.concat(" is awesome");
				System.out.println(data);
			}
			{
				System.out.println("Inner class Instance block");
			}
			inner()
			{
				System.out.println("Inner Class Constructor");
			}
		}
		new inner().msg();
	}
	public static void main(String[] args) {
		Anonymous obj=new Anonymous()
		{
			@Override
			void meth1() 
			{
				System.out.println("Overidden meth1()");
				super.meth1();
			}
		};
	    obj.meth1();
	}
}
