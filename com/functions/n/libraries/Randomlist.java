package com.functions.n.libraries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class Randomlist {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		//ArrayList <Integer> al = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			int random = r.nextInt(25);
			
			{
				arr[i]=random;
			}
			
			//System.out.println(arr[i]);
			
		}
		//sorting and printing sorted array
			
		Arrays.sort(arr);
		
		for(int i =0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		//finding duplicate generated random number
		
		for( int i = 0; i < arr.length; i++ ) {
			
			for( int j = i+1; j < arr.length; j++ ) {
				
				if(arr[i] == arr[j] && i != j) {
					
					int x = arr[i];
					
					int y = arr[j];
					
					int range = (int) (Math.random() * (( y - x ) + x));
				
					System.out.println("\nrange"+range);
					
					arr[i] = range;
					
				}			
			}

		}
		System.out.println("final array");
		for(int i = 0; i<arr.length; i++) {
		//	System.out.println();
			
		System.out.println(arr[i]);
		//System.out.println("Repeated numbers"+ al);
		}
	}
}
