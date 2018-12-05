/*********************************************************************************************************

 *  Purpose: Prints the nth Harmonic number.
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

public class Harmonics{


     public static void main(String ars[]) {
     
         Utility Utility = new Utility();
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter a number");
         
        int N = scanner.nextInt();
        
        float result = Utility.Harmonics(N);
        
       System.out.println("Sum is "+ result);
        
     }
}
