/*********************************************************************************************************

 *  Purpose: Accepts a year and checks whether the number is a Leap year or not.
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

import utility.Utility;

public class LeapYear{

     public static void main(String ars[]) {
     
         Utility Utility = new Utility();
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("enter a year");
         
         int year  = scanner.nextInt();
         
 		
     	
     		boolean flag = Utility.LeapYear(year);
     		
     		if(flag){
     	        
				System.out.println("Year "+year+" is a Leap Year");
					}
			
			else{
        
				System.out.println("Year "+year+" is not a Leap Year");
				
				}
     			}
         
         
     }


         

	