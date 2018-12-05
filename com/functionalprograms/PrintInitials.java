/*********************************************************************************************************

 *  Purpose: Takes initials as input and prints the initials using nine rows of asterisks.
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

import java.util.*;

public class PrintInitials {

	public static void main(String[] args) {
		
		Utility Utility = new Utility();
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("**Printing Initials**\n");
       
        System.out.print("Enter a string: ");
        
        String s =scanner.nextLine();
        
        //adding spaces
        s=" "+s; 
        
        //calculate length of that string
        int len=s.length();
        
        //array to store initials
        char temp[]=new char[len];
        
        //traverse string s
        for(int i=0;i < len;i++) {
        
        //char x checks letter at ith position
        char x = s.charAt(i);
        
        //if space is present store the next letter at position i+1
        if(x ==' ') {
        	
        temp[i]=s.charAt(i+1);
        
        System.out.print(temp[i]+" ");
        	}
        }
		
        for(int m=0;m<len;m++) {
        	
         if(temp[m] == 'k') {
        
		System.out.println();
		
		int i,j,k;
		
				int count = 5;
		
				for( i=0; i< 9;i++) {
					
					for( j=0; j< 2;j++) {
						
						System.out.print("*");
						
						}
					
					for( k=0; k<=5; k++) {
						
						if(k==count) {
							
							System.out.print("***");
							
							}
						
						else {
							
							System.out.print(" ");
							
								}
						}
					
					if(i<=3) {
						
						count--;
						
					}
					
					else if(i<9) {
						
						count++;
					}
					
					System.out.println(" ");
					
				}
        }
		
				else if(temp[m] == 'd') {
			
					int i,j,k;
					
					for(i=1;i<=9;i++)
				{
					for(j=1;j<=2;j++)
					{
						System.out.print("*");
					}
					if(i==1||i==9)
					{
						System.out.print("**********");
					}
					else if(i==8||i==2)
					{
						System.out.printf("           **");
					}
					else if(i==7||i==3)
					{
						System.out.printf("            **");
					}
					else if(i==6||i==4)
					{
						System.out.printf("             **");
					}
					else if(i==5||i==6)
					{
						System.out.printf("              **");
					}
					System.out.println("");
					}
				
				}
			else if(temp[m] == 'w') {
				
				int i,j,k;
			
			for(i=0;i< 9;i++)
			{	
				//Print the space first 
				for(j=0;j<=i;j++)
				{
					System.out.print(" ");
				}
				//Print the first line of W
				for(int l=0;l<2;l++)
				{
					System.out.print("*");
				}
				//print the Two spaces of W
				for(k=7;k>=i;k--)
				{
					System.out.print("  ");
				}
				//Print the second line of W
				for(int l=0;l<2;l++)
				{
					System.out.print("*");
				}
				
				
				//Second Portion Of Character W
				for(j=1;j<=i;j++)
				{
					System.out.print("  ");
				}
				for(int l=0;l<2;l++)
				{
					System.out.print("*");
				}
				for(k=7;k>=i;k--)
				{
					System.out.print("  ");
				}
				for(int l=0;l<2;l++)
				{
					System.out.print("*");
				}
				System.out.println("");
			
				}
				}
		
	}

	}
}
		
	
