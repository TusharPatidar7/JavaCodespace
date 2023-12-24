package coreJava;

public class IncDec {
	public static void main(String[] args) {
		int a = 34;
		int b = 21;
		int c = a++ + ++b;
		int d = --a + --b + c--;
		int e = a + +b + +c + d--;
		int f = -a + b-- + -c - d++;
		int sum = a + b + c + d + e + f;
		System.out.println("a " + a + "+ b " + b + " + c " + c + " + d " + d + " + e  " + e + " + f " + f);
		System.out.println("sum : " + sum);
	}
}
