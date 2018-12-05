package com.functionalprograms;

import java.io.IOException;

import java.util.Scanner;

import utility.Utility;

public class BinarySwap {

	public static void main(String[] args)throws IOException {
		
		Utility utility = new Utility();
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a decimal number to get its binary conversion :");
		
		int n = scanner.nextInt();
		
		String bin = Integer.toBinaryString(n);
		
		System.out.println("Binary equivalent is " + bin);
		
		String NumberAsString = utility.ToString(bin, 8);
		
		System.out.println(NumberAsString);
		
		String nibble1 = NumberAsString.substring(0, 4);
		
        System.out.println("Nibble 1:"+nibble1);
        
        String nibble2 = NumberAsString.substring(4,8);
        
        System.out.println("Nibble 2:"+nibble2);
        
        String swappNibble = nibble2.concat(nibble1);
        
        System.out.println("After swapping nibbles:"+swappNibble);
        
        
         int dec=Integer.parseInt(swappNibble,2);
        
        System.out.println(dec);
		
		
	}
	
	

}
