package com.functions.n.libraries;

import java.util.*;

	public class Factorial {

	    public static void main(String args[]){
	        
	      int N = Integer.parseInt(args[0]);  
	    
	        System.out.println("You entered  value " +N);
	        
	        int facto = factorial(N);
	        
	        System.out.println("Result is " + facto);
	    }
	    
	    public static int factorial(int N){
	        
	        int fact = 1;
	        
	        for(int i = 1; i <= N ;i++){
	            
	            fact = fact * i;
	        }
	        return fact ;
	    }
	}


