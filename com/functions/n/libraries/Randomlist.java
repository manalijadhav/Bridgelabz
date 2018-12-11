//package com.functions.n.libraries;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Random;
//
//	public class Randomlist {
//
//		public static void main(String[] args) {
//		
//		int distinct [] = new int[10];
//		
//		int count = 0;
//		
//		int max, min = 0;
//		
//		Random r = new Random();
//			
//			int random = r.nextInt(20); //1 random number is generated
//		
//					for(int i = 0 ; i < 10 ; ) {
//		
//						if(random == distinct.length) {
//					
//							break;
//						}
//					
//					 					
//			//		int range = (int) (Math.random() * (( max - min ) + min));
//					
//						System.out.println("\nRange :"+range);
//					
//						distinct[i] = range;
//				}
//					
//			//		else if(i < 2) {
//						
//				//		max = distinct[i-1];
//						
//						min = Integer.MIN_VALUE;
//						
//			//			int range = (int) (Math.random() * (( max - min ) + min));
//						
//			//			System.out.println("\nRange :"+range);
//					
//						//distinct[i] = range;
//					//}
//					
//					//else {
//						
//						for(int j =0; j< distinct.length; j++) {
//		//					if(random == distinct[j])
//			//					continue outer;
//								
//								
//							
//						}
//					}
//			//}
//			
//			//System.out.println(arr[i]);
//			
//		//}
//		//sorting and printing sorted array
//			
////		Arrays.sort(distinct);
////		
////		for(int i = 0; i < distinct.length; i++) {
////			
////			System.out.println(distinct[i]);
////		}
////		
////		//finding duplicate generated random number
////		
////		for( int i = 0; i < distinct.length; i++ ) {
////			
////			for( int j = i+1; j < distinct.length; j++ ) {
////				
////				if(distinct[i] == distinct[j] && i != j) {
////					
////					int x = distinct [i];
////					
////					int y = distinct [j];
////					
////					int range = (int) (Math.random() * (( y - x ) + x));
////				
////					System.out.println("\nrange"+range);
////					
////					distinct[i] = range;
////					
////				}			
////			}
////
////		}
////		Arrays.sort(distinct);
////		System.out.println("final array");
////		for(int i = 0; i < distinct.length; i++) {
////		//	System.out.println();
////			
////		System.out.println(distinct[i]);
////		//System.out.println("Repeated numbers"+ al);
////		
////		}
////			
//		
//	
//		}
