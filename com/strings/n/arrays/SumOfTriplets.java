package com.strings.n.arrays;

import java.util.*;

public class SumOfTriplets {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Length: ");
		
		int len = scanner.nextInt();
		
		int [] elements = new int [len];
		
		System.out.println("Enter Elements");
		
		for(int i=0; i<len ;i++) {
				
				elements[i] = scanner.nextInt();
			}
		int count = 0 ;
		for(int i=0; i<len-2; i++) {
			
			for(int j=0; j<len-1; j++) {
				
				for(int k=0; k<len; k++) {
					
					if((elements[i] + elements[j] + elements[k]) == 0 ) {
						
						count++;
						System.out.println(elements[i]+ " " +elements[j]+ " "+ elements[k]);
					}
					
				}
			}
		}
		if(count == 0)
			System.out.println("No Triplets Found");
		
	else
		
		System.out.println("Total Triplets" +count);
		}

	}


