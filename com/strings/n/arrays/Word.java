package com.strings.n.arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Word {
	
	
	public static void main(String[] args)throws IOException {
	
		File f = new File("/home/admin1/Downloads/project-master/src/com/strings/n/arrays/word");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		ArrayList<String> l = new ArrayList<>();
		
		//new string
		String s = br.readLine();
		
        while (s!= null)
        	{
		        l.add(s);
		        s = br.readLine();
		        
		     }
        
        String[] words;
        
        Scanner sc=new Scanner(System.in); 

        words = l.toArray(new String[l.size()]);
        
        System.out.println(Arrays.toString(words));
        
        System.out.println("\nSorted Words:\n");
  
        for(int i=0; i<words.length; i++)
        {
            for(int j=1; j<words.length; j++)
            {
                if(words[j-1].compareTo(words[j])>0)
                {
                    String temp = words[j-1];
                    words[j-1] = words[j];
                    words [j] = temp;
                }
            }
        }
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
        System.out.println("Enter target string");
    	
        String tar = sc.nextLine();
		

		int index = bsearch(words,tar);				
	
		if(index == -1)
		{
			System.out.println("Element is not present in the given array.");
		}
		else
		{
			 System.out.println("element present at "+(index+1));
		}
	}
        
        
        
        
        
        
        //  Arrays.sort(words , 0 , words.length);
        

//        for(int i=0; i<words.length; i++) {
//        	
//        	for(int j = i+1; j<words.length; j++) {
//        		
//        		if(words[i].compareToIgnoreCase(words[j])>0){
//    				
//    				String temp = words[i];
//    				
//    				words[i]=words[j];
//    				
//    				words[j]=temp;
//    		}
//        	}
//        }
        
        
        
	
	public static int bsearch(String words[], String tar)
	{
		int max = (words.length-1);
		
		int min = 0;

		while (max >= min) {
			
			int mid = (min+max) / 2;
			
			int comp = tar.compareTo(words[mid]);
	  
			if (comp == 0)
            {
              return mid;
            }
            else if (comp < 0)
            {
              max = mid - 1;
            }
            else
            {
              min = mid + 1;
            }
          }
          return -1;
        }
	
	
}
