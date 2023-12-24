package dsaPractise;

import java.util.Stack;


public class MinOfStack {

	int min=-1;
	static int demoVal=9999;
	Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) {
		
		 MinOfStack s = new MinOfStack(); 
		  
	        int[] arr = { 3, 2, 6, 1, 8, 5, 5, 5, 5 }; 
	  
	        for (int i = 0; i < arr.length; i++) { 
	            s.push(arr[i]); 
	            s.getMin(); 
	        } 
	        System.out.println(); 
	        for (int i = 0; i < arr.length; i++) { 
	            s.pop(); 
	            s.getMin(); 
	        } 	
				
	}
	void push(int data) {
		if(stack.isEmpty() || data <= min) {
			min=data;
		}
		
		stack.push(data*demoVal +min);
		
		System.out.println("Pushed : "+data);
	}
	int pop() {
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		 int val = stack.pop(); 
		  
	     if (!stack.isEmpty()) 
	            min = stack.peek() % demoVal; 
	     else
	            min = -1; 
	     System.out.println("popped: " + val / demoVal); 
	     return val / demoVal; // decode actual value from 
	                              // encoded value 
	}
	void getMin() {
		System.out.println("Min : "+min);
	}

}
