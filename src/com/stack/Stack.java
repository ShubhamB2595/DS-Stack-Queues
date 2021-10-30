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
	
	//method pop for deleting data from stack
	void pop() {
				
		if(top == null) {
			System.out.println("Stack is Empty");
		}
		else {
			top = top.next;
		}
	}
	
	//method pop for deleting data from stack
	int peek() {
							
		if(top == null) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else {
			Node temp = top;
			Node temp1 = temp.next;
			
			while(temp1.next != null) {
				temp = temp1;
				temp1 = temp1.next;
			}
			return temp1.data;
		}
	}
	
	//Constructor
	public Stack() {
		
	}
	
}
