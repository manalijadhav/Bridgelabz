/*********************************************************************************************************
 *  Purpose: Accepts values of Principal amount , Number of years , Rate of interest and Calculates loan.
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

public class CarLoan {


	public static void main(String[] args) {
	
		Utility Utility = new Utility();
		
		//Scanner sc = new Scanner(System.in);
		/*int P =sc.nextInt();
		int Y = sc.nextInt();
		int R = sc.nextInt();*/
		
		// Enter the values of Principal amount , Number of years and Rate of interest
		
		float Principal = Float.parseFloat(args[0]);
		
		float Year = Float.parseFloat(args[1]);
		
		float Rate = Float.parseFloat(args[2]);
		
		float result = Utility.CarLoan(Principal, Year, Rate);
		
		System.out.println("MonthlyPayment is " +result);
		
		
	}

}