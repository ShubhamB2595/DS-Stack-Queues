package com.stack;


public class Stack {

	Node top = null;
	
	// class Node for operations of Stack
	class Node {
		int data;
		Node next;
		
		//Constructor for class Node
		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}
		
	}
	
	//method push for adding data to stack
	void push(int data) {
		
		Node pushNode = new Node(data);
		
		if(top == null) {
			top = pushNode;
		}
		else {
			pushNode.next = top;
			top = pushNode;
		}
	}
	
	//method for printing the stack data
	void display() {
		
		Node temp = top;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//Constructor
	public Stack() {
		
	}
	
}
