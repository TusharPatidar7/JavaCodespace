package oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedCharStream 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading data from a file");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file2.txt"));
		System.out.println("Connection build");
		int x;
		while((x=br.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println("\nData Reterived");
		br.close();
	}
	void FileOperation2() throws Exception
	{
		System.out.println("Writing data into a file");
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file2.txt"));
		System.out.println("Connection build");
		bw.write("Java is Awesome");
		System.out.println("\nData Entered");
		bw.close();
	}
	void FileOperation3() throws Exception
	{
		System.out.println("Copying the data from one file into another");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file2.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file3.txt"));
		System.out.println("Connection build");
		int x;
		while((x=br.read())!=-1)
		{
			bw.write(x);
		}
		System.out.println("\nData Copied");
		br.close();
		bw.close();
	}
	public static void main(String[] args) throws Exception 
	{
		BufferedCharStream obj = new BufferedCharStream();
		obj.FileOperation1();
		obj.FileOperation2();
		obj.FileOperation3();
	}

}
