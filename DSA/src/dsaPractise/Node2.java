package dsaPractise;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Node2 {
	int data;
	Node2 left;
	Node2  right;
	Scanner sc = new Scanner(System.in);
	Node2(){
		
	}
	Node2(int d){
		this.data = d;
		this.left = null;
		this.left = null;
	}
	
	Node2 buildTree(Node2 root) {
		
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		
		root = new Node2(data);
		
		if(data==-1) {
			return null;
		}
		
		System.out.println("Enter data for inserting in left of "+data);
		root.left = buildTree(root.left);
		System.out.println("Enter data for inserting in right of "+data);
		root.right = buildTree(root.right);
		
		return root;
		
	}
	void levelOrderTraversal(Node2 root) {
		PriorityQueue<Node2> q = new PriorityQueue<Node2>();
		
		q.add(root);
		
		
		while(!q.isEmpty()) {
			Node2 temp = (Node2) q.poll();
			System.out.println(temp.data);
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		
	}
	public static void main(String[] args) {
		
		Node2 root = null;
		
		Node2 n = new Node2();
		//creating a Tree
		root = n.buildTree(root);
		//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
		n.levelOrderTraversal(root);
		
	}
}