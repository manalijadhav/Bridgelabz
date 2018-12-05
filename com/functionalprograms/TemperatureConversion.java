/*********************************************************************************************************

 *  Purpose: Given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa.
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

public class TemperatureConversion{

		public static void main(String[] args) {
	
		int choice = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Temperature Conversion \n");
		
		System.out.println("1.Celsius to Fahrenheit:\n");
		
		System.out.println("2.Fahrenheit to Celsius:\n");
		
		System.out.println("Enter your choice");
		
		choice = scanner.nextInt();
		
		 switch(choice) {
		 
		 case 1:
			 
			 System.out.println("Enter temperature in Celsius");
			 
			 int temperature = scanner.nextInt();
			 
			 int result = (temperature * 9 / 5 ) + 32;
			 
			 System.out.println(result+ "°F");
			 
			 break;
			 
		 case 2:
			 
			 System.out.println("Enter temperature in Fahrenheit");
			 
			 int temperature1 = scanner.nextInt();
			 
			 int result1 = (temperature1 - 32) * 5 / 9;
			 
			 System.out.println(result1+ "°C");
			 
		 }
	}



	

}
