package queue;

import java.util.Arrays;

public class OutputRestrictedQueue {
	int arr[];
	int front;
	int rear;
	int size;
	
	public OutputRestrictedQueue(int n){
		arr = new int[n];
		size = n;
		front = rear = -1;
	}
	void pushFront(int data) {
		if((front == -1 && rear == size-1) || (rear == (front-1)%(size-1))) {
			System.out.println("Queue is full");
			return;
		}
		if(front == -1) {
			front = rear = 0;
			arr[rear] = data;
		}
		else if(front == 0 && rear!= size-1) {
			front = size-1;
			arr[front] = data;
		}
		else {
			front--;
			arr[front] = data;
		}
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
		
		OutputRestrictedQueue queue = new OutputRestrictedQueue(5);
		
		queue.pushFront(10);
		queue.pushFront(20);		
		queue.pushRear(30);
		queue.pushRear(40);
		
		System.out.println(Arrays.toString(queue.arr));
		System.out.println(queue.popFront());
		System.out.println(queue.popFront());
		System.out.println(Arrays.toString(queue.arr));
		System.out.println(queue.isFull());
		queue.pushRear(60);
		System.out.println(Arrays.toString(queue.arr));
	}

}
