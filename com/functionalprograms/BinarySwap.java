/*********************************************************************************************************
 *  Purpose: Accepts a decimal number find its binary equivalent. Split that in 2 nibbles.
 *  		 Finds the decimal equivalent to new binary term obtained 
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   30-11-2018
 *  
**********************************************************************************************************/
package com.functionalprograms;

import java.io.IOException;

import java.util.Scanner;

import utility.Utility;

public class BinarySwap {

	public static void main(String[] args)throws IOException {
		
		Utility utility = new Utility();
	
		Scanner scanner = new Scanner(System.in);
		
		//accept a decimal from user
		System.out.println("Enter a decimal number to get its binary conversion :");
		
		int n = scanner.nextInt();
		
		//converting decimal to its binary equivalent
		String bin = Integer.toBinaryString(n);
		
		System.out.println("Binary equivalent is " + bin);
		
		//zero padding
		String NumberAsString = utility.ToString(bin, 8);
		
		System.out.println(NumberAsString);
		
		//nibbles which each of 4bits
		String nibble1 = NumberAsString.substring(0, 4);
		
        System.out.println("Nibble 1:"+nibble1);
        
        String nibble2 = NumberAsString.substring(4,8);
        
        System.out.println("Nibble 2:"+nibble2);
        
        //swapping of nibbles
        String swappNibble = nibble2.concat(nibble1);
        
        System.out.println("After swapping nibbles:"+swappNibble);
        
        //getting decimal equivalent of binary number created after swapping of nibbles
         int dec=Integer.parseInt(swappNibble,2);
        
        System.out.println(dec);
		
		
	}
	
	

}
