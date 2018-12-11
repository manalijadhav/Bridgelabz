package com.functions.n.libraries;

import java.util.Random;

public class FinalRandom {

	static int n = 10;
	
	static int distinct [] = new int[n];
	
	public static void main(String[] args) {
		
		distinct  = unique(n) ;
		
	}
	
	public static int[]  unique (int n1){
		
		Random r = new Random();
		
		for(int i = 0 ; i < distinct.length; ) {
		
			if( i == distinct.length )
			
				break;
			
	}
		int rand = r.nextInt(15);
		
		
	
		return null;
		
		
	}
	
	public static int bsearch( int [] A , int rand) {
		
		
		
		return rand;
		
		
		
		
		
		
	}
	
	public static void printArray() {
		
		for(int i=0; i<n ; i++) {
			
			System.out.println(distinct[i]);
		}
		System.out.println(" ");
	}

}
