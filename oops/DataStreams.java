package oops;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreams 
{
	void FileOperations() throws Exception
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\data.txt"));
		System.out.println("Connection Created");
		
		dos.writeInt(100);
		dos.writeBoolean(true);
		dos.writeInt(200);
		dos.writeChar('A');
		
		System.out.println("Data Entered");
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Tushar Patidar\\OneDrive\\Desktop\\Naresh it\\data.txt"));
		System.out.println("Connection created");
		
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		
		dis.close();
		System.out.println("Data Reterived");
	}
	public static void main(String[] args) throws Exception 
	{
		DataStreams obj = new DataStreams();
		obj.FileOperations();
	}
}
