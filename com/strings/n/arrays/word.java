package com.strings.n.arrays;

import java.io.*;
import java.util.*;

public class word {

public static void main(String args[])throws IOException {
	   
	File f=new File("/home/admin1/Downloads/project-master/src/com/strings/n/arrays/word");
	
	BufferedReader br = new BufferedReader(new FileReader(f));
	
	ArrayList<String> l = new ArrayList<>();
	
	String s = br.readLine();
	
	while (s!= null) {
	
		l.add(s);
	    
		s = br.readLine();
	    
	}
	
	//System.out.println(s);
	
	String[] arr;
	
	String temp;


		arr = l.toArray(new String[l.size()]);

		System.out.println(Arrays.toString(arr));
		
		System.out.println("Sorting Words:");
       
		for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length; j++)
            {
    
            	if(arr[j-1].compareTo(arr[j])>0)
                {
                    temp=arr[j-1];
        
                    arr[j-1]=arr[j];
                    
                    arr[j]=temp;
                }
            }
        }
	
        for(int i=0;i<arr.length-1;i++)
        {
        	System.out.println(arr[i]);
        }
        System.out.println("Enter target");
        
        String target= br.readLine();
        
       int res = bSearchString(arr,target);
	       
       if (res == -1) { 
	   
    	   System.out.println("Element not present");
	       
       } 
	   
       else {
	   
    	   System.out.println("Element found at index:"+res);
	       
       }
}

public static int bSearchString(String[] arr,String tar)
{
  int start = 0; 
  int end = arr.length-1;
  while (end >= start)
  {
    int mid = (start + end) / 2;
    int comp = tar.compareTo(arr[mid]);
    if (comp == 0)
    {
      return mid;
    }
    else if (comp < 0)
    {
      end = mid - 1;
    }
    else
    {
      start = mid + 1;
    }
  }
  return -1;
}
	    
}