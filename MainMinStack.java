package org.stack;

public class MainMinStack {

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(4);

		System.out.println("Min: " + stack.getMin()); // 1
		stack.pop();
		stack.pop();
		System.out.println("Min: " + stack.getMin()); // 2
	}
}

