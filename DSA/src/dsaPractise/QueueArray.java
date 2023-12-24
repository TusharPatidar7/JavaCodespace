package dsaPractise;

public class QueueArray {

	int[] queue;
	int rear,front;
	int capacity,size;
	
	public QueueArray(int capacity) {
		this.queue = new int[capacity];
		front = size = 0;
		rear = capacity-1;
		this.capacity = capacity;
	}
	
	void enqueue(int data) {
		if(size == queue.length)
			System.out.println("Queue is full, can't add "+data);
		else {
		rear = (rear+1)%capacity;
		queue[rear] = data;
		System.out.println("Enqueued : "+data);
		size++;
		}
	}
	void dequeue() {
		if(size == 0) {
			System.out.println("Underflow");
		}
		front = (front+1)%capacity;
		int data = queue[front];
		size--;
		System.out.println("Dequeued : "+data);
	}
	void size() {
		System.out.println("Size : "+size);
	}
	void isEmpty() {
		if(size == 0) {
			System.out.println("Empty");
		}
	}
	void display() {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~");
		for(int i=front; i<=rear; i++) {
			System.out.print(queue[i]+",");
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~");

	}
			
	public static void main(String[] args) {
		QueueArray MyQueue = new QueueArray(5);
		MyQueue.isEmpty();
		MyQueue.enqueue(10);
		MyQueue.enqueue(20);
		MyQueue.enqueue(30);
		MyQueue.enqueue(40);
		MyQueue.enqueue(50);
		MyQueue.enqueue(60);
		MyQueue.display();
		MyQueue.dequeue();
		MyQueue.dequeue();
		MyQueue.display();
		MyQueue.size();
		
		
	}

}
