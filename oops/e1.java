package oops;

public class e1 {
	public static void main(String[] args) 
	{
		Enum1 e=Enum1.monday;
		System.out.println(e);
		
		switch(e)
		{
		case monday:
			System.out.println(e);
			break;
		case Tushar:
			System.out.println(e);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		e.meth1();
	}
}
