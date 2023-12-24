package prepinsta;

class B 
{
	void meth1()
	{
		System.out.println("ClassB method");
	}
	public static void main(String[] args) {
		System.out.println("B");
		B b1=new B();
		B b2=new B();
		B b3=b1;
		System.out.println(b1.equals(b3));
	}
}
