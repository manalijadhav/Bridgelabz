package com.strings.n.arrays;

import utility.Utility;

public class Prime2Darray {

	public static void main(String args[]) {
		
	    int a = 0, b = 100;
	    
	    String[][] primeNo = new String[10][30] ;
	    		
	    for(int i = 0; i < 10; i++)
	    {
	        for(int j = 0; j < 30; j++)
	        {
	            primeNo[i][j]=" ";
	        }
	    }
	    
	    int column = 0;
	    
	    for(int row = 0 ; row < 10; row++){
	    
	        for(int i = a; i <= b; i++)
	        {
	            if(Utility.isPrime(i))
	            {
	                primeNo[row][column++]=i+"";
	            }
	        }
	        if(a<=900 && b<=1000)
	        {
	            a=a+100;
	            b=b+100;
	            column=0;
	        }
	    }
	    for(int i=0; i < 10; i++) {
	    	
	    	for(int j=0; j < 30; j++) {
	    		
	    		System.out.print(primeNo[i][j]+ " ");
	    	}
	    System.out.println("");
	}

	}
}
