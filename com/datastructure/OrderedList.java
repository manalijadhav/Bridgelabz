package com.datastructure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import utility.Utility;

public class OrderedList <T>{
		
	static   LinkedList<Integer> list = new LinkedList<Integer>();
		
		public static void main(String[] args) throws IOException{
		
			Scanner scanner = new Scanner(System.in);
			
			String str=" ";
			
			String file = "/home/admin1/Downloads/project-master/src/com/datastructure/ds1";
			
			File fileName = new File(file);
			
			Scanner reader = new Scanner(new FileReader(fileName));
		    
		    while (reader.hasNext()){
		    	
		        str = reader.nextLine();		        
		    }
		    
		    String s = str;
	         
	        String[] arrOfStr = s.split(" ", str.length());
	        /*for(int i=0;i<arrOfStr.length;i++)
	        	System.out.print(arrOfStr[i]+" ");*/
	        
	       int[] array = new int[arrOfStr.length];

        for(int i  = 0 ; i < arrOfStr.length ; i++) {
           
        	array[i]= Integer.parseInt(arrOfStr[i]);
	        }
//	      // Utility.bubblesort(array, array.length);
//	       
	       for(int i=0; i<array.length; i++) {
	    	  
	    	   list.sort(array[i]);	    	   
	       }
	       list.show();
	       System.out.println("Enter number to search");
			
			int num = scanner.nextInt();			
			orderedList(num);
//			
			}
//		
//	
//		
		public static <T> void orderedList(int number) throws IOException {
				
			

	     
		if(list.search(number)){
	           
	       	int s1 = number;
	            
	       	System.out.println(" Number is already in list so remove it");
	          
	       	 int remove = list.index(s1);
	       	 
	       	 list.deleteAt(remove);
	          
	           list.show();
	      
	              }
	           else
	           {
	               System.out.println("Number is not in the list so add it");
	            
	               list.insertAtend(number);
	              
	               list.show();
	              
	               
	           }
	        
	}
}


