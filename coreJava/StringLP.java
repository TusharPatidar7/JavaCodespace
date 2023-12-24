package coreJava;

import java.util.Scanner;
import java.util.Arrays;

public class StringLP {
	void meth1() {
		String ar = "java";
		String arr2 = new String("Java");

		char arr3[] = { 'j', 'a', 'v', 'a' };
		String arr4 = new String(arr3, 0, 3);

		System.out.println("ar : " + ar);
		System.out.println("ar2 : " + arr2);
		System.out.println("Java".length());
		System.out.println("ar4 : " + arr4);

	}

	void meth2() {
		System.out.println("Implementing String Class Methods");

		String s1 = "Tushar Patidar";
		String s2 = "Tushar";
		String s3 = new String("Tushar");
		String s4 = new String("Tushar Patidar");

		System.out.println("equals() : " + s1.equals(s4));
		System.out.println("equals() : " + s2.equals(s3));
		System.out.println("equals() : " + s1.equals(s3));
		System.out.println("equals() : " + s2.equals(s4) + "\n");

		String s5 = "Tushar";

		System.out.println(s1 == s2);
		System.out.println(s2 == s5);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);

		System.out.println("\nconcat() : " + s1.concat("is a fullstack dev."));
		System.out.println("concat() : " + s1 + s2);
		System.out.println("After concat() s : " + s1);

		System.out.println("\ncharAt() : " + s1.charAt(3));
//		System.out.println("Enter A string :");
//		Scanner sc = new Scanner(System.in);
//		char s = sc.next().charAt(0);
//		System.out.println("charAt : "+s);

		System.out.println("\nsubstring() : " + s1.substring(7));
		System.out.println("substring() : " + s1.substring(3, s1.length() - 4));

		System.out.println("\ntrim() : " + " hey there!   ".trim());

		System.out.println("\ntoUpperCase() : " + s1.toUpperCase());
		System.out.println("toLowerCase() : " + s1.toLowerCase());

		System.out.println("\nindexOf() :" + s1.indexOf('P'));
		System.out.println("lastIndexOf() :" + s1.lastIndexOf('P'));

		System.out.println("\nreplace() : " + s1.replace('a', 's'));

		String s = "ABCD";
		byte b[] = s.getBytes();

		System.out.println("\ngetbyte() : " + Arrays.toString(b));

		for (byte x : b) {
			System.out.print((char) x + " ");
		}

	}

	public static void main(String[] args) {
		// new StringLP().meth1();
		new StringLP().meth2();
	}
}
