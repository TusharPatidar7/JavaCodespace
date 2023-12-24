package dsaPractise;

public class StackAsLinkedList {

	StackNode root;
	
	static class StackNode{
		int data;
		StackNode next;
		
		StackNode(int data){
			this.data=data;
		}		
	}
	
	void push(int data) {
		StackNode newNode = new StackNode(data); 
		
		if(root==null) {
			root = newNode;
		}else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(root.data+" pushed into stack");
	}
	
	StackNode pop() {
		if(root==null) {
			System.out.println("Stack is empty");
			return null;
		}
		StackNode poped = root;
		root = root.next;
		return poped;
	}
	
	StackNode peek() {
		if(root==null) {
			System.out.println("Stack is Empty");
			return null;
		}
		return root;
	}
	
	boolean isEmpty() {
		return (root==null)?true:false;
	}
	
	int size() {
		StackNode temp = root;
		int count=0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	void display() {
		StackNode temp = root;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}	
		System.out.println("\n");
	}
	public static void main(String[] args) {
		StackAsLinkedList stack = new StackAsLinkedList();
		System.out.println("Stack is empty? : "+stack.isEmpty());
		System.out.println("Element at the top of Stack "+stack.peek());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Stack is empty? : "+stack.isEmpty()+"\n");
		System.out.println("Element at the top of Stack "+stack.peek().data);
		stack.display();
		System.out.println(stack.pop().data+ " poped from stack\n"); 

		System.out.println("Element at the top of Stack "+stack.peek().data+"\n");
		
		System.out.println(stack.size()+" is the size of stack.\n");
		
	}

}
