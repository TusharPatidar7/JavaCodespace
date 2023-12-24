package prepinsta;

public class ConstructorCall {
	public ConstructorCall()
	{
		this(10);//2nd using this constructor call
		System.out.println("Default Constructor");
	}
	public ConstructorCall(int a)
	{
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		new ConstructorCall();//1st using new keyword we can call a constructor
	}
}
/*
A Constructor can be called in following ways ===>
1st using new keyword we can call a constructor
2nd using this constructor call
3rd using super keyword from child class
4th Class.newInstance() method will create object and automatically call constructor
5th Constructor.newInstance() method will create object and automatically call constructor

this constructor call must be the first statement inside a constructor

"this" keyword is used to remove the ambiguity that occurs between instance and local variable
It is used return the instance of the class(this holds address of the object)
It is used in a constructor call
*/