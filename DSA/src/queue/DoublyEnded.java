package queue;

import java.util.Arrays;

public class DoublyEnded {

	int arr[];
	int front;
	int rear;
	int size;
	
	DoublyEnded(int n){
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
		DoublyEnded dequeue = new DoublyEnded(5);
		
		dequeue.pushFront(10);
		dequeue.pushRear(20);
		
		System.out.println(Arrays.toString(dequeue.arr));
		
		dequeue.pushRear(30);
		dequeue.pushRear(40);
		dequeue.pushRear(50);
		System.out.println(Arrays.toString(dequeue.arr));
		System.out.println(dequeue.isFull());
		dequeue.pushRear(60);
	}

}
