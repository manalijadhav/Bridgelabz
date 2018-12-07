 package com.strings.n.arrays;
 
import java.io.*;

import java.util.Arrays;
import java.util.Scanner;

public class Word {
	
	public static void binaryWord(String[] arr , String x) {
         
		//Initialize the first, last, and mid value
    
		int start = 0;
        
		int end = arr.length - 1;
        
		int mid = (start + end) / 2;
		
         while(start <= end) {
        	 
             //Compare the mid to string x is less than 0 then print first value
        	 
             if(arr[mid].compareTo(x) < 0) {
             
            	 start = mid + 1 ;
             }
             else if(arr[mid].compareTo(x) == 0) {
             
            	 System.out.println("Word found in the word list : " + mid);
                 
            	 break;
             }
             else {
             
            	 end = mid - 1;
             }
             
             mid = (start + end) / 2;
         
         } 
         if(start > end) {
           
        	 System.out.println("Word is not found");
         }
    }

	

	public static BufferedReader br;

    public static void main(String[] args) throws IOException {
    
    	Scanner scanner = new Scanner(System.in);
    	
    	String file = "/home/admin1/Downloads/project-master/src/com/strings/n/arrays/word" ;
        
    	File fileName = new File(file);
        
    	br = new BufferedReader(new FileReader(fileName));
        
    	String line;
        
    	String arr[] = {};
       
        //System.out.println( n);
       
        while((line = br.readLine()) != null){
             //process the line
//            for(int i = 0; i <= n; i++)
//            {
//                arr = line.split("\\s+");
//               
//            }
           
            //System.out.println(line);
            arr = line.split("\\s+");
              
        }
        
//        System.out.println("Array elements: ");
//        
//        for(int i = 0; i < arr.length; i++)
//        {
//           
//            System.out.println(arr[i]);
//        }
          Arrays.sort(arr, 0 , arr.length);
   
          System.out.println("Sorted array: ");
          
          for(int i = 0; i < arr.length; i++)
         {
       
             System.out.println(arr[i]);
         }       
            
         System.out.println("Enter the word you want to search from word list");
         
         String x = scanner.next();
         
//         System.out.println("Intput searched string: "+x);
  
         binaryWord(arr, x);
       
       
    }
   
   

}

