/*********************************************************************************************************

 *  Purpose: A dice is roll n times.Counts maximum number of times occurence of number between 1 and 6
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   29-11-2018
 *  
**********************************************************************************************************/

package com.functionalprograms;

import java.util.*;

import utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		
		Utility Utility = new Utility();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of times to roll the dice :");
		
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
		
			int random = (int) ((Math.random()*6)+1);
			
			{
				arr[i]=random;
			}
			
			System.out.println(arr[i]);
		}
				
		int num = Utility.checkRepeated(arr, n);
		System.out.println("Repeated numbers count"+num);
	}
	
	
		/* int count=0;
		 int max=0;
		 int index_max=0;
		 for (int i = 0; i < size; i++)  
	        { 
	            for (int j = 0; j < size; j++)  
	            { 
	                if (arr[i] == arr[j]) 
	                
	                	count++;
	            } 
	            if(count>=max) {
	            	max = count;
	            	index_max=i;
	            }
	        } 
		 return arr[index_max];
	*/

}

	



