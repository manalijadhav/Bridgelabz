package com.strings.n.arrays;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean flag , flag1 , flag2 =false;
		
		System.out.println("First Name: ");
		
		String fname = scanner.nextLine();
		
		System.out.println("Last Name");
		
		String lname = scanner.nextLine();
		
		System.out.println("EmailID");
		
		String email = scanner.nextLine();
		
		System.out.println("Phone Number ");
		
		String ph = scanner.nextLine();
		
		System.out.println("Company Name");
		
		System.out.print("optional");
		
		String cname = scanner.nextLine();
		
		System.out.println("UserId");
		
		String uid = scanner.nextLine();
		
		System.out.println("PassWord: ");
		
		String pw = scanner.nextLine();
		
	}
	public static boolean validateFirstName( String fname ){
	   
		 boolean flag = false;
		 
		 Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
         
		 Matcher matcher = pattern.matcher(fname);
	     
		 if(matcher.find() && matcher.group().equals(fname)) {
             
	            flag = true;
	         
	         }else {
	         
	             System.out.println("Invalid input");
	         }
	      return flag;
	     
	     }
	
	public static boolean validateLastName(String lname) {
		
		return lname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*" );
		
	}
	

}
