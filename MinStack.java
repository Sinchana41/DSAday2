package org.stack;

public class MinStack {

	Stack<Integer> mainStack;
	Stack<Integer> minStack;

	public MinStack() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int data) {
		mainStack.push(data);
		if (minStack.isEmpty() || data <= minStack.peek()) {
			minStack.push(data);
		}
	}

	public void pop() {
		if (mainStack.isEmpty()) return;
		int removed = mainStack.pop();
		if (removed == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		if (mainStack.isEmpty()) return -1;
		return mainStack.peek();
	}

	public int getMin() {
		if (minStack.isEmpty()) return -1;
		return minStack.peek();
	}
}
