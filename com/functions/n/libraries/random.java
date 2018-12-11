package com.functions.n.libraries;

import java.util.Arrays;

import java.util.Random;

	public class random {
		
		public static void main(String[] args) {
		
			int arr[] = new int[10];
			
			Arrays.sort(arr);
		
			Random r = new Random();
			
				for(int i = 0; i < arr.length; ) {
			
					if( i == arr.length)
						break;
				}
				
				int random = r.nextInt(25);
				
			for(int i = 0 ; i < arr.length ; i++) {
			
					arr[i] = random;
			
				System.out.println(arr[i]);
				
			}
//finding duplicate generated random number
			for(int i = 0 ; i < arr.length ; i++) {

			if(random == arr[i] && i > 1) {
				
				int max = arr[i - 1];
				
				int min = arr[i - 2];
				
				int range = (int) (Math.random() * (( max - min ) + min));
				
				System.out.println("\nrange " +range);
		
				arr[i] = range;
				
			//	count++;
			}
			else if(random == arr[i] && i < 1) {
				
				int min = arr[i-1];
				
				int max = Integer.MAX_VALUE;
				
				int range = (int) (Math.random() * (( max - min ) + min));
				
				System.out.println("\nrange " +range);
		
				arr[i] = range;
				
			//	count++;
			}
			}
			}
			
//			for( int i = 0; i < arr.length; i++ ) {
//			
//				for( int j = i + 1; j < arr.length; j++ ) {
//				
//					if(arr[i] == arr[j] && i != j) {
//				
//						int x = arr[i];
//				
//						int y = arr[j];
					
							
				
			
			
		
//			System.out.println("final array");
//			
////			Arrays.sort(arr);
//			for(int i = 0; i < count ; i++) {
//
//				//	System.out.println();
//			
//				System.out.println(arr[i]);
//
//				//System.out.println("Repeated numbers"+ al);
//			}
		}

	