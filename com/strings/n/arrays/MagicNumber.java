package com.strings.n.arrays;

import java.util.*;

public class MagicNumber {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		
		//int N = Integer.parseInt(args[0]);
		
		System.out.println(" Enter value of N (2^ N)= ");
		
		int N = scanner.nextInt();
		
		int num = (int) Math.pow(2, N);
		
		System.out.println("Think of a Number between 0 to " +(num-1));
		
		question(N);
		
	}
	public static void question(int N)
	{
		int n = (int) Math.pow(2, N);
		
		int tries = 1;
		
		String input = " " ;
		
		int min = 0;
		
		int max = n;
		
		int guess = ( min + max ) / 2;
		
		if(max >= min) {
			
			while(!input.equalsIgnoreCase("yes")) {
		
			System.out.println("\nIs your number "+ guess +"...??Enter Yes/No ");
			
			input = scanner.next();
			
			if(input.equalsIgnoreCase("no")) {
				
			System.out.println("Number higher than " +guess+ "(enter high)\n");
			
			System.out.println("Number lower than " +guess+ "(enter low)\n");
			
			input = scanner.next();
			
			if(input.equalsIgnoreCase("high"))
			{
				min=guess;
				
    		    guess=(max+min)/2;
    		    
    		    tries++;
			}
			else if(input.equalsIgnoreCase("low"))
			{
				max=guess;
				
    			guess=(max+min)/2;
    			
    			tries++;
			}
		}
			}
		}
		System.out.println("It took "+ tries + " tries to guess "+ guess);
	}
		
	
}
	

