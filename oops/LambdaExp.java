package oops;

import java.io.FileReader;
import java.io.FileWriter;

public class LambdaExp 
{
	void meth() 
	{
		System.out.println("Implementing Lambda Expression");
//		InterfaceB x = ()-> System.out.println("Implementation for meth1()");
//		x.meth1();
		
//		InterfaceB x = () -> 
//		{
//			try 
//			{
//				FileWriter fw=new FileWriter("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file2.txt");
//				fw.write("Java is Awesome");
//				fw.close();
//			}
//			catch(Exception e)
//			{
//				System.out.println(e.getMessage()); 
//			}
//			
//		};
//		x.meth4();
		
		
		InterfaceB x = n-> //(n)-> //(int n) ->
		{
			InterfaceB objb=new d1()::display;//method refrences
			objb.meth6(99);
		};
		
		InterfaceC y = (int m,int n) -> 
		{
			return (m+n);
		};
		System.out.println("\nAddition : "+y.meth2(99, 1));	
		
//		InterfaceD z =(String s)-> {return s;};
//		System.out.println("meth3 : "+z.meth3("Java is awesome"));
		
		InterfaceD z =()-> {
			try
			{
				FileReader fr = new FileReader("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file2.txt");
			int a;
			while((a=fr.read())!=-1)
			{
				System.out.print((char)a);
			}
			fr.close();
			}
			catch(Exception o)
			{
				System.out.println(o.getMessage());
			}
		};
		z.meth5();
		
	}
	
	public static void main(String[] args) {
		new LambdaExp().meth();
	}
}
