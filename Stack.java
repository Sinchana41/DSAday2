package org.stack;

public class Stack<T>{

	Node<T> top;
	int size=0;

	public void push(T data) {
		Node<T> node=new Node<T>(data);
		node.next=top;
		top=node;
		size++;
	}

	public T peek() {
		if(top==null) {
			System.out.println("Stack is under flow....");
			return null;
		}
		return top.data;
	}

	public T pop() {
		if(top==null) {
			System.out.println("Stack is under flow....");
			return null;
		}
		T data=top.data;
		top=top.next;
		size--;
		return data;
	}

	public void display() {
		display(top);
		System.out.println();
	}

	public void display(Node<T> start) {
		if(start==null)
			return;

		System.out.print(start.data+" ");
		display(start.next);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}

	public T firstElement() {
		if (top == null) {
			System.out.println("Stack is under flow....");
			return null;
		}

		Node<T> current = top;
		while (current.next != null) {
			current = current.next;
		}
		return current.data; // bottom-most element
	}
}
