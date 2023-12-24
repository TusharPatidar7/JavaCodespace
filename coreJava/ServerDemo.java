package coreJava;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String msg = dis.readUTF();
			System.out.println("message= " + msg);
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
