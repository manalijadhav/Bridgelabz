package com.functions.n.libraries;

import java.util.Arrays;
import java.util.Random;

public class random1 {
	
	static int totalNo = 10;
	
	static int arr[] = new int[] {};
	
	static int max =0;
	
	static int min =0;
	
	static int range =0;
	
	public static void main(String[] args) {

		arr = uniqueArray(totalNo);
		
	}
	
	public static int[] uniqueArray(int totalNo) {
		
		Random r = new Random();

        for(int i = 0; i< arr.length; )
        {
              if(i == arr.length)
              {
                   break;
              }
             
			int random = r.nextInt(10); //1 random number generated
			
			
        }
	}
        //method for checking duplicates
        public static int checkDuplicate(int []finalArray, int n) {
        	
        	for(int i = 0; i < finalArray.length ; i++){
            
                if(finalArray[i] == n) {
                
                     max = arr[i-1];
                    
                     min = arr[i-2];
                     
                     range = (int) (Math.random() * (( max - min ) + min));
                    
                    if((max-min) < 1) {
               
                    	 max = arr[i-1];
                        
                         min = arr[0];
                    }
                }
            }
            return range;
}
        
	
	Arrays.sort(arr);
	for(int i =0; i < arr.length; i++) {
	System.out.println(arr[i]);
	}
	
	for( int i = 0; i < arr.length; i++ ) {
	for( int j = i+1; j < arr.length; j++ ) {
	if(arr[i] == arr[j] && i != j) {
	int x = arr[i-1]; 
	int y = arr[j];
	int range = (int) (Math.random() * (( y - x ) + x));
	System.out.println("\nrange"+range);
	arr[i] = range;
	}
	}
	}
	//bsearch(arr , 0 , arr.length);
	System.out.println("final array");
	Arrays.sort(arr);
	for(int i = 0; i<arr.length; i++) {

	System.out.println(arr[i]);
	
	}
	}
	//public static void bsearch(int arr[],int start, int end ) {
		
		
	}
	
	
	
	

