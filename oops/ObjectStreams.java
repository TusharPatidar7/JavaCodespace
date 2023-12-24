package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreams
{
	void meth1() throws Exception
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\Objectdata.ser")); 
		ClassE eobj = new ClassE("Tushar",101,"Java");
		System.out.println(eobj.getEmpName()+ "  "+eobj.getEmpid()+" "+eobj.getDeptName());
		oos.writeObject(eobj);
		System.out.println("Data Enetered");
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Tushar Patidar\\\\OneDrive\\\\Desktop\\\\Naresh it\\\\Objectdata.ser"));
		ClassE eobj2=(ClassE)ois.readObject();
		System.out.println(eobj2.getEmpName()+ "  "+eobj2.getEmpid()+" "+eobj2.getDeptName());
		ois.close();
	}
	public static void main(String[] args) throws Exception
	{
		ObjectStreams obj = new ObjectStreams();
		obj.meth1();
	}
}
