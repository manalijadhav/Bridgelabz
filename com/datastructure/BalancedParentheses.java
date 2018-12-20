package com.datastructure;

import java.util.*;

public class BalancedParentheses {

	public static <T> void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Expression: ");
		
		String string = scanner.nextLine();
		
		Stack <Character> stack = new Stack<Character>();
		
		for(int i=0; i< string.length(); i++) {
			
			if (string.charAt(i) == '[' ||string.charAt(i) == '(' ||string.charAt(i) == '{') {

				stack.push(string.charAt(i));

			} else if ((string.charAt(i) == ']' || string.charAt(i) == '}' || string.charAt(i) == ')')

					&& (!stack.isEmpty())) {

				if (((char) stack.peek() == '(' && string.charAt(i) == ')')

						|| ((char) stack.peek() == '{' && string.charAt(i) == '}')

						|| ((char) stack.peek() == '[' && string.charAt(i) == ']')) {

					stack.pop();
			}
			
				else {

					System.out.println("Expression is Balanced \n True");

				}

			} else {

				if ((string.charAt(i) == ']' || string.charAt(i) == '}' || string.charAt(i) == ')')) {

					System.out.println( "Expression is not Balanced \\n False");

				}

			}

		}

		if (stack.isEmpty())

			System.out.println( "Expression is Balanced \\n True");

		else

			System.out.println( "Expression is not Balanced \\\\n False" );

	}
}
