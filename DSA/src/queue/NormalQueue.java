package queue;

import java.util.Arrays;

public class NormalQueue {

	int arr[];
	int front;
	int rear;
	int size;

	NormalQueue(int n) {
		arr = new int[n];
		front = rear = 0;
		size = n;
	}

	void enqueue(int data) {
		if ( rear == size ) {
			System.out.println("Queue is full");
			return;
		}
		else {
			arr[rear] = data;
			rear++;
		}
		System.out.println(data+" enqueued!");
	}

	int dequeue() {
		if (front == rear) {
			return -1;
		} else {
			int ans = arr[front];
			arr[front] = -1;
			front++;
			if (front == rear) {
				front = rear = 0;
			}
			return ans;
		}
	}

	int front() {
		if (!isEmpty()) {
			return arr[front];
		}
		return -1;
	}

	boolean isEmpty() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		NormalQueue q = new NormalQueue(5);
		q.isEmpty();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(40);
		System.out.println(q.dequeue()+" dequeued!");
		q.enqueue(30);
		q.enqueue(50);
		q.enqueue(60);
		
		System.out.println(Arrays.toString(q.arr));
	}
}
