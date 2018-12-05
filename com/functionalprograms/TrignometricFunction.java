/*********************************************************************************************************

 *  Purpose: Illustrate various Trigonometric Functions in the Math library.
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

public class TrignometricFunction {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter angle in degrees");
		
		double angle = scanner.nextDouble();
		
		double radians = Math.toRadians(angle);
		
		System.out.println("Measure of angle in radians is:" + radians+ "\n");
				
		double sin = Math.sin(radians);
		
		System.out.println("Sine of " +radians+ "is :" + sin+"\n");
		
		double cos = Math.cos(radians);
		
		System.out.println("Cosine of " +radians+ "is :" + cos+"\n");
		
		
	}

}
