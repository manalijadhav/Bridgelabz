package com.strings.n.arrays;

import java.util.*;

public class TwoDarray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.Integer Array");
		
		System.out.println("2.Double Array");
		
		System.out.println("3.Boolean Array");
		
		System.out.println("Your choice");
		
		int choice = scanner.nextInt();
		
		
		
		switch(choice) {
		
		case 1:
			
			int arr [] [] = new int[2][2];
			
			System.out.println("Enter the elements in Integer array");
			
			for(int i=0 ; i <arr.length; i++) { 
							
					for(int j=0 ; j<arr.length ; j++) {
					
						arr[i][j] = scanner.nextInt();
					}
			}
				integerArray(arr,0,arr.length);
			
			break;
			
		case 2:
			
		 double arr1 [][] = new double [2][2];
		 
		 System.out.println("Enter the elements in Double array");
			
			for(int i=0 ; i <arr1.length; i++) { 
							
					for(int j=0 ; j<arr1.length ; j++) {
					
						arr1[i][j] = scanner.nextDouble();
					}
			}
				doubleArray(arr1,0,arr1.length);
			
			break;
			
		case 3:
			boolean arr2 [][] = new boolean [2][2];
			 
			 System.out.println("Enter the elements in Boolean array");
				
				for(int i=0 ; i <arr2.length; i++) { 
								
						for(int j=0 ; j<arr2.length ; j++) {
						
							arr2[i][j] = scanner.nextBoolean();
						}
				}
					booleanArray(arr2,0,arr2.length);
				
				break;
			
		}

	}
	
	public static void integerArray(int[][] arr , int start , int end) {
		
		for(int i=0; i< arr.length; i++) {
			
			for(int j =0; j<arr.length; j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	public static void doubleArray(double[][] arr1 , double start , double end) {
		
		for(int i=0; i< arr1.length; i++) {
			
			for(int j =0; j<arr1.length; j++) {
				
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	public static void booleanArray(boolean[][] arr2 , int start , int end) {
	
	for(int i=0; i< arr2.length; i++) {
		
		for(int j =0; j<arr2.length; j++) {
			
			System.out.print(arr2[i][j]+ " ");
		}
		System.out.println();
	}
	
}

}
