package com.strings.n.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
 
public class BirthDate {
 
   static Random r = new Random();
   
   static int []  birthdayset = new int[50];
   
   static int counter = 0;  
   
   static int number;
  
   		public static void main(String[] args) {
  
    			 
    		for(int i = 0 ; i < birthdayset.length; i++) {
    			
    			number = r .nextInt(12)+1; 
    			
    			birthdayset[i] = number;
    			
    			System.out.println(birthdayset[i]);
    		}
    		
    		for(int i=0; i<birthdayset.length-1; i++) {
    			
    			for(int j=i+1 ; j<birthdayset.length; j++) {
    				
    				if((birthdayset[i] == birthdayset[j]) && (i != j)) {
    					
    					counter++;
    				}
    			}
    		
    		}
    
    System.out.println(counter + " people has birthdates same");
    

    	

    	
    
    
   		}
}
