/*********************************************************************************************************

 *  Purpose: Accepts a decimal number and convert it to its binary equivalent.
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   28-11-2018
 *  
**********************************************************************************************************/
package com.functionalprograms;

import java.util.Scanner;

import utility.Utility;

public class DecimaltoBinary{
	
public static void DecimaltoBinary(int n){
		
		//accepts array to store binary equivalent
        int [] binaryNum = new int [1000]; 
        
        int count = 0; 
        
        while (n > 0)  {
        
            //stores the remainder in array
            binaryNum [ count ] = n % 2; 
            
            //number divided by 2 and quotient is stored
            n = n / 2; 
                        
            count++; 
        	} 
    
    int result = 0 ;
    String str = null;
    String NumberAsString = null;
         
    //reverse the array to print the bianry from MSB to LSB
    
        for (int j = count - 1 ; j >= 0 ; j--) {
               
          

            result = binaryNum[j];
            
         System.out.print(result);
         
        
     // System.out.println(" ");
        
        // System.out.print("str: "+str);
        
        }
        str = Integer.toString(result);
        System.out.println("str"+str);
        NumberAsString = Utility.ToString(str, 8);

        System.out.print("\nBinary Equivalent :" + NumberAsString );
        
       }
        
        

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		//Utility Utility = new Utility();
		
		System.out.println("Enter a decimal number to get its binary conversion :");
		
		int n = scanner.nextInt();
		
		DecimaltoBinary(n);
		
		
		
		}
	
	
	
}