package org.stack;

import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] array = {4,5,2,21};
		int[] result = nextGreater(array);
		System.out.println(Arrays.toString(result));//[5, 21, 21, -1]
	}

	static int[] nextGreater(int[] array) {

		int[] result = new int[array.length];
		Stack<Integer> stack = new Stack<Integer>();

		for(int i = array.length-1;i >= 0;i--) {
			while(stack.isEmpty() == false && stack.peek()<=array[i]) {
				stack.pop();
			}
			result[i]=stack.isEmpty() ? -1 : stack.peek();
			stack.push(array[i]);
		}
		return result;
	}
}
