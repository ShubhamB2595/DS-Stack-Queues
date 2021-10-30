package com.queue;

public class QueueMain {

	public static void main(String[] args) {

		Queue myqueue = new Queue();
		
		//adding and displaying data
		myqueue.enqueue(56);
		myqueue.enqueue(30);
		myqueue.enqueue(70);
		
		System.out.println("Queue Data:");
		myqueue.display();
		
		//deleting first element and display remaining data
		myqueue.dequeue();
		
		System.out.println("Queue data after deleting");
		myqueue.display();
	}

}
