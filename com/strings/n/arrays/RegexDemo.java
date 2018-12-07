package com.strings.n.arrays;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class RegexDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Full Name: ");
		
		String fname = scanner.nextLine();

		String [] name = fname.split(" ");
		
		String fname1 = name[0];
		
		System.out.println("Mobile Number: ");
		
		String mobnum = scanner.nextLine();
		
		String Template = "Hello <<name>>, We have your full name\n" + 
			
				"as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016. " ;
		
		String regexName = "<<name>>" ;
		
		String regexFname = "<<full name>>" ;
	     
		String regexNum = "­xxxxxxxxxx";
		
		String regexDate = "01/01/2016";
		
		SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");

		Date date = new Date();
		
		String fdate = Date.format(date);
		
		//System.out.println("Date: " +fdate);
		Template = details(Template, regexName, fname1);
        Template = details(Template, regexFname,fname );
        Template = details(Template, regexNum, mobnum);
        Template = details(Template, regexDate, fdate);
        
        System.out.println(Template);
		
	}
	public static String details(String Template , String regexName , String regexFname){
        
		//pattern object which defines the regular expression
		
		Pattern pattern = Pattern.compile(regexName);
		
		//matcher object
        Matcher match = pattern.matcher(Template);
        return match.replaceAll(regexFname);
	}
}
