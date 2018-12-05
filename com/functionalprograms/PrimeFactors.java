/*********************************************************************************************************

 *  Purpose: Computes the PrimeFactors of a entered number .
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   20-11-2018
 *  
**********************************************************************************************************/

package com.functionalprograms;

import java.util.*;

public class PrimeFactors{

	public static void main(String args[]) {
    
    	
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Enter a number "); 
        
        int n= scanner.nextInt();
        
        ArrayList <Integer> fact = new ArrayList<Integer>();
		 
	     for( int  i = 2 ; i <= n ; i++ ){
	     
	  	   while( n % i == 0 ){
	  	   
	  		   fact.add(i);
	  		   
	  		   n = n / i;
	  		   
	  	   		}
	  	   
	     	}
	     
	     	System.out.println("prime factors are");
	     	if(n>0){
	 		   
				   System.out.println(n);
			   }
	     	
	     for(Integer k:fact){
	     
	  	   System.out.println(""+k);
	  	   
	     	}
	     
	     
      
        
    } 
}