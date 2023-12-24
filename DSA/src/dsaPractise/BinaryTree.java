package dsaPractise;

import java.util.Scanner;


public class BinaryTree {
	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		Node root = null;
		
//		//creating a Tree
//		root = bt.buildTree(root);
//		//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
//		
//		bt.levelOrderTraversal(root);
		
		bt.insert(11);
		bt.insert(20);
		bt.insert(3);
		bt.insert(42);
		bt.insert(54);
		bt.insert(16);
		bt.insert(32);
		bt.insert(4);
		bt.insert(10);
		
		System.out.print("\nPreorder traversal: ");
        bt.preOrder(root);
	}
	private void preOrder(Node root){
		   if(root!=null){
		      System.out.print(root.data + " ");
		      preOrder(root.left);
		      preOrder(root.right);
		   }
		}
	
	void insert(int data) {
		Node tempNode = new Node();
		tempNode.data = data;
		
		if(root == null) {
			root = tempNode;
		}
		else {
			Node current = root;
			Node parent = null;
			
			while(true) {
				parent = current;
				if(data < parent.data) {
					current = current.left;
					
					if(current == null) {
						parent.left = tempNode;
						return;
					}
				}
				else {
					current = current.right;
					
					if(current == null) {
						parent.right = tempNode;
						return;
					}
				}
			}
		}		
	}
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(){}
		
		public void display(){
		    System.out.print("("+data+ ")");
		}
	}
	
	
	
//	public Node buildTree(Node root)  {
//		System.out.print("Enter the data: ");
//		int data = sc.nextInt();
//		
//		root = new Node(data);
//		
//		if(data==-1) {
//			return null;
//		}
//		
//		System.out.println("Enter data for inserting in left of "+data);
//		root.left = buildTree(root.left);
//		System.out.println("Enter data for inserting in right of "+data);
//		root.right = buildTree(root.right);
//		
//		return root;
//	}
	
//	void levelOrderTraversal(Node root) {
//		PriorityQueue<Node> q = new PriorityQueue<Node>();
//		
//		q.add(root);
//		
//		
//		while(!q.isEmpty()) {
//			Node temp = (Node) q.poll();
//			System.out.println(temp.data);
//			
//			if(temp.left != null) {
//				q.add(temp.left);
//			}
//			if(temp.right != null) {
//				q.add(temp.right);
//			}
//		}
//		
//	}

}
