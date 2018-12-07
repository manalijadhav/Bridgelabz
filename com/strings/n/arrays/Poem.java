package com.strings.n.arrays;

import java.util.*;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Poem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String Template = "Old MacDonald had a farm,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"And on his farm he had some %ANIMAL%,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"With a %SOUND%, %SOUND% here,\n" + 
				"And a %SOUND%, %SOUND% there,\n" + 
				"Here a %SOUND%, there a %SOUND%,\n" + 
				"Everywhere a %SOUND%, %SOUND%,";

		System.out.println("Enter name of Animal");
		
		String animal = scanner.next();
		
		System.out.println("Enter sound ");
		
		String sound = scanner.next();
		
		 String regexAnimal = "%ANIMAL%" ;
	     
		 String regexSound = "%SOUND%";
	       
	        Template = strReplace(Template, regexAnimal, animal);
	        Template = strReplace(Template, regexSound, sound);
	        System.out.println(Template);

	    }


	public static String strReplace(String Template,String regexAnimal, String regexSound){
        
		//pattern object which defines the regular expression
		//pattern object allows to create a matcher object
		Pattern pattern = Pattern.compile(regexAnimal);
		
		//matcher object
        Matcher match = pattern.matcher(Template);
        
        //return for sound replacement
        return match.replaceAll(regexSound);
        
		
	}

}
