package com.strings.n.arrays;

import java.util.*;

public class BirthDate {

	public static void main(String[] args) {
		
	//	Scanner scanner = new Scanner(System.in);
		
			int days   = 366 ;
		 
	        int trials = 50;
	        
	        int people = 0;                          

	       
	        for (int i = 0; i < trials; i++) {

	            //  hasBirthday[d] = true if someone born on day d; false otherwise
	            boolean[] hasBirthday = new boolean[days];

	            while (true) {
	              
	            	people++;                               // one person enters the room
	                int m = (int) ((Math.random()*12)+1);
	                System.out.println("Month"+m);
	            	int d = (int) (Math.random() * days);   // integer between 0 and days-1
	                System.out.println("Date"+d);
	            	if (hasBirthday[d]) 
	            		
	            		break;             
	                
	            	hasBirthday[d] = true;           
	            }
//	            System.out.println("count: ");
//	    		
//	            for (int j = 0; j < trials; j++) {
//	    		
//	    			if(hasBirthday[j] == true) {
//	    				
//	    				System.out.println(i + "");
//	    			}
//	    			
//	        }

	            System.out.println(people);
	}

	}
}
