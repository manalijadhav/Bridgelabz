package com.datastructure;


import java.io.File;

import java.io.FileReader;

import java.io.IOException;
import java.util.*;



public class UnorderedList {
	static LinkedList<String> list = new LinkedList<String>();
	public static void main(String[] args) throws IOException{
		String str=" ";
		
		String file = "/home/admin1/Downloads/project-master/src/com/datastructure/ds";
		
		File fileName = new File(file);
		
		Scanner reader = new Scanner(new FileReader(fileName));
	    
	    while (reader.hasNext()){
	    	
	        str = reader.nextLine();
	        
	    }
	   
	    
	    String s = str;
	    
	    String[] arrOfStr = s.split(" ", str.length()); 
	    
	    
	    for(int i = 0 ; i < arrOfStr.length ; i++) {
	       
	    	list.insertAtend(arrOfStr[i]);
	    	
	    }
	    list.show();
	Scanner scanner = new Scanner(System.in);
	 
	System.out.println("Enter string to search");
	
	String word1 = scanner.next();
	
	unorderedList(word1);
	}

	public static void unorderedList(String word) throws IOException {
	
	
    
    if(list.search(word)){
       
    	String s1 = word;
         
    	System.out.println(" word is already in list so remove it");
       
    	 int remove = list.index(s1);
    	 
    	 list.deleteAt(remove);
       
        list.show();
   
           }
        else
        {
            System.out.println("word is not in the list so add it");
         
            list.insertAtend(word);
           
            list.show();
           
            
        }
    //Utility.writeAllToFile("/home/admin1/Downloads/project-master/src/com/datastructure/ds", word);
}
	 
	 

}
