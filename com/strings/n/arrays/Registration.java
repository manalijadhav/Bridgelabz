package com.strings.n.arrays;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utility.Utility;

public class Registration {

	 
	
		public static void main(String[] args) {
			String fname , lname , email , ph , cname , uid , pw;
			boolean flag1 , flag2 , flag3 , flag4 , flag5 , flag6 , flag7;
			Scanner scanner = new Scanner(System.in);
			Utility utility = new Utility();
			
			do {
				System.out.println("First Name: ");
			
				fname = scanner.nextLine();
			
				flag1 = Utility.ValidatenameStrings(fname);
				
				
				System.out.println("Last Name");
			
				lname = scanner.nextLine();
				
				flag2 = Utility.ValidatenameStrings(lname);
				
			
				System.out.println("EmailID");
			
				email = scanner.nextLine();
			
				flag3 = Utility.ValidateEmailStrings(email);
				
				
				
				System.out.println("Phone Number ");
			
				ph = scanner.nextLine();
				
				flag4 = Utility.ValidateContactStrings(ph);
				
				
				
				System.out.println("Company Name");
			
				cname = scanner.nextLine();
				
				flag5 = Utility.ValidateCompanyStrings(cname);
				
				
				
				System.out.println("UserId");
			
				uid = scanner.nextLine();
				
				flag6 = Utility.ValidateUserIDStrings(uid);
			
				
				
				System.out.println("PassWord: ");
				//System.out.print("min 8 Chars with at least one Uppercase has exactly one special character and has at least one numeric number");
			
				pw = scanner.nextLine();
				
				flag7 = Utility.ValidatePasswordStrings(pw);
				
				if(!flag1 || !flag2 || !flag3 || !flag4 || !flag5 || !flag6 || !flag7) {
		        
					System.out.println("Please enter valid information...");
				}
				

		}
				while(!flag1 || !flag2 || !flag3 || !flag4 || !flag5 || !flag6 || !flag7);
				   
			     if(flag1)
			     {
			        System.out.println("Enter your first name");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
			     if(flag2)
			     {
			        System.out.println("Enter your last name");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
			     if(flag3)
			     {
			        System.out.println("Enter your Email");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
			     if(flag4)
			     {
			        System.out.println("Enter your contact number");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
			     if(flag5)
			     {
			        System.out.println("Enter your company name");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
			     if(flag6)
			     {
			        System.out.println("Enter your username");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
			     if(flag7)
			     {
			        System.out.println("Enter your password");
			     }else
			     {
			        System.out.println("Invalid information");
			     }
		}
		
	
	}

		
		
		
	

