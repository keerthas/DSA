package com.learn.dsa.stack;

public class StackUsingArray {

	int size = 6;

	int[] stack = new int[size];
	int top = -1;

	public void push(int data) {
		if (top == size - 1) {
			System.out.println("Stack is full");
		} else {
			stack[++top] = data;
		}
	}

	public void pop(){
		if (top==-1){
			System.out.println ("Stack is empty");
		} else {
			System.out.println("Popped element is: "+stack[top--]);
		}
	}

}
