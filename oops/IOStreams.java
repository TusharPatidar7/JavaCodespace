package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreams 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading the data from a file");
		FileInputStream fis = new FileInputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file1.txt");
		System.out.println("Connection Build");
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println("\nData Retrieved");
		fis.close();
	}
	void FileOperation2() throws Exception
	{
		System.out.println("Writing the data into a file");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file2.txt");
		System.out.println("Connection Build");
		String msg = "Java is Awesome";
		fos.write(msg.getBytes());
		System.out.println("\nData Entered");
		fos.close();
	}
	void FileOperation3() throws Exception
	{
		System.out.println("Copying the data from a file to another file");
		FileInputStream fis = new FileInputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\dragon.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\dragon2.jpg");
		System.out.println("Connection Build");
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write(x);
		}
		System.out.println("Data Copied");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
		IOStreams obj =new IOStreams();
		obj.FileOperation1();
		obj.FileOperation2();
		obj.FileOperation3();
	}
}
