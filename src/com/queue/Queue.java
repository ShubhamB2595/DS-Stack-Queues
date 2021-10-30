package com.queue;
/*
 * class for queue operation
 */
public class Queue {
	
	Node front = null;
	Node rear = null;
	
	class Node {
		
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//method to adding data to queue
	void enqueue(int data) {
		
		Node newnode = new Node(data);
		
		if(front == null) {
			front = newnode;
			rear = newnode;
		}
		else {
			rear.next = newnode;
			rear =newnode;
		}
	}
	
	//method to display the data from queue
	void display() {
		
		Node temp = front;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	

	//Constructor
	public Queue() {
		
	}

	
}
