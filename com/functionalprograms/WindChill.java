/*********************************************************************************************************

 *  Purpose:Takes two double command­line arguments t and v and prints the wind chill.
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

import utility.Utility;

public class WindChill{


	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Utility Utility = new Utility();
		
		int t = scanner.nextInt();
		
		int v = scanner.nextInt();
		
		//int	t = Integer.parseInt(args[0]);
		
		//int v = Integer.parseInt(args[1]);
		
		double x =Utility.WindChill(t, v);
		
		System.out.println("Effective Temperature is:" +x);
	}
}