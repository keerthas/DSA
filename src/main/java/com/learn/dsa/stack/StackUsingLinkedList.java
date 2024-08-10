package com.learn.dsa.stack;

class Node {
	int data;
	Node next;

	public Node (int data) {
		this.data = data;
		this.next = null;
	}

}

public class StackUsingLinkedList {
	Node head = null;

	public void push(int data){
		Node node = new Node(data);
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void pop(){
		if(head==null){
			System.out.println("Stack is empty");
		} else {
			System.out.println("Popped element is: "+head.data);
			head = head.next;
		}
	}
}
