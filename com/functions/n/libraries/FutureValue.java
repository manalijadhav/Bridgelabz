package com.functions.n.libraries;

import java.util.*;

	public class FutureValue {

	    public static void main(String ars[]){
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the amount you want to invest");
	        
	        double C = scanner.nextInt();
	        
	        System.out.println("Enter Period");
	        
	        double T = scanner.nextInt();
	        
	        System.out.println("Enter rate");
	        
	        double R = scanner.nextInt();
	        
	        double Cinterest = futureValue(C , T , R);
	        
	        System.out.println("Amount of money you will have in future: " + Cinterest);
	    }
	    
	    public static double futureValue(double C , double  T , double R){
	       
	        double a = Math.pow((1+R) , T);
	        
	        double futurevalue =  C * a;
	        
	        return futurevalue;
	        
	        
	    }
	}


