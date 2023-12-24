package coreJava;

public class Strings {
	void meth1() {
		String s1 = "Java";

		StringBuffer sbf1 = new StringBuffer("Java");
		StringBuffer sbf2 = new StringBuffer("Java");

		StringBuilder sbd1 = new StringBuilder("Java");
		StringBuilder sbd2 = new StringBuilder("Java");

		System.out.println(s1 + " , " + sbf1 + " , " + sbd1 + "\n");

		System.out.println("--------concat(),append()---------\n");
		s1.concat(" is awesome");
		sbf1.append(" is awesome");
		sbd1.append(" is awesome");

		System.out.println(s1 + " , " + sbf1 + " , " + sbd1);

		System.out.println("\n---------equals()----------\n");

		System.out.println(s1.equals("Java"));
		System.out.println(sbf1.equals(sbf2));
		System.out.println(sbd1.equals(sbd2) + "\n");

		System.out.println("\n-------------- == ------------\n");
		System.out.println(s1 == "Java");
		System.out.println(sbf1 == sbf2);
		System.out.println(sbd1 == sbd2);

	}

	void meth2() {
		System.out.println("StringBuffer methods-------------\n");

		StringBuffer sf1 = new StringBuffer();

		System.out.println("capacity() : " + sf1.capacity());

		sf1 = new StringBuffer("Hello");

		System.out.println("\ncapacity() : " + sf1.capacity());
		System.out.println("length() : " + sf1.length());

		sf1.append(" buddy! Array kya yr!");

		System.out.println("\nAppend() : " + sf1);
		System.out.println("\ncapacity() : " + sf1.capacity());// (currentcapacity*2)-1

		System.out.println("\ncharAt() : " + sf1.charAt(2));

		sf1.setCharAt(5, '@');

		System.out.println("\nsetCharAt() : " + sf1);

		sf1.delete(12, (sf1.length() - 1));
		System.out.println("\ndelete() : " + sf1);

		sf1.deleteCharAt(sf1.length() - 1);
		System.out.println("\ndeleteCharAt() : " + sf1);

		System.out.println("\nreverse() : " + sf1.reverse());

		sf1.setLength(5);
		System.out.println("\nsetLength() : " + sf1);

		System.out.println("\nCapacity() : " + sf1.capacity());// 44
		sf1.ensureCapacity(45);
		System.out.println("\nensureCapacity() : " + sf1.capacity());// 90
	}

	void meth3() {
		StringBuilder sb1 = new StringBuilder("");

		System.out.println("capacity() : " + sb1.capacity());

		sb1 = new StringBuilder("CSK");

		System.out.println("\ncapacity() : " + sb1.capacity());
		System.out.println("length() : " + sb1.length());

		sb1.append(" is the 2023 champion!");

		System.out.println("\nAppend() : " + sb1);
		System.out.println("\ncapacity() : " + sb1.capacity());// (currentcapacity*2)-1

		System.out.println("\ncharAt() : " + sb1.charAt(2));

		sb1.setCharAt(3, ',');

		System.out.println("\nsetCharAt() : " + sb1);

		sb1.delete(4, 6);
		System.out.println("\ndelete() : " + sb1);

		sb1.deleteCharAt(4);
		System.out.println("\ndeleteCharAt() : " + sb1);

		System.out.println("\nreverse() : " + sb1.reverse());

		sb1.setLength(5);
		System.out.println("\nsetLength() : " + sb1);

		System.out.println("\nCapacity() : " + sb1.capacity());// 40
		sb1.ensureCapacity(45);
		System.out.println("\nensureCapacity() : " + sb1.capacity());// 82
	}

	public static void main(String[] args) {
		Strings obj = new Strings();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}
