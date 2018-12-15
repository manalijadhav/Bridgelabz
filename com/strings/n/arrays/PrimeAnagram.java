package com.strings.n.arrays;

import java.util.Arrays;

public class PrimeAnagram {

			public static void primeAnagram(int n) {
	    
	        boolean flag = false;
	        
	        int  k = 0 , i;
	        
	        int intArray[] = new int[n];
	        
	        for(i = 0 ;i <= n;i++) {  
	        
	            for(int j = 2; j < i ;j++) {   
	            
	                if(i%j==0) {       
	                
	                    flag = false;
	                    break;
	                }
	                else
	                    flag = true;
	            }
	      
	            if(flag) {       
	                
	                    System.out.print(i+" ");                        
	                    intArray[k] = i;         
	                    k++;                       
	                
	            }
	        }
	        System.out.println("Anagrams are :");
	        checkAnagram(intArray, k);           

	}
			
			public static void checkAnagram(int intArray[], int k){
		    
		        String strArray,str1;
		       
		        String br[] = new String[k];
		      
		        boolean flag = false;
		       
		        for (int i = 0; i < k; i++) {
		        
		            // Convert integer to string
		            strArray = Integer.toString(intArray[i]);
		            //Convert String array to character array
		            char z[] = strArray.toCharArray();
		            Arrays.sort(z);
		            //Convert string into integer
		            str1 = String.valueOf(z);
		            br[i] = str1;
		        }
		        System.out.println();
		        for(int m=0;m<=k;m++)
		        {
		            for(int p=m+1;p<k;p++)
		            {
		                    if(br[m].equals(br[p]))
		                    {
		                        //Print anagram numbers
		                        System.out.println(intArray[m]+ " -- " +intArray[p]);
		                        flag=true;
		                    }
		            }
		        }
		        if(flag == false)
		        {
		            System.out.println("Exit");
		        }    

		    }
			
			public static void main(String args[]) {
				
				int n =100;
				
				primeAnagram(n);
				
			}

	}


