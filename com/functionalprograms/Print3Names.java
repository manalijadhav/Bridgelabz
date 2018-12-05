/*********************************************************************************************************

 *  Purpose: Accepts 3 names and Prints them in a reverse order.
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

public class Print3Names {
	
	public static void main(String ars[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Three Names");
		
		String name1 = scanner.next();
		
		String name2 = scanner.next();
		
		String name3 = scanner.next();
		
		
		System.out.println("The entered names are: " + name1+ " " + name2 + " " + name3);
		
		System.out.println("Hii.. "+name3 + " " + name2 + " " +name1);
		
	}

}
