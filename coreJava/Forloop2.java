package coreJava;

public class Forloop2 {
	void meth1(int n) {
//1		//1
		// 12
		// 123
		// 1234
		// 12345
//		for(int i=1; i<n; i++)
//		{
//			for(int k=1; k<=i ;k++)
//			{
//				System.out.print(k);
//			}
//			for(int j=0; j<i; j++)
//			{
//			
//			}
//			System.out.println();
//		}

//2		//1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14
//		int c=1;
//		for(int a=0; a<n; a++)
//		{
//			for(int b=0 ; b<=a; b++)
//			{
//				System.out.print(c++ +" ");
//			}
//			System.out.println();
//		}

//3		//*****
		// ****
		// ***
		// **
		// *

//		for(int a=0; a<n; a++)
//		{
//			for(int b=n; b>a; b--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//4		//*********
		// *******
		// *****
		// ***
		// *
//		for(int x=0; x<n; x++)
//		{
//			for(int y=1; y<=x; y++)
//			{
//				System.out.print(" ");
//			}
//			for(int y=(x+x+1); y <= (n*2)-1 ; y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//5		//12345
		// 1234
		// 123
		// 12
		// 1
//		for(int p=n; p>0 ; p--)
//		{
//			for(int q=1; q<=p; q++ )
//			{
//				System.out.print(q+" ");
//			}
//			System.out.println();
//		}

//6		//     1
		// 21
		// 321
		// 4321
		// 54321
//		for(int i=0; i<n; i++)
//		{
//			for(int j=n; j>i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i+1; k>0; k--)
//			{
//				System.out.print(k);
//			}
//			System.out.println();
//		}

//7		//* * * * *
		// * *
		// * *
		// * *
		// * *
		// * * * * *
//		for (int i = 1; i <= n; i++) 
//		{
//			if( i == 1 || i == n )
//			{
//			for (int j=0; j<n-1; j++) 
//			System.out.print("* ");
//			}
//			else
//			{
//				for(int k=1; k<n ; k++)
//				{
//					if(k == 1 || k == n-1)
//					{
//						System.out.print("* ");
//					}
//					else
//						System.out.print("  ");
//				}			
//			}
//			System.out.println();
//		}

//8     //   1
		// 2 2
		// 3 3 3
		// 4 4 4 4
//		int k=1;
//		for(int i=1; i<n; i++)
//		{
//			for(int j=i ; j< n-1 ; j++)
//				System.out.print(" ");
//			for(int j=1 ; j<= i; j++ )
//			{
//				System.out.print(k+" ");
//			}
//			System.out.println();
//			k++;
//		}

//9     //1
		// 0 1
		// 1 0 1
		// 0 1 0 1
//		int k=1, l=0;
//		for(int i=1; i<n ; i++)
//		{
//			if(i%2!=0)
//			{
//			for(int j=1; j<=i; j+=1) 
//			{
//				if(k==1)
//				System.out.print(k--+" ");
//				else
//				System.out.print(k+++" ");	
//			}
//			k=1;
//			}
//			else
//			{
//			for(int m=1; m<=i; m++)
//			{
//				if(l==1)
//					System.out.print(l--+" ");
//				else
//					System.out.print(l+++" ");	
//			}
//			l=0;
//			}
//			System.out.println();
//		}

//10	Palindrome triangle
		// 1
		// 2 1 2
		// 3 2 1 2 3
		// 4 3 2 1 2 3 4

//		for(int i=1; i<=n*2; i+=2)
//		{   
//			for(int j=i; j<=(n*2)-2; j+=1)
//			{
//				System.out.print(" ");
//			}
//			int a=(i/2)+1, b=1;
//			for(int k=1; k<=i; k++)
//			{
//				if(a>1)
//					System.out.print(a--+" ");
//				else if(b<n+1)
//					System.out.print(b++ + " ");
//			}
//			System.out.println();
//			b++;
//		}

//10	n=4 in above case
//		 public static void printPattern(int n)
//		    {
//		        int i, j;
//		 
//		        // outer loop to handle number of rows
//		        for (i = 1; i <= n; i++) {
//		            // inner loop to print the spaces
//		            for (j = 1; j <= 2 * (n - i); j++) {
//		                System.out.print(" ");
//		            }
//		 
//		            // inner loop to print the first part
//		            for (j = i; j >= 1; j--) {
//		                System.out.print(j + " ");
//		            }
//		 
//		            // inner loop to print the second part
//		            for (j = 2; j <= i; j++) {
//		                System.out.print(j + " ");
//		            }
//		 
//		            // printing new line for each row
//		            System.out.println();
//		        }
//			}

// 11   Rhombus pattern
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *

//		for(int i=0; i<n; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<n; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

// 12   Diamond Pattern
		// n=4
		// *
		// * *
		// * * *
		// * * * *
		// * * *
		// * *
		// *

//		for(int i=1; i<=(n*2)-1; i++) {
//			if(i<=n) {
//			for(int j=1; j<=n-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			}
//			else
//			{
//				for(int j=n+1; j<=i ; j++) {
//					System.out.print(" ");
//				}
//				for(int k=i; k<=(n*2)-1; k++) {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}

//13    Butterfly Star pattern
		// * *
		// ** **
		// *** ***
		// **** ****
		// ***** *****
		// ************
		// ***** *****
		// **** ****
		// *** ***
		// ** **
		// * *

//		int i, j;
// 
//        // outer loop to handle upper part
//        for (i = 1; i <= n; i++) {
//            // inner loop to print stars
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
// 
//            // inner loop to print spaces
//            int spaces = 2 * (n - i);
//            for (j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
// 
//            // inner loop to print stars
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
// 
//            System.out.println();
//        }
// 
//        // outer loop to handle lower part
//        for (i = n-1; i >= 1; i--) {
//            // inner loop to print stars
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
// 
//            // inner loop to print spaces
//            int spaces = 2 * (n - i);
//            for (j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
// 
//            // inner loop to print stars
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
// 
//            System.out.println();
//        }
	}

	public static void main(String[] args) {
		new Forloop2().meth1(5);
	}
}
