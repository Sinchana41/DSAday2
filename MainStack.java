package org.stack;

public class MainStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();//40 30 20 10 

		System.out.println(stack.peek());//40
		System.out.println(stack.peek());//40
		stack.display();//40 30 20 10 

		System.out.println(stack.pop());//40
		System.out.println(stack.pop());//30
		stack.display();//20 10 

		System.out.println(stack.isEmpty());//false
	}
}
