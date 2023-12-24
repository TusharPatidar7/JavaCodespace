package stack;

import java.util.Arrays;

public class Stack {

	int arr[];
	int top;
	int size;
	
	Stack(int n){
		arr = new int[n];
		top = -1;
		size = n;
	}
	boolean push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return false;
		}
		if(isEmpty()) {
			top = 0;
		}
		else{
			top++;
		}
		arr[top] = data;
		return true;
		
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;					
		}
		else {
			int ans = arr[top];
			arr[top] = -1;
			top--;
			return ans;
		}
	}
	boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
	boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		System.out.println(stack.push(10));
		System.out.println(stack.push(20));
		System.out.println(stack.push(30));
		System.out.println(stack.push(40));
		System.out.println(stack.pop());
		System.out.println(stack.push(60));
		System.out.println(stack.isFull());
		System.out.println(Arrays.toString(stack.arr));
	}

}
