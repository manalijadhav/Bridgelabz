/*********************************************************************************************************

 *  Purpose: Accepts stake goal and trials from user. Keeps track of the number of times won and number of bets made.
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   21-11-2018
 *  
**********************************************************************************************************/
package com.functionalprograms;

import java.util.*;

import java.util.Random;

public class Gammbler{
	public static void Gammbler(int stake, int goal, int trials){
		
		int loss=0;
		
		int bets=0;
		
		int wins=0;
		
		
		

			for (int t = 0; t < trials; t++) {
			
				int cash = stake;
				
				while (cash > 0 && cash < goal) {
					bets++;
					if (Math.random() < 0.5)
					{
						cash++;
						
						
					}
					else {      
						
						cash--;
						
					}
	            
					}
						if (cash == goal){
	        
							wins++;
							
						}
						
						else{
	        	
							loss++;
							
						}
			}
				
			
			System.out.println(wins + " wins of " + trials);
			
			double won= ( 100.0 * wins )  / trials;
		
			System.out.println("Percent of games won = "+ won);
			
			System.out.println(loss +" loss of " + trials );
			
			double lose =( 100.0 * loss ) / trials;
			
			System.out.println("Percent of games lose = "+ lose);
			
		//	double avg = (winbets + losebets)/2;
			
			//System.out.println("Average number of bets made:" + avg);
			System.out.println("Number of bets: "+ bets);
			
			//double avg = (wins + lose)/bets;
			
			//System.out.println("Average number of bets made:" + avg);
			
		}
	
     public static void main (String[] args){
    	 
    	 Scanner scanner = new Scanner(System.in);
     
    	 System.out.print("enter player's stake");
     
    	 int stake= scanner.nextInt();
     
     
    	 System.out.print("enter player's goal");
     
    	 int goal= scanner.nextInt();
     
    	 System.out.print("enter player's trials");
     
    	 int trials= scanner.nextInt();
     
    	 Gammbler(stake,goal,trials);
}
}
