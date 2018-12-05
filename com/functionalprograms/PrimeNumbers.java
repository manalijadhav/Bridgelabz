/*********************************************************************************************************

 *  Purpose: Takes a range of number as input and outputs the PrimeNumbers in that range.
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

public class PrimeNumbers{

	 
	public static void main(String args[]) {
				
	    Scanner scanner= new Scanner(System.in);
	    
	    System.out.print("Enter range between 0-1000\n  ");
	    
	    int range = scanner.nextInt(); 
	    
	    boolean arr[] = new boolean[range]; 
		
		for(int i=0;i<range;i++) 
			
			arr[i] = true; 

		for(int p = 2; p*p <range; p++) {

			if(arr[p] == true) {
		   
				for(int i = p*2; i < range; i += p) 
					arr[i] = false; 
				} 
			} 

		System.out.println("All prime numbers from " + range + " are");
		
		for(int i = 2; i<range; i++) {
		
			if(arr[i] == true)
			
			
				System.out.print(i + " "); 
			}
	    
	     
	    
	    
	} 
	} 