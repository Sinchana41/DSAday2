package org.stack;

import java.util.Scanner;

public class StringBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = scanner.next();
		boolean result = isBalance(string);
		if(result) {
			System.out.println("String is balanced");
		}
		else {
			System.out.println("String is not balanced");
		}
		scanner.close();
	}

	static boolean isBalance(String string) {
		if(string.length() % 2 == 1)
			return false;

		Stack<Character> stack=new Stack<Character>();
		for (Character character : string.toCharArray()){

			if(character=='{'||character=='('|| character=='['){
				stack.push(character);
			}
			else{
				if(stack.isEmpty())
					return  false;

				Character popedCharacter=stack.pop();

				if(character == '}' && popedCharacter != '{' || character == ')' && popedCharacter != '(' || character == ']' && popedCharacter != '[')
					return false;
			}
		}
		return stack.isEmpty();
	}
}
