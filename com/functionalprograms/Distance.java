/*********************************************************************************************************

 *  Purpose: Accepts value of X-axis and Y-axis and calculates the distance .
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

public class Distance {

	public static void main(String[] args) {
	
		Utility Utility = new Utility();
		
		System.out.println("You entered value of X-axis");
		
		int x=Integer.parseInt(args[0]);
		
		System.out.println("You entered value of Y-axis");
		
		int y =Integer.parseInt(args[1]);
		
		double dist = Utility.Distance(x, y);
		
		System.out.println(" Calculated Euclidean distance is "+dist);
	}

}
