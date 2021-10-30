package com.queue;

public class QueueMain {

	public static void main(String[] args) {

		Queue myqueue = new Queue();
		
		//adding and displaying data
		myqueue.enqueue(56);
		myqueue.enqueue(30);
		myqueue.enqueue(70);
		
		myqueue.display();
		
	}

}
