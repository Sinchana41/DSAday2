package org.stack;

public class PostFixEvaluation {

	public static void main(String[] args) {
		String expression = "2 3 1 * + 9 -";
		System.out.println("Result: " + evaluatePostfix(expression)); // -4
	}

	public static int evaluatePostfix(String expression) {
		Stack<Integer> stack = new Stack<>();
		String[] tokens = expression.split(" ");

		for (String token : tokens) {
			if (Character.isDigit(token.charAt(0))) {
				stack.push(Integer.parseInt(token));
			} else {
				int digit2 = stack.pop();
				int digit1 = stack.pop();
				switch (token) {
				case "+": stack.push(digit1 + digit2); 
				break;
				case "-": stack.push(digit1 - digit2);
				break;
				case "*": stack.push(digit1 * digit2); 
				break;
				case "/": stack.push(digit1 / digit2); 
				break;
				}
			}
		}
		return stack.pop();
	}
}
