package com.strings.n.arrays;

import java.util.*;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.Matrix Multiplication");
		System.out.println("2.Matrix Addition");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			
			System.out.println("Number of rows and cols of Matrix1: ");
			
			int row1 = scanner.nextInt();
			
			int col1 = scanner.nextInt();
			
			int [][] first = new int[row1][col1];
			
			System.out.println("Enter elements of Matrix1");
			
			for(int i=0; i<row1; i++) {
				
				for(int j = 0; j<col1; j++) {
					
					first[i][j] = scanner.nextInt();
				}
			}
			
			System.out.println("Number of rows and cols of Matrix2: ");
			
			int row2 = scanner.nextInt();
			int col2 = scanner.nextInt();
			
			//the number of columns in matrix1 must equal the number of rows in matrix2.
			if(col1 != row2) {
				
				System.out.println("Matrices can't be multiplied");
			}
			else {
			
				int [][] second = new int[row2][col2];
				
				System.out.println("Enter elements of Matrix2");
				
				for(int i = 0; i < row2; i++) {
					
					for(int j = 0; j < col2; j++) {
						
						second[i][j] = scanner.nextInt();
					}
				}
				
				int sum = 0;
				
				int [][] product = new int [row1][col2];
				
				for(int i = 0 ; i < row1 ; i++) {
					
					for(int j = 0 ; j < col2 ; j++) {
						
						for(int k = 0; k < row2 ; k++) {
							
							sum = sum + first[i][k] * second [k][j];
						}
						
						product[i][j] = sum ;
					}
				}
				
				System.out.println("Product of the matrices:");
				 
		         for (int i = 0; i < row1; i++){
		         
		            for (int j = 0; j < col2 ; j++) {
		            	
		               System.out.print(product[i][j]+"  ");
		 
		         }
		            System.out.println();
		      }
		         
			}
			break;
			
		case 2:
			
			System.out.println("Number of rows and cols of Matrix1: ");
			
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			
			int [][] matrix1 = new int[m][n];
			
			System.out.println("Enter elements of Matrix1");
			
			for(int i=0; i < m; i++) {
				
				for(int j = 0; j < n; j++) {
					
					matrix1[i][j] = scanner.nextInt();
				}
			}
			
			System.out.println("Number of rows and cols of Matrix2: ");
			
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			
			if(m !=p || m!= q || n!=p || n!=q) {
				
				System.out.println("Matrices must have the same number of rows and columns");
			}
			
			else {
				
				int [][] matrix2 = new int[p][q];
				
				System.out.println("Enter elements of Matrix2");
				
				for(int i = 0 ; i < p ; i++) {
					
					for(int j = 0 ; j < q ; j++) {
						
						matrix2[i][j] = scanner.nextInt();
					}
				}
				
				int [][] sum = new int [m][n];
				
				for(int i=0; i<m; i++) {
					
					for(int j =0; j<n; j++) {
						
						sum[i][j] = matrix1[i][j] + matrix2[i][j];
					}
				}
				
				System.out.println("Addition is: ");
				
				for(int i = 0 ; i < m ; i++) {
					
					for(int j=0; j < n; j++) {
						
						System.out.print(sum[i][j]+"  ");
					}
					
					System.out.println();
				}
				
				
			}
			
		}
		
		
		
		

	}

}
