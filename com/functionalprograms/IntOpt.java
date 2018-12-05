/*********************************************************************************************************

 *  Purpose: Accepts Int values from user and perform given arithmetic operations.
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

import utility.Utility;

public class IntOpt {

	public static void main(String[] args) {
		
		Utility Utility = new Utility();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of A");
		
		int a = scanner.nextInt();
		
		System.out.println("Enter value of B");
		
		int b = scanner.nextInt();
		
		System.out.println("Enter value of C");
		
		int c = scanner.nextInt();
		
		System.out.println("A + B * C = " + a + (b * c));
		
		System.out.println("A * B + C = " + (a * b) + c);
		
		System.out.println("C + A / B = " + c + (a / b));
		
		System.out.println("A % B + C = " + (a % b) + c);

		
		
	}

}
