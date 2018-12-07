package com.strings.n.arrays;

import java.util.*; 

public class FrequencyCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String");
		//accept a string
		String string = scanner.nextLine();
		
		//split the string and store in array
		String array[] = string.split(" ");
		
		System.out.println("Entered String is ");
		
		for(int i = 0; i < array.length; i++) {
		
			System.out.println(array[i]);
		}
		
		//sorting of array
		for(int i =0; i < array.length; i++) {
			
			for(int j=i+1 ; j< array.length; j++) {
				
				if(array[i].compareTo(array[j]) >0) {
					
					String temp = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
					
				}
			}
		}
		System.out.println("Sorted array : ");
		
		for(int i=0; i<array.length;i++) {
			
			System.out.println(array[i]);
		}
		
		//initialize counter by 1
		int count = 1;
		
		//compare elements in array
		for(int i=0; i<array.length; i++) {
			
			for(int j=i+1 ; j< array.length; j++) {
				
				if(array[i].equals(array[j])) { //if equal increment the counter
					
					count++;
					
					array[j] = "0"; //replace the repeated string by 0
				}
				
			}
			if(array[i] != "0") { //if whole string is not 0 print current count
			
				System.out.println(" \nOccurrence of " + array[i] + "--->" + count);
				count = 1; //again initialize the count by 1 for next occurrence of word
				
			}
		}
		
		

	}

}
