package com.strings.n.arrays;

import java.util.*;

public class DeterminantOfMatrix {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter base of Matrix");
//		
//		int base = scanner.nextInt();
		
		int [][] matrix = new int [3][3] ;
		
		System.out.println("Enter Elements");
		
		for(int i=0; i < 3; i++) {
			
			for(int j=0; j< 3 ; j++) {
				
				matrix[i][j] = scanner.nextInt();
				
			}
		}
		for(int i=0; i < 3; i++) {
			
			for(int j=0; j< 3 ; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int m1 = ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]));
		
		int m2 = ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]));
		
		int m3 = ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
	
		
		int sign = (int)(Math.pow(-1,1+(matrix[0][0])+1));
		
	//	System.out.println("Sign: "+sign);
		
		int sign1 = (int)(Math.pow(-1,1+(matrix[0][1])+1));
		
	//	System.out.println("Sign1: "+sign1);
		
		int sign2 = (int)(Math.pow(1,1+(matrix[0][2])+1));
		
	//	System.out.println("Sign2: "+sign2);
		
		matrix[0][0] = (int)(matrix[0][0] * sign * m1);
	
	//	System.out.println(matrix[0][0] ) ;
		
		matrix[0][1] = (int)(matrix[0][1] * sign1 * m2);
		
	//	System.out.println(matrix[0][1]);
		
		matrix[0][2] = (int)(matrix[0][2] * sign2 * m3);
		
	//	System.out.println(matrix[0][2]);
		
		double Determinant = matrix[0][0] + matrix[0][1] + matrix[0][2];
		
		System.out.println("Determinant is: " +Determinant);
		
		
	}

}
