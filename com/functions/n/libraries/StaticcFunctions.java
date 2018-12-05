
package com.functions.n.libraries;

import java.util.*;

public class StaticcFunctions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		
		System.out.println("1. To find harmonic number");
		
		System.out.println("2. To find sine of a number");
		
		System.out.println("3. To find cosine of a number");
		
		System.out.println("4. To find binary of a number");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			
			System.out.println("Enter a number");
	         
	        int num = scanner.nextInt();
		
	        float sum = harmonics(num);
	        
	        System.out.println("Result : " +sum);
		
	        break;
	        
		case 2:
			
			System.out.println("Enter angle in degree");
			
			double angle = scanner.nextInt();
			
			double sin = Sin(angle);
			
			System.out.println("Result : " +sin);
		
			break;
		
		
		case 3:
			
			System.out.println("Enter angle in degree");
			
			double angle1 = scanner.nextInt();
			
			double cos = Cos(angle1);
			
			System.out.println("Result : " +cos);
		
			break;
		
		case 4:
			
			System.out.println("Enter a decimal number");
			
			int dec = scanner.nextInt();
			
			dectoBinary(dec);
		}

	}
	
	public static float harmonics(int num) {
		
		float sum = 0;
		
	    if( num <= 0 )
	    
	        System.out.println("Ensure N should not be zero");
	    	
	    	
	    else{
	    	
	    	for (int i = 1; i <= num ; i++){
	
	    		sum = sum + (float) 1 / i;
	    		
	    		}
   	}
	    return sum;
		
	}
	
	public static double Sin(double angle) {
		
		double radian = Math.toRadians(angle);
		
		double sine = Math.sin(radian);
		
		return sine;
	}
	
	
	public static double Cos(double angle1) {
		
		double radian1 = Math.toRadians(angle1);
		
		double cosine = Math.cos(radian1);
		
		return cosine;
	}
	
	public static void dectoBinary(int dec) {
		
		int [] binaryNum = new int [1000]; 
        
        int count = 0; 
        
        while (dec > 0)  {
        
             
            binaryNum [ count ] = dec % 2; 
            
            dec = dec / 2; 
            
            count++ ; 
        }
            for (int j = count - 1 ; j >= 0 ; j--) {
                
            	
              int  result = binaryNum[j];
                
             System.out.print(result);
        	
		
		}
		
		
	}
}
	


