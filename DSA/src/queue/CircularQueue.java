package queue;

import java.util.Arrays;

public class CircularQueue {

	int arr[];
	int front;
	int rear;
	int size;

	public CircularQueue(int n) {
		arr = new int[n];
		front = -1;
		rear = -1;
		size = n;				
	}
	void enqueue(int data) {
		if((front == 0 && rear == size-1) || (rear == (front-1)%(size-1))) {
			System.out.println("Queue is full");
			return ;
		}
		else if(front == -1) {//first element to push
			front = rear = 0;
			arr[rear] = data;
		}
		else if(rear == size-1 && front != 0) {
			rear = 0;
			arr[rear] = data;
		}
		else {
			rear++;
			arr[rear] = data;
		}
	}
	int dequeue() {
		if(front == -1) {
			System.out.println("Queue is empty");
			return -1;
		}
		int ans = arr[front];
		arr[front] = -1;
		if(front == rear) { // if single element is present 
			front = rear = -1;
		}
		else if(front == size-1){ // to maintain cyclic nature
			front = 0;
		}
		else {
			front++;
		}
		return ans;
	}
	boolean isEmpty() {
		if(front == rear)
			return true;
		return false;
	}
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		
		cq.enqueue(5);
		cq.enqueue(4);
		cq.enqueue(3);
		cq.enqueue(2);
		cq.enqueue(1);
	
		System.out.println(Arrays.toString(cq.arr));
		System.out.println( cq.dequeue());
		System.out.println( cq.dequeue());
		cq.enqueue(6);
		System.out.println(Arrays.toString(cq.arr));
		System.out.println( cq.dequeue());
		System.out.println( cq.dequeue());
		System.out.println( cq.dequeue());
		System.out.println( cq.dequeue());
		System.out.println(Arrays.toString(cq.arr));
		
	}
	

}
