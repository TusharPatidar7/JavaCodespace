package prepinsta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class practise {
	void fileToByteArray() {
		File file=new File("C:/Users/Tushar Patidar/OneDrive/Desktop/Naresh it");
		
		byte b[]=new byte[(int)file.length()];
		
		try {
//		FileOutputStream fout=new FileOutputStream(file);
//		
//		fout.write(0);
//		fout.write(1);
//		fout.write(0);
//		System.out.println("fout");
		FileInputStream fin=new FileInputStream(file);
		System.out.println("fin");
		fin.read(b);
		for(byte i:b) {
			System.out.println(i);
		}
		fin.close();
//		fout.close();
		}
		catch(Exception e) {System.out.println("Exception");}
		
	}

	public static void main(String[] args) {
		new practise().fileToByteArray();
	}
}
