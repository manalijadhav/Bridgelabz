package com.strings.n.arrays;

import java.util.Scanner;

public class InsertionSort{ 
	
	public static void strinsertionsort(String str[], int leng) {

		//Starts from index position 1
		for ( int i = 1 ; i < leng ; i++ ){
			
			//set element at index 1 as key
			String key = str[i];
			
			int j = 0;
			
			for( j = i ; j > 0 ; j--){
		
				//compare 1st index with 0th(previous) index value 
				if(key.compareToIgnoreCase(str[j-1])<0){
				
					//if equal then change the position
					str [j] = str[j-1];
				}
					else
						
						break;
			}			
				str[j] = key;
		
		
	}
		System.out.println("Sorted array");
		
		for(int i = 0 ; i <leng ; i++)
			
		      System.out.println(str[i]);
}
	

	public static void main(String[] args) { 
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length of the array");
		
		int leng = scanner.nextInt();
		
		//array for storing strings
		String str[] = new String[leng];
		
		System.out.println("Enter the elements");
		
		for(int i = 0 ; i < leng ; i++)
		{
		str[i] = scanner.next();
		}
		
		strinsertionsort(str,leng);
		
		
	}
	}


