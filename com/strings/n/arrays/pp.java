package com.strings.n.arrays;

import java.util.*;

public class pp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
        
        int n = scanner.nextInt();
         
        //check if boolean is true
//        if (isPrime(n)) {
//            
//        	System.out.println(n + " is a prime number");
//        } 
//        else {
//        
//        	System.out.println(n + " is not a prime number");
//        }
        int A[][]=new int[100][100];
        int B[] = new int [100*100];
        
        int i = 0, j;
        int k = 1; // For generating natural numbers
         
        /* First saving the 'm*n' prime numbers into a 1D Array */
        while(i < 100*100)
        {
            if(isPrime(k)==true)
            {
                    B[i] = k;
                    i++;
            }
            k++;
        }
         
        /* Saving the 'm*n' prime numbers from 1D array into the 2D Array */
        int x = 0;
        for(i=0; i<5; i++)
         {
            for(j=0; j<n; j++)
            {
                A[i][j] = B[x];
                x++;
            }
         }
              
        /* Printing the resultant 2D array */
        System.out.println("The Filled Array is :");
        for(i=0; i<5; i++)
         {
             for(j=0; j<n; j++)
                 {
                     System.out.print(A[i][j]+"\t");
                 }
             System.out.println();
         }
    }

	
	public static boolean isPrime(int n) {
	      
    	//1 is neither prime nor composite
    	if (n <= 1) {
        
    		return false;
        }
        
    	//set upper limit to sqrt of n 
    	//n has no other factors greater than its sqrt except itself
    	for (int i = 2; i < Math.sqrt(n); i++) {
        
    		//if remainder is 0 then factors are present
    		if (n % i == 0) {
            
    			return false;
            }
        }
        return true;
    }

}
