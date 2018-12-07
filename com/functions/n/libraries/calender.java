
/*********************************************************************************************************

 *  Purpose: Accepts the month and year and prints the calender .
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   20-11-2018
 *  
**********************************************************************************************************/
package com.functions.n.libraries;

import utility.Utility;

public class calender {

	public static void main(String[] args) {
        
        int month = Integer.parseInt(args[0]);
        
        int year  = Integer.parseInt(args[1]);
        
        String[] months = {" ", "January", "February", "March",  "April", "May", "June",          
                "July", "August", "September", "October", "November", "December"};  
        
        //leave empty space at index position 0 so that jan = 1st position
        
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        calend(month , year , months , days);
        
	}
        public static void calend(int month, int year, String[] months, int[] days) {
            
            // check for leap year
        	
               if (month == 2 && Utility.LeapYear(year))
                   
            	   days[2] = 29;


               // print calendar header
               
               System.out.println("   " + months[month] + " " + year);
               
               System.out.println(" S  M Tu  W Th  F  S");

               // starting day
               int d = Utility.date(1, month, year);

               // print the calendar
               
               for (int i = 0; i < d; i++)
            	   
                   System.out.print("   ");
               
               for (int i = 1; i <= days[month]; i++) {
                   
            	   System.out.printf("%2d ", i);
                   
            	   if (((i + d) % 7 == 0)) 
                   
            		   System.out.println();
               }
}
		
}
