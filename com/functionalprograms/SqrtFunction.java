/*********************************************************************************************************

 *  Purpose: Compute the square root of a nonnegative number c in the input using Newton's method.
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

public class SqrtFunction{


	public static void main(String[] args){
	
		Utility Utility = new Utility();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of c");
		
		double c = scanner.nextInt();
		
		
		double t1 = Utility.SqrtFunction(c);
		
		System.out.println(t1);
		
	}
}
