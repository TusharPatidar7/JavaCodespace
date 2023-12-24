package queue;

import java.util.Arrays;

public class InputRestrictedQueue {

	int arr[];
	int front;
	int rear;
	int size;
	
	public InputRestrictedQueue(int n){
		arr = new int[n];
		size = n;
		front = rear = -1;
	}
	
	void pushRear(int data) {
		if((front == 0 && rear == size-1) || (rear == (front-1)%(size-1))) {
			System.out.println("Queue is full");
			return;
		}
		else if(front == -1) {
			front = rear = 0;
			arr[rear] = data;
		}
		else if(rear == size-1 && front != 0) {
			rear = 0 ;
			arr[rear] = data;
		}
		else {
			rear++;
			arr[rear] = data;
		}
	}
	int popFront() {
		if(front == -1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int ans = arr[front];
		arr[front] = -1;
		if(front == rear) {
			front = rear = -1;
		}
		else if(front == size-1) {
			front = 0;
		}
		else {
			front++;
		}
		return ans;
	}
	int popRear() {
		if(front == -1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int ans = arr[rear];
		arr[rear] = -1;
		if(front == rear) {
			front = rear = -1;
		}
		else if(rear == 0) {
			rear = size-1;
		}
		else {
			rear--;
		}
		return ans;
	}
	boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if((front == 0 && rear == size-1) || (front!=0 && rear == (front-1)%(size-1))) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		InputRestrictedQueue queue = new InputRestrictedQueue(5);
		
		
		queue.pushRear(20);
		
		
		
		queue.pushRear(30);
		queue.pushRear(40);
		queue.pushRear(50);
		queue.pushRear(70);
		System.out.println(queue.popFront());
		System.out.println(queue.popRear());
		System.out.println(Arrays.toString(queue.arr));
		System.out.println(queue.isFull());
		queue.pushRear(60);
	}

}
