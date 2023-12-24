package oops;

import java.io.FileReader;
import java.io.FileWriter;

public class CharStreams 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading data from a file");
		FileReader fr = new FileReader("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\file1.txt");
		System.out.println("Connection build");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println("\nData Reterived");
		fr.close();
	}
	void FileOperation2() throws Exception
	{
		System.out.println("Writing data into a file");
		FileWriter fw = new FileWriter("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\file4.txt");
		System.out.println("Connection build");
		fw.write("Today UI class is concluded.");
		System.out.println("\nData Entered");
		fw.close();
	}
	void FileOperation3() throws Exception
	{
		System.out.println("Copying the data from one file into another");
		FileReader fr = new FileReader("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\file4.txt");
		FileWriter fw = new FileWriter("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\file5.txt");
		System.out.println("Connection build");
		int x;
		while((x=fr.read())!=-1)
		{
			fw.write(x);
		}
		System.out.println("\nData Copied");
		fr.close();
		fw.close();
	}
	public static void main(String[] args) throws Exception 
	{
		CharStreams obj = new CharStreams();
//		obj.FileOperation1();
		obj.FileOperation2();
		obj.FileOperation3();
	}
}
