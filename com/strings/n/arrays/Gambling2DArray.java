package com.strings.n.arrays;

import java.util.*;

public class Gambling2DArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	     
		System.out.print("enter player's stake");
    
		int stake= scanner.nextInt();
    
    
		System.out.print("enter player's goal");
    
		int goal= scanner.nextInt();
    
		System.out.print("enter player's trials");
    
		int trials= scanner.nextInt();
		
		String output[][] = Gammbler(stake, goal, trials);
		
		for(int i = 0; i < 2; i++) {
	         
			for(int j = 0; j < 2; j++) {
	        
				System.out.print(output[i][j] + "  ");
	            }
	            System.out.println();
	        }

	}
	
public static String[][] Gammbler(int stake, int goal, int trials){
		
		int loss=0;
		
		int bets=0;
		
		int wins=0;
		
		String result[][] = new String[2][2];
		
			for (int t = 0 ; t < trials ; t++) {		
				
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
			
			result[0][0] = "W";
            result[0][1] = "L";
            result[1][0] = Integer.toString(wins);
            result[1][1] = Integer.toString(loss);
            
			
			return result;
			
			//double avg = (wins + lose)/bets;
			
			//System.out.println("Average number of bets made:" + avg);
			
		}

}
