/*********************************************************************************************************

 *  Purpose: Prints the sum of two random integers between 1 and 6
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   20-11-2018
 *  
**********************************************************************************************************/

package com.functionalprograms;

import java.util.Random;

public class SumOf2Dice {

	public static void main(String[] args) {
	 
		int sum=0;
		
		Random r = new Random();
		
		int first = r.nextInt((6-1)+1)+1;
		
		int second = r.nextInt((6-1))+1;
		
		sum = first+second;
		
		System.out.println("First random is " + first);
		
		System.out.println("Second random is " + second);
		
		System.out.println("Sum = "+ sum);

	}

}
////max=100
//min=0
//range = (max - min +1)+min

//Random r = new Random(N);