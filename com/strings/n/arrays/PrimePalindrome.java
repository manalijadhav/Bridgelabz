package com.strings.n.arrays;
import utility.Utility;
public class PrimePalindrome {

	public static void main(String[] args) {
	
	int count = 1; //printing per line
	
	int numb = 2; //start counter from 2
	
	//int n = 100; 
	
	while(count <= 20) {
		
		if(isPalindrome(numb) && Utility.isPrime(numb)) {
			
			System.out.print(numb+ " ");
			
			if((count % 10) == 0) //10 numbers per line
			
				System.out.println();
				
			count++;
				
			}
				numb++;
			}
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
