package dsaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	//1 In-place reverse of an array
//	
//	static void swap(int[] arr) {
//		int r=0,l=arr.length-1;
//		Arrays.sort(arr);
//		while(r<l) {
//			arr[r] = arr[r] + arr[l];
//			arr[l] = arr[r] - arr[l];
//			arr[r] = arr[r] - arr[l];
//			r++;l--;
//		}
//		System.out.println(Arrays.toString(arr));
//	
//		
//	}
	
	//2 Rotate the given array  by k steps, where k is non-negative
	//k can be greater then length of array
	
	static void rotate(int[] arr, int k) {
		int len = arr.length;
		
		k = k % len;	//k can be greater then length of array
		
		while(k>0) {
			k--;
			int temp=arr[len-1];
			for(int i=len-1; i>0; i--) {
				arr[i]=arr[i-1];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotate1(int [] arr, int k) {
		int len =arr.length;
		int[] rt = new int[len];
		
		k=k%len;
		int j=0;
		
		for(int i=len-k ; i<len; i++) {
			rt[j++] = arr[i];
		} 
		for(int i=0; i<len-k; i++) {
			rt[j++] = arr[i];
		}
		System.out.println(Arrays.toString(rt));
	}
	
	//3 Check if given numbers(q numbers) is present in the given array,
	//value of elements in array is < 10^5
	static int[] makeFrequencyArray(int[] arr) {
		int[] freq = new int[100005];
		
		for(int i=0; i< arr.length; i++) {
			freq[arr[i]]++;
		}
		
		return freq;
	}
	
	static void check(int[] arr) {
		int[] freq = makeFrequencyArray(arr);
		
		System.out.println("No. of queries : ");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		while(q>0) {
			System.out.println("Querry : ");
			int n = sc.nextInt();
			
			if(freq[n]>0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			q--;
		}
		
	}
	
	public static void main(String[] args) {
		 
		int [] arr = {1,2,3,4,5,6};
//		Array1.swap(arr);
//		System.out.println(Arrays.toString(arr)+"\n");
//		Array1.rotate1(arr,4);
//		Array1.check(arr);
		
		//bitwise opr
		
		int p=9, q=10;
		
		System.out.println(p | q);//11
		System.out.println(p & q);//8
		System.out.println(p ^ q);//3
		
		System.out.println(p << 1);//18
		System.out.println(p >> 2);//36
		
		System.out.println(q >> 1);//5
	}

}
