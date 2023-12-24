package dsaPractise;

import java.util.ArrayList;

public class Queue<T> {
	private int rear = -1;
	private int front = -1;
	
	ArrayList<T> list = new ArrayList<T>();

	T front() {
		if(front==-1) {
			return null;
		}
		return list.get(front);
	}
	T rear() {
		if(rear==-1) {
			return null;
		}
		return list.get(rear);
	}
	boolean empty() {
		if(rear==-1 && front==-1) {
			return true;
		}
		return false;
	}
	void enqueue(T data) {
		if(this.empty()) {
			rear = 0;
			front = 0;
		}
		list.add(data);
		front++;
	}
	void dequeue() {
		if(list.isEmpty()) {
			System.out.println("Queue Underflow!");
		}
		else if(rear == front) {
			rear = front = -1;
		}
		else {
			rear++;
		}
	}

	@Override
	public String toString() {
		if (this.empty())
            return "";
 
        String Ans = "";
 
        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(list.get(i)) + "->";
        }
 
//        Ans += String.valueOf(list.get(front));
 
        return Ans;
	}
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		System.out.println(q);
		q.dequeue();
		
		q.dequeue();
		System.out.println(q);
		q.enqueue("F");
		q.enqueue("G");
		q.enqueue("H");
		System.out.println(q);
	}

}
