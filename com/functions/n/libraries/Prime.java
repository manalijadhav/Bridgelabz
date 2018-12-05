package com.functions.n.libraries;

import java.util.*;

public class Prime {
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number");
        
        int N = scanner.nextInt();
        
         prinum(N);
        
    }
    
    public static void prinum(int N) {
       
    	for(int i = 0; i < N; i++) {
        
    		boolean status = true;
            
    		for(int j= 2; j < i; j++) {
                //Check the condition for prime number
            
    			while(i % j == 0) {
                
    				status = false;
                  
    				break;
                }
            }
            
    		if(status) {
            
    			System.out.println(" " + i);
            }
        }
    }


}
