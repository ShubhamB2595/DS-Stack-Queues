package com.stack;

public class StackMain {

	public static void main(String[] args) {
		
		//System.out.println("Welcome to Stack program");
		Stack mystack = new Stack();
		
		//Adding data to stack
		mystack.push(70);
		mystack.push(30);
		mystack.push(56);
		
		//printing all elements of stack
		mystack.display();

		//printing last element of stack
		int last = mystack.peek();
		System.out.println("Last element of stack: " + last);
		
		//deleting 1st element from stack
		mystack.pop();
		mystack.display();
	}

}
