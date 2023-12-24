package coreJava;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket s;
		try {
//			s = new Socket("192.168.26.133", 9890);
			s = new Socket("192.168.26.133", 9890);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hey");
			dos.flush();
			dos.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
