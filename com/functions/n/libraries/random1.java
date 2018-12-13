package com.functions.n.libraries;

import java.util.Arrays;

import java.util.Random;

public class random1 {
	
	static int totalNo = 10;
	
	static int arr[] = new int[10];
	
	static int max ;
	
	static int min ;
	
	static int range;
	
	public static void main(String[] args) {

		arr = uniqueArray(totalNo);
		
		printArray();
	}
	
	static void printArray(){
        
		for(int i = 0; i< arr.length; i++) {
        
            System.out.print(arr[i] + ", ");
        }
		
        System.out.print("\n");
    }
	
	public static int[] uniqueArray(int totalNo) {
		
		Random r = new Random();

		//validate array length  
        for(int i = 0; i < arr.length; )
        {
              if(i == arr.length)
              {
                   break;
              }
             
			int random = r.nextInt(10);
			System.out.println("Random generate==" +random);//1 random number generated
			arr[i++] = random;
		checkDuplicate(arr, random);
			
			
			
        }
        
		return arr;
	}
	
	//sorting  method
	public static int[] sort() {
		
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			
			for(int j = i + 1 ; j < arr.length ; j++) {
				
				if(arr[i] < arr[j]) {
					
					int temp = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = temp;
				}
				
			}
		}
		
		return arr;
		
	}
        //method for checking duplicates
        public static int checkDuplicate(int []finalArray, int n) {
        	
        	
        	for(int i = 1 ; i < finalArray.length ; i++){
            
        		//Arrays.sort(finalArray);
        		finalArray = sort();
        		
                if(finalArray[i] == n) {
                	
                	if(i == 1) {
                		
                		min = finalArray[0];
                		
                		System.out.println("Min==" +min);
                		
                		System.out.println("ith position==" +i);
                		
                		max = 10;
                		//System.out.println("Max==" +max);
                		
                		range = min + (int)(Math.random() *  (max-min));
                        
                        System.out.println("Range** : " +range);
                        
                        return range;
                	}
                
                	else if(i >= 2) {
                     
                		max = finalArray[i-1];
                     
                     System.out.println("max1 " +max);
                    
                     	min = finalArray[i ];
                     
                     	System.out.println("min1 " +min);
                     	
                     	return range;
                	}
                	
                     	if((max-min) == 1){
                     
                    	 max = finalArray[i-1];
                    	 
                    	 System.out.println("Max2 " +max);
                         
                         min = finalArray[i-2];
                         
                         System.out.println("Min2 " +min);
                         
                         range = min+ (int)(Math.random() *  (max-min));
                         
                         System.out.println("Range1 : " +range);
                         
                         return range;
                     }
                     
//                     else
//                     {
//
//                    	 range = min+ (int)(Math.random() *  (max-min));
//                    
//                    	 System.out.println("Range2 : " +range);
//                    	 return range;
//                     }
                
                     
                    if(finalArray[i]==range) {
                    	
                    	max = finalArray[i];
                    	System.out.println("max3 " +max);
                    	
                    	min = finalArray[0];
                    	System.out.println("min3 " +min);
                    	
                    	range = min+ (int)(Math.random() *  (max-min));
                    
                    	System.out.println("Range3 : " +range);
                }
                }    
            }
            

        	return range;
        }
}
        
	
//	Arrays.sort(arr);
//	for(int i =0; i < arr.length; i++) {
//	System.out.println(arr[i]);
//	}
//	
//	for( int i = 0; i < arr.length; i++ ) {
//	for( int j = i+1; j < arr.length; j++ ) {
//	if(arr[i] == arr[j] && i != j) {
//	int x = arr[i-1]; 
//	int y = arr[j];
//	int range = (int) (Math.random() * (( y - x ) + x));
//	System.out.println("\nrange"+range);
//	arr[i] = range;
//	}
//	}
//	}
//	//bsearch(arr , 0 , arr.length);
//	System.out.println("final array");
//	Arrays.sort(arr);
//	for(int i = 0; i<arr.length; i++) {
//
//	System.out.println(arr[i]);
//	
//	}
//	}
//	//public static void bsearch(int arr[],int start, int end ) {
//		
//		
//	}
	
	
	
	

