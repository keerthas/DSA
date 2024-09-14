package stack;

public class StackUsingLL {

	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head ;

	public static boolean isEmpty(){
		return head == null;
	}

	public static void push(int data){
		Node newNode = new Node (data);
		if (isEmpty ()){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public static int pop(){
		if (isEmpty ()){
			System.out.println ("Stack is empty");
			return -1;
		}
		int top = head.data;;
		head = head.next;
		return top;
	}

	public static int peek(){
		if (isEmpty ()){
			System.out.println ("Stack is empty");
			return -1;
		}
		return head.data;
	}

	public static void main (String[] args) {

		StackUsingLL stack = new StackUsingLL ();
		push (10);
		push (20);
		push (30);
		push (40);
		push (50);

		while (!isEmpty ()) {
			System.out.println (pop () + " Popped from stack");
		}
	}

}
