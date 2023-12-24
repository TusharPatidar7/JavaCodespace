package coreJava;

public class typecasting {
	void implicit() {
		byte a = 10;
		int b = a;
		float c = b;
		System.out.println("byte :" + a);
		System.out.println("int :" + b);
		System.out.println("float :" + c);
	}

	void explicit() {
		int a = 129;
		byte b = (byte) a;
		// Value = Minimum range + (result-MaximumRange-1)
		// -127 + 129-128-1=-127
		System.out.println("-------------");
		System.out.println("byte :" + b);
	}

	public static void main(String[] args) {
		typecasting obj = new typecasting();
		obj.implicit();
		obj.explicit();
	}
}
