package com.strings.n.arrays;

import java.util.*;

public class PowerOf2 {

	public static void main(String[] args) {
		
		//int N = Integer.parseInt(args[0]);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number");
		int N = scanner.nextInt();
		
	//	double n =(int) Math.pow(2, N);
		
	//	System.out.println(n);
		
		int pow =1;
		
		for(int i=0; i<N ;i++) {
			
			pow = pow * 2;	
		}
		System.out.println(pow);
		
		int number =pow;
		
		int digit1 , digit2, digit3, digit4, digit5 = 0;
		
		digit1 = number % 10;
		
		number = number / 10;
		
		digit2 = number % 10;
		
		number = number / 10;

		digit3 = number % 10;
		
		number = number / 10;
		
		digit4 = number % 10;
		
		number = number / 10;
		
		digit5 = number % 10;
		
		number = number / 10;
		
		System.out.println("Units: " +digit1);
		System.out.println("Tens: " +digit2);
		System.out.println("Hundreds: " +digit3);
		System.out.println("Thousands: " +digit4);
		System.out.println("TenTh: " +digit5);
		System.out.println(" ");
		
		String result[][] = new String [2][5];
        result[0][0] = "U";
        result[0][1] = "T";
        result[0][2] = "H";
        result[0][3] = "Th";
        result[0][4] = "TenTh";
        
        result[1][0] = Integer.toString(digit1);
        result[1][1] = Integer.toString(digit2);
        result[1][2] = Integer.toString(digit3);
        result[1][3] = Integer.toString(digit4);
        result[1][4] = Integer.toString(digit5);
        
        System.out.println("Result in 2DArray : ");
        
        for(int i=0; i<2; i++) {
        	
        	for(int j=0 ;j<5; j++) {
        		
        		System.out.printf(result[i][j] + " ");
        	}
        	System.out.println("");
        }
		
	}

}
