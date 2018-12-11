package com.strings.n.arrays;

import utility.Utility;

public class PrimePalindrome2Darray {

	public static void main(String[] args) {
		
		
		String[][] palindNo = new String[1000][1000] ;
		
	    for(int i = 0; i < 100; i++)
	    {
	        for(int j = 0; j < 100; j++)
	        {
	            palindNo[i][j]= " ";
	        }
	    }
	    int column = 0;
	    
	    
	    for(int row=0; row<1; row++)
	    {
	        for(int i=0; i<=100; i++){
//	    for(int row = 0 ; row < 9; row++){
//	    
//	        for(int i = 0; i < 29; i++)
	        {
	            if(Utility.isPrime(i) && isPalindrome(i) )
	            {
	            	
	               palindNo[row][column++]= i + " ";
	               
	              System.out.print(palindNo[row][column++]= i + " ");
	            }
	        }
	        }
	    }
	    
//	    for(int i = 0; i < 5; i++) {
//	    	
//	    	for(int j = 0; j < 10; j++) {
//	    		
//	    		System.out.print(palindNo[i][j]+ " ");
//	    	}
//	    System.out.println("");
//	}

}
	public static int palind(int n) {
		
		int reverseNum = 0;
		
        while(n != 0) {
           
           int digit = n % 10;
           
           reverseNum = reverseNum * 10 + digit;
          
           n = n/ 10;
        }
        return reverseNum;
    }
    public static boolean isPalindrome(int n) {
       
        return n == palind(n);
    }
    
    
}
