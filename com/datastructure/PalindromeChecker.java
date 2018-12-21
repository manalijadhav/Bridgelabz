package com.datastructure;

import java.util.*;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String string = scanner.nextLine();
		
		boolean flag = false;
		
		Dequeue <Character> dq = new Dequeue <Character>();
		
		for(int i =0; i < string.length(); i++) {
			
			char str = string.charAt(i);
			
			dq.addTORear(str);
			
			 flag = true;
		}
		while(dq.size() > 1) {
			
			if(dq.removeFront() != dq.removeRear()) {
				
				flag = false;
				break;
			}
		}
			if(flag == true) {
				
				System.out.println("String is palindrome");
			}
			else {
				
				System.out.println("Not a palindrome");
			}
		}
		
		
		

	

}
