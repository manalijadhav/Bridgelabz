package com.functionalprograms;

import java.util.*;

public class RepeatedNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] Array = new int [100];
		
		System.out.println("Enter the length of array");
		
		int length = scanner.nextInt();
		
		System.out.println("Enter the elements");
		
		for( int i=0 ; i < length ; i++ ) {
			
			Array[i] = scanner.nextInt();
			}
		
		//for(int i =0; i< length ; i++) {
			
			//System.out.println(Array[i]);

		//}
		
		for(int i =0; i<length-1; i++) {
			
			for(int j =i+1; j<length; j++ ) {
				
				if(Array[i] == Array[j] && i != j) {
					
					System.out.println("Duplicate Number is " + Array[j]);
					
				}
			//	else if(Array[i] != Array[j]) {
			//		System.out.println("No duplicate number present");
					
			//	}
			
					
				
		}
		
			
		
		}
			

	}
}

