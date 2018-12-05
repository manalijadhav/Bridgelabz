/*********************************************************************************************************

 *  Purpose: Prints 5 uniform random values between 0 and 1,their average value, and their minimum and maximum value.
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

public class Stats5 {
	
	public static void Range(double min, double max){
        
		 double values[]=new double[5];
	       
		 System.out.println("Five random values between 0 and 1 :");
	      
		 for(int i = 0; i <  5 ; i++ ) {
	      
			 double x = (Math.random()*((max-min)))+min;
			 
	           values[i] = x;
	           
	           System.out.println(values[i]);
	          }  
		 
	         double average , sum = 0;
	         
	         for(int i = 0 ; i < 5 ; i++) {
	        	 
	        	 sum = sum + values[i];
	         }
	         
	         //System.out.println("Sum is:"+ sum);
	         
	         average = sum / 5;
	         
	         System.out.println("Average is:"+ average +"\n");
	         
	         double minnum = 1 , maxnum = 0;
	         
	         for( int i = 0 ; i < 5 ; i++ ) {
	        	 
	             if( values[i] > maxnum ){
	            	 
	                 maxnum=values[i];
	             }
	         /*for(int i=0;i<values.length;i++)*/
	             
	             if(values[i] < minnum){
	            	 
	                 minnum = values[i];
	             }
	         }
	         System.out.println("Maximum number:"+maxnum);
	         
	         System.out.println("Minimum number:"+minnum);
	         
	    }

		 
		 public static void main(String args[]) {
			 
		     Range(0,1);
		     
		  }
}

