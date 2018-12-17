package com.strings.n.arrays;

import java.util.*;

public class TransposeOfMatrix {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int [][] matrix = new int[3][3];
		
		int[][] Tmatrix = new int[3][3];
		
		System.out.println("Enter elements of Matrix1");
		
		for(int i=0; i<3; i++) {
			
			for(int j = 0; j<3; j++) {
				
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
		
		System.out.println("Transpose : ");
		
		for(int i=0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				
				System.out.print(matrix[j][i]+ " ");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3 ; j++) {
				
				Tmatrix[j][i] = matrix[j][i] ;
			}
		}
		
		int sum = 0;
		
		int [][] product = new int [3][3];
		
		for(int i = 0 ; i < 3 ; i++) {
			
			for(int j = 0 ; j < 3 ; j++) {
				
				for(int k=0; k < 3 ; k++) {
					
					sum = sum + matrix[i][k] * Tmatrix [k][j];
				}
				
				product[i][j] = sum ;
			}
		}
		
		System.out.println("Product of the matrices:");
		 
         for (int i = 0; i < 3; i++){
         
            for (int j = 0; j < 3 ; j++) {
            	
               System.out.print(product[i][j]+"  ");
 
         }
            System.out.println();
      }
	}
}
