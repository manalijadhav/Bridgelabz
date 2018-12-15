package com.strings.n.arrays;

import java.util.*;

public class MinorDeterminant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [][] matrix = new int[3][3];
		
		System.out.println("Enter elements of Matrix");
		
		for(int i=0; i< 3 ; i++) {
			
			for(int j = 0; j< 3 ; j++) {
				
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Given Matrix: ");
		
		for(int i=0; i< 3; i++) {
			
			for(int j = 0; j< 3; j++) {
				
				System.out.print(matrix[i][j]+ " "); 
			}
			
			System.out.println();
		}
		int [][] minor = new int[3][3];
		
		minor[0][0] = ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]));
		
		minor[0][1] = ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]));
		
		minor[0][2] = ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
		
		minor[1][0] = ((matrix[0][1] * matrix[2][2]) - (matrix[0][2] * matrix[2][1]));
		
		minor[1][1] = ((matrix[0][0] * matrix[2][2]) - (matrix[0][2] * matrix[2][0]));
		
		minor[1][2] = ((matrix[0][0] * matrix[2][1]) - (matrix[0][1] * matrix[2][0]));
		
		minor[2][0] = ((matrix[0][1] * matrix[1][2]) - (matrix[0][2] * matrix[1][1]));
		
		minor[2][1] = ((matrix[0][0] * matrix[1][2]) - (matrix[0][2] * matrix[1][0]));
		
		minor[2][2] = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
		
		System.out.println("Determinant of all Minor: ");
		
		for(int i = 0; i < 3; i++ ) {
			
			for(int j=0; j < 3; j++) {
				
				System.out.print(minor[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
