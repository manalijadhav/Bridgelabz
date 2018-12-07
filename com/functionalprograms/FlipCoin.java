/*********************************************************************************************************

 *  Purpose: Simulate a coin flip and print out "Heads" or"Tails" accordingly, print the percentage of Head vs Tail.
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   21-11-2018
 *  
**********************************************************************************************************/

package com.functionalprograms;

import java.util.*;

import java.util.Random;



	public class FlipCoin{
		
		public static void FlipCoin(int flips) {
			
			int heads = 0;
			
			int tails = 0;
			
			double a[] = new double[flips];
			
			if(flips < 0){
		
				System.out.println("Ensure it is positive integer");
				}
			
			else{
				
				//strores random values generated
				
		  		for(int i = 0 ; i < flips ; i++) {
		  		
		  			//The method returns a value greater than or equal to 0.0 and less than 1.0.
		  			a[i] = Math.random();
		       
		  			}
				/*for(int i=0; i<flips;i++){
		   
		       System.out.println(a[i]);
		       
		   			}*/
		  		
		  		//if value is less than 0.5 then tails 
				for(int i = 0; i < flips ; i++){
		   
					if(a[i] < 0.5) {
		   
						System.out.println("tails");
						
						tails++;
								}
					//else heads
					else{
		   
						System.out.println("heads");
						
						heads++;
						}
					}
				}
			
			System.out.println("Count of tails is " + tails);
			
			System.out.println("Count of heads is " + heads);
			
			float pertails = (float)( tails * 100 ) / flips;
			
			float perheads = (float)( heads * 100 ) / flips;
			
			System.out.println("Percentage of tails"+ pertails);
			
			System.out.println("Percentage of tails"+ perheads);
		}

		public static void main(String ars[]) {
    
			
			
			Scanner scanner = new Scanner(System.in);
         
			System.out.println("enter the number of flips");
			int flips  = scanner.nextInt();
			
			FlipCoin(flips);
		}

}