/*********************************************************************************************************

 *  Purpose: Accepts a length of unsorted array and prints the second largest and smallest number
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   20-11-2018
 *  
**********************************************************************************************************/

package com.functionalprograms;

import java.util.*;

public class SecondSmallestnLargest {
		
		
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		
		int n = scanner.nextInt();
		
		int [] array = new int [n];
		
		int smallest = Integer.MAX_VALUE;
		
		int secondsmallest = Integer.MAX_VALUE;
		
		int largest = Integer.MIN_VALUE;
		
		int secondlargest = Integer.MIN_VALUE;
		if(n <= 3) {
			System.out.println("Arraylength should be atleast 4");
		}
		else {
			
		System.out.println("Enter the elements");
		
		for(int i = 0; i< n ; i++) {
			
			array[i] = scanner.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(array[i] < smallest) {
				secondsmallest = smallest;
				smallest = array[i];
			}
			if(array[i] > smallest && array[i] < secondsmallest) {
				secondsmallest = array[i];
			}
		}
		System.out.println("Second smallest element : "+ secondsmallest);
		
		for(int i = 0 ; i < n ; i++) {
			if(array[i] > largest) {
				secondlargest = largest;
				largest = array[i];
			}
			if(array[i] < largest && array[i] > secondlargest) {
				secondlargest = array[i];
			}
		}
		System.out.println("Second largest element : "+ secondlargest);
		
		}
		/*for(int i=0;i<n ; i++) {
			
			for(int j = i+1 ; j<n; j++) {
				
				if(array[i] > array[j]) {
					
					int temp  = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
				}
			}
			}
		System.out.println("Second smallest element : "+ array[1]);
	
		
		for(int i=0 ; i < n ; i++) {
			
			for(int j = i+1 ; j<n; j++) {
				
				if(array[i] > array[j]) {
					
					int temp  = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
				}
			}
			}
		System.out.println("Second largest element : "+ array[n-2]);*/

	}
		
	}


