package oops;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedByteStreams 
{
	void FileOperations1() throws Exception
	{
		System.out.println("Reading data from a file");
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\file1.txt"));
		System.out.println("Conneection Build");
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Data retrived");
		fis.close();
	}
	void FileOperations2() throws Exception
	{
		System.out.println("Writing data into a file");
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("C:\\\\\\\\Users\\\\\\\\Tushar Patidar\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Naresh it\\\\\\\\file1.txt"));
		System.out.println("Conneection Build");
		String msg = "Hey buddy!";
		fos.write(msg.getBytes());
		fos.close();
		System.out.println("Data Entered");
	}
	void FileOperations3() throws Exception
	{
		System.out.println("Copying the data from one file into another");
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file1.txt"));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\file4.txt"));
		System.out.println("Connection build");
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write(x);
		}
		System.out.println("Data Copied");
		fos.close();
		fis.close();
	}
	public static void main(String[] args) throws Exception {
		BufferedByteStreams obj = new BufferedByteStreams();
//		obj.FileOperations1();
//		obj.FileOperations2();
		obj.FileOperations3();
	}
}
