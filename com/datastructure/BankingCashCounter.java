package com.datastructure;

import java.util.*;

public class BankingCashCounter {

	public static void main(String[] args) {
		
		Queue <Integer> queue = new Queue<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Total amount in bank: ");
		
		int total = scanner.nextInt();
		
		System.out.println("Total people in queue: ");
		
		int people = scanner.nextInt();
		
		for(int i = 1; i <= people; i++) {
			
			queue.enqueue(i);
			
		}
		queue.show();
		
		System.out.println("\n******BANK CASH COUNTER*****");
		
		for(int i = 1; i <= people; i++) {
			
			System.out.println("\nCustomer No " +i);
			
			System.out.println("Enter 1 for deposit and 0 for withdraw ");
		
			int choice = scanner.nextInt();
			
			if(choice == 1) {
			
				System.out.print("Amount to deposit: ");
				
				int cash = scanner.nextInt();
				
				 total = total + cash;
				
				System.out.println("Your acc balance is: " +total);
				
				queue.dequeue();
				
				queue.show();
				
			
			}
			
			else if(choice == 0) {
				
				System.out.print("Amount to withdraw: ");
				
				int cash1 = scanner.nextInt();
				
				if(cash1 > total) {
					
					System.out.println("Your acc balance is insufficient...");
					break;
				}
				else {
					
					 total = total - cash1;
					
					System.out.println("Acc balance "+total);
				}
					queue.dequeue();
					
					queue.show();
				
				
			}
		}
	
	}
}