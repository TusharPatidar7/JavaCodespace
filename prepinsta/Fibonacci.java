package prepinsta;

public class Fibonacci 
{
	int fibonacci(int n)
	{
		if(n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		int n1=0,n2=1,c;
		System.out.println(n1+"\n"+n2);
		for(int i=2; i<10; i++) {
			c=n1+n2;
			System.out.println(c);
			n1=n2;
			n2=c;
		}
		System.out.println("====================");
		Fibonacci obj = new Fibonacci();
		for(int j=0;j<10;j++)
		{
			System.out.println(obj.fibonacci(j));
		}	
	}

}
