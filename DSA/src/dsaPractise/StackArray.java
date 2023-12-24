package dsaPractise;

import java.util.Arrays;

public class StackArray {

	private final int max=1000;
	
	int []stack = new int[max];
	int top;
	
	StackArray(){
		top = -1;
	}
	
	 boolean push(int x) 
	    { 
	        if (top >= (max - 1)) { 
	            System.out.println("Stack Overflow"); 
	            return false; 
	        } 
	        else { 
	            stack[++top] = x; 
	            System.out.println(x + " pushed into stack"); 
	            return true; 
	        } 
	    } 
	int pop() {
		if(top==-1) {
			System.out.print("Stack Underflow");
			return -1;
		}
		int poped = stack[top];
		stack[top] = 0;
		top--;
		return poped;
	}
	int peek() {
		if(top==-1) {
			return -1;
		}
		return stack[top];
	}
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	int size() {
		return top+1;
	}
	void print(){ 
		System.out.println();
	    for(int i = top; i>-1; i--){ 
	      System.out.print(" "+ stack[i]); 
	    } 
	    System.out.println();
	  } 
	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println("size of stack : "+s.size());
		s.print();
		System.out.println("=============");
		System.out.println(s.pop()+" poped");
		System.out.println(s.pop()+" poped");
		System.out.println("Top element : "+s.peek());
	
		System.out.println("Stack is empty : "+s.isEmpty());
	}

}
