package com.functions.n.libraries;

import java.util.*;

public class NewtonSqrt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of c");
		
		double c = scanner.nextInt();
		
		double result = sqrt(c);
		
		System.out.println("SquareRoot by newton's method is : " +result);
	}
	
	public static double sqrt(double c) {
		

		double t = c;
		
		double epsilon = 1e-15;   

	      
	        while (Math.abs ( t - c / t ) > epsilon * t)
	        {
	        	//replacing t with avg of c/t and t
	        	
	            t = ( c / t + t ) / 2.0;
	        }
	        	return t;
	}

}
