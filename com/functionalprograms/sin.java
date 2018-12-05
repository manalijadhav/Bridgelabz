
/*********************************************************************************************************
 *  Purpose: Calculates the taylors series of Sin x.
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   30-11-2018
 *  
**********************************************************************************************************/package com.functionalprograms;

import java.util.*;

public class sin {
	
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the number of terms you wish");
		
			int	N = scanner.nextInt();
			
			System.out.println("Enter number in degree:");
			
			double angle = scanner.nextDouble();
	
			//Convert angle x to an angle between ­2 PI and 2 PI using following logic
			
			angle = ( angle % ( 2 * Math.PI ) );
			
			double sinX = 0.0 ;
			
			int power = 1;

			int count = 0;
			
			while(count!=N)
			{
				// if my position at even position then add term else subtract term
				
			if(count%2==0)
			{
				sinX = sinX + (Math.pow(angle,power)/fact(power));
			}
			else {
				
			
				sinX = sinX-(Math.pow(angle, power)/fact(power));
			}
		
			
			power = power +2;
			
			count++;
			
			}
		
	System.out.println(""+sinX);
	}
	

	public static double fact(int n) {
		
		double f=1;
		
		for(int i=0; i< n; i++) {
			
			f = f * i; 
		}
		return n;
	}

	

	
}


	
	

