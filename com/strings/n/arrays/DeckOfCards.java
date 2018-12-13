package com.strings.n.arrays;

public class DeckOfCards {

	public static void main(String[] args) {

		String[] suits = {
			    "Clubs", "Diamonds", "Hearts", "Spades"
			}; 

			String[] ranks = {
			    "2", "3", "4", "5", "6", "7", "8", "9", "10",
			    "Jack", "Queen", "King", "Ace"
			};
			
			//initialize an array of length 52 that represents a deck of playing cards
			
			 int n = suits.length * ranks.length;
			 
		      String[] deck = new String[n];
		      
		      for (int i = 0; i < ranks.length; i++) {
		    	   
		    	  for (int j = 0; j < suits.length; j++) { 
		    	     
		    		  deck[suits.length*i + j] = ranks[i] + " of " + suits[j]; 
		    		
		    	//	  System.out.println(ranks[i] + " of " + suits[j]); 
		    	  }
		      }
		    		  //shuffling
		    		  //from left to right(from 1-52), we pick a random card from deck[i] through deck[n-1] 
		    		  //(each card equally likely) and exchange it with deck[r]
		    		  
		    		  for (int i = 0; i < n; i++) {
	
		    			  int r = i + (int) (Math.random() * (n-i));
		    			  
		    			 // System.out.println("R" +r);
		    	          
		    			  String temp = deck[r];
		    	          
		    			  deck[r] = deck[i];
		    	          
		    			  deck[i] = temp;
		    	        }
		    		  
		    		  
//		    		  for(int i = 0; i < n; i++) {
//		    	            System.out.println(deck[i]);
//		    	        }
		    		  
		    		  for(int i = 0; i < 4; i++) {
		    	         
		    			  System.out.println("** Person" + (i+1) + "**");
		    	          
		    			  for (int j = 0; j < 9; j++) {
		    	           
		    				  System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
		    	            }
		    	        }
		    	    }

	


}

