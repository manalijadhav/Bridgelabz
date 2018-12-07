/*********************************************************************************************************

 *  Purpose: Accepts Day , month , year from user and shows the day of week on entered date.
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   20-11-2018
 *  
**********************************************************************************************************/

package com.functionalprograms;

import utility.Utility;

public class DayOfWeek {
	
	//Formulas
	public static void DayOfWeek(int d , int m , int y) {
		   
		int y0 = y - (14 - m) / 12;
	    
	    int x = y0 + y0/4 - y0/100 + y0/400;
	    
	    int m0 = m + 12 * ((14 - m) / 12) - 2;
	    
	    int d0 = (d + x + (31*m0)/12) % 7;

	       
	       if(d0 == 0) {
	       	
	           System.out.println("It's Sunday");
	           }
	       
	       else if(d0 == 1) {
	       	
	           System.out.println("It's Monday");
	           
	       }
	       else if(d0 == 2) {
	       	
	           System.out.println("It's Tuesday");
	           
	       }
	       else if(d0 == 3) {
	       	
	           System.out.println("It's Wednesday");
	           
	       }else if(d0 == 4) {
	       	
	           System.out.println("It's Thursday");
	           
	       }else if(d0 == 5) {
	       	
	           System.out.println("It's Friday");
	           
	       }else {
	       	
	           System.out.println("It's Saturday");
	       }
		}

	public static void main(String[] args) {
		
		Utility Uility = new Utility();
		
		int d = Integer.parseInt(args[0]);
		
		int m = Integer.parseInt(args[1]);
		
		int y = Integer.parseInt(args[2]);
		
	//	String days[] = { "Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" };
	
		DayOfWeek(d, m, y);
}
}
