package org.stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		stack.push(1);
		stack.push(4);

		stack.display();//4 1 5 3 
		Stack<Integer> sortedStack = sortStack(stack);
		sortedStack.display();//1 3 4 5 
	}

	public static Stack<Integer> sortStack(Stack<Integer> input) {
		Stack<Integer> tempStack = new Stack<>();

		while (!input.isEmpty()) {
			int curr = input.pop();

			while (!tempStack.isEmpty() && tempStack.peek() < curr) {
				input.push(tempStack.pop());
			}

			tempStack.push(curr);
		}
		return tempStack; // sorted stack
	}
}
