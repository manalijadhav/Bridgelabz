package com.functions.n.libraries;

import java.util.*;

public class StringMaxMin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
	    
	    int n = scanner.nextInt();

	    String [] array = new String[n];
	    
	    System.out.println("Enter the elements");
	    
	    for(int i=0; i<n; i++){
	        
	        array[i] = scanner.next();
	    }
	    System.out.println(array);

	}

}
