/*********************************************************************************************************

 *  Purpose: takes two int values m and d and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise. .
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

public class SpringSeason {

	public static void main(String[] args) {
		
	//	Scanner scanner = new Scanner(System.in);
		
		//int month = scanner.nextInt();
		
		//int day = scanner.nextInt();
		int month = Integer.parseInt(args[0]);
		
		int day = Integer.parseInt(args[1]);
	
		boolean flag = ( month == 3 && day >= 20 && day <= 31)
					
							|| ( month == 4 && day >= 1 && day <= 30)
							
							|| (month == 5 && day >= 1 && day <= 31)
							
							|| (month == 6 && day >= 1 && day <= 20);
		
			
			if(flag==true)
		        
				System.out.println("True");
					
			
			else
	    
				System.out.println("False");
				
				
		}
		
	}

