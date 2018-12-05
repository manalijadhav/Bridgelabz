package com.functionalprograms;

import utility.Utility;

import java.util.*;

public class Print3Names1 {
	
	public static void main(String[] args) {
		
		  Utility Utility = new Utility();
		
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Enter 1st name");
		  
		  String firstName = scanner.next();
		  
		  System.out.println("Enter 2nd name"); 
		  
		  String secondName = scanner.next();
		  
		  System.out.println("Enter 3rd name");
		  
		  String thirdName = scanner.next();
		  
		  String reverseName[] = Utility.nameReverse(firstName, secondName, thirdName);
		  
		  System.out.println("hiii "+reverseName[0]+", "+reverseName[1]+", "+reverseName[2]);
		  }
		  
	 

	}


