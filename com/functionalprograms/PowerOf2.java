/*********************************************************************************************************

 *  Purpose: Accepts a range and Prints the table of the powers of 2 that are less than or equal to entered value.
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


public class PowerOf2{

     public static void main(String args[]){
     
         
         
         
         System.out.println("You entered value of N between 0 and 30");	
         
         int N = Integer.parseInt(args[0]);
      
         if( N >= 31 ) {
     	    
 	        System.out.println("invalid input");
 			}
 		
 	    else{
 	    
 	            for(int i=0; i<=N;i++){
 	        
 	            System.out.println(2 + " ^ " + i + " : " + ( i * 2 ));
 	            }
 	            
 	    	}
         
       
         
     }
}