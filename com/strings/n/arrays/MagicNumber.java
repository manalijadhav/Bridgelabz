package com.strings.n.arrays;

import java.util.*;

public class MagicNumber {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		
		//int N = Integer.parseInt(args[0]);
		
		System.out.println("enter N ");
		
		int N = sc.nextInt();
		question(N);
		
	}
	public static void question(int N)
	{
		int n = (int) Math.pow(2, N);
		
		int tries = 0;
		
		int input = 0;
		
		int min = 0;
		
		int max = n;
		
		int guess = (min+max)/2;
		
		while(input!=2)
		{
			System.out.println("Is your number "+ guess +"...??\n");
			
			System.out.println("1.No, my number is lower\n");
			
			System.out.println("2.yes, this is my number\n");
			
			System.out.println("3.No, my number is higher\n");
			
			input = sc.nextInt();
			
			if(input == 1)
			{
				max = guess;
				
				guess = min + (guess-min)/2;
				
				tries++;
			}
			else if(input == 3)
			{
				min = guess;
				
				guess = guess + (max - guess)/2;
				
				tries++;
			}
		}
		
		System.out.println("It took "+ tries + " tries to guess "+ guess);
	}
		
	
}
