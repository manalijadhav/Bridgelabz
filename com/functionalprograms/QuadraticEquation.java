/*********************************************************************************************************

 *  Purpose: Takes a, b and c as input values to find the roots of x.
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

public class QuadraticEquation {

	public static void QuadraticEquation(double a, double b, double c) {

		double delta = ((Math.pow(b, 2)) - (4 * a * c));
		
		System.out.println("value of delta is: " +delta);
		
			if(delta>0) {
		
				double r1 = (-b + Math.sqrt(delta)) / (2 * a);
				
				double r2 = (-b - Math.sqrt(delta)) / (2 * a);
		
				System.out.println("Roots of quadratic equations are: "+r1+" "+r2);
		
						}
			else if(delta==0) {
		
				System.out.println("Roots are real and equal");
				
				double r1 = (-b + Math.sqrt(delta))/(2*a);
				
				System.out.println("Root: "+r1);
				}

			else {
			
				System.out.println(" Roots are imaginary");
				}
	}

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a: ");
		
		double a = sc.nextDouble();
		
		System.out.println("enter value of b: ");
		
		double b = sc.nextDouble();
		
		System.out.println("enter value of c: ");
		
		double c = sc.nextDouble();
		
		QuadraticEquation(a, b, c);
		
}
}
