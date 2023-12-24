package coreJava;

public class ForEach {
	// For-each loop
	void meth1() {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int x : arr) {
			System.out.println(x);
		}

	}

//	void display()
//	{
//		int a=10;
//		for(int k=(a++)+(++a)+(++a);k>10;k++) {
//			System.out.println(k);
//			break;
//		}
//	}
//	int meth2(int a)
//	{
//		return new ForEach().meth3(11,12)+10;
//	}
//	int meth3(int a, int b) {
//		return a+b;
//	}
//	
//	void view()
//	{
//		int a=10;
//		for(int k=(a+++new ForEach().meth2(5))+(++a+3)+(++a+3);k>10;k++)
//		{
//			System.out.println(k+6);
//			break;
//		}
//	}

	void array(int n) {
//		int fact=1;
//		for(int i=n; i>0; i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println("factorial ="+fact);

//		if(n>0)
//			for(int i=1; i<=10; i++) {
//				System.out.println(n+"*"+i+"="+(n*i));
//			}
//		else
//			System.out.println("Invalid input!!");
//    	}

//		for(int i=1; i<=20; i++)
//			System.out.println(++i);
	}

//	void sum()
//	{
//		int sum=0;
//		for(int i=1;i<=100;i++)
//		{
//			sum+=i;
//		}
//		System.out.println(sum);
//	}

	public static void main(String[] args) {
		ForEach a = new ForEach();
		a.meth1();
		// a.display();
		// a.view();
		// a.array(20);
		// a.sum();
//		System.out.println(5+10+"JAVA"+10+5);
	}
}
