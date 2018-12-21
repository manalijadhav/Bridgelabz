package com.datastructure;

import java.util.*;

import utility.Utility;

public class CalenderQueue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Month: ");
		
		int month = scanner.nextInt();
		
		System.out.println("Year: ");
		
		int year = scanner.nextInt();
		
		 String[] months = {" ", "January", "February", "March",  "April", "May", "June",          
	                "July", "August", "September", "October", "November", "December"};  
	        
	        //leave empty space at index position 0 so that jan = 1st position
	        
	        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        
	        calenderQueue(month , year , months , days);
	        
		
	}
	
	public static void calenderQueue(int month, int year, String[] months, int[] days) {
	
		Dequeue<String> deque = new Dequeue();
		
		 if (month == 2 && Utility.LeapYear(year))
             
      	   days[2] = 29;
											
		System.out.println("   " + months[month] + " " + year);
    
		System.out.println(" S  M Tu  W Th  F  S");

    	int d = Utility.date(1, month, year);

		for (int i = 0; i < d; i++)
 	   
			deque.addTORear("\t");
        	//System.out.print("   ");
		
		for (int i = 1; i <= days[month]; i++) {
        
			if(i<=7)
			{
				deque.addTORear("\t"+i);
			}
			else if(i>7)
			{
				deque.addTORear("\t"+i);
			}
			
			if(( i + d )%7==0)
				deque.addTORear("\n");
				//System.out.println();
	 		}
				deque.show();

	}
}
