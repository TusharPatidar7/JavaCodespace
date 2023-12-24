package coreJava;

public class Constructor {
	int a = 10;

	public String testM() {
		new Constructor(100, 200, "java");
		System.out.println(40);
		return new Constructor().testM3(new Constructor(50).testM2()) + new Constructor().testM4("hi");
	}

	Constructor() {
		System.out.println("Hi");
	}

	public int testM2() {
		System.out.println(50);
		return 25;
	}

	Constructor(int a) {
		System.out.println("Java is awesome");
	}

	public String testM3(int a) {
		System.out.println(18);
		return "is";
	}

	Constructor(int a, int b, String s) {
		System.out.println(a + b);
		System.out.println(s);
	}

	public String testM4(String s) {
		System.out.println(88);
		return "good";
	}

	public static void main(String[] args) {
		Constructor t1 = new Constructor();
		t1.a = 10;
		Constructor t2 = new Constructor(50);
		t2.a = 30;
		System.out.println("Java" + t1.testM() + " " + (t1.a + t2.a - 30));

	}
}
