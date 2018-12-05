package com.functions.n.libraries;

import java.util.*;

public class Collinear {

	  public static void main(String ars[]){
	      
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Enter co-ordinates for A , B and C");
	    
	    System.out.print("x1:");
	    
	    double x1 = scanner.nextInt();
	    
	    System.out.print("x2:");
	    
	    double x2 = scanner.nextInt();
	    
	    System.out.print("x3:");
	    
	    double x3 = scanner.nextInt();
	    
	    System.out.print("y1:");
	    
	    double y1 = scanner.nextInt();
	    
	    System.out.print("y2:");
	    
	    double y2 = scanner.nextInt();
	    
	    System.out.print("y3:");
	    
	    double y3 = scanner.nextInt();
	    
	    System.out.println("The co-ordinates of A are : " +x1 + " , " + y1);
	    
	    System.out.println("The co-ordinates of B are : " +x2 + " , "  +y2);
	    
	    System.out.println("The co-ordinates of C are : " +x3 + " , " + y3);
	    
	    boolean flag = checkCollinearUsingSlope(x1 , x2 , x3 , y1 , y2 , y3 );
	    
	    if(flag)
	        
	        System.out.println("Points A , B ,C are collinear by slope method");
	    
	    else
	        
	        System.out.println("Points are not collinear by slope method");
	    
	    boolean status = checkCollinearpublicUsingArea(x1, x2, x3 , y1, y2, y3);
	    
	    if(status)
	        
	        System.out.println("Points A , B ,C are collinear by area method");
	    else
	        
	        System.out.println("Points are not collinear by area method");
	    
	    }

	    public static boolean checkCollinearUsingSlope(double x1, double x2, double x3, double y1, double y2, double y3) {
	 
	        boolean flag ;
	        
	        double slope1 = (y2 - y1) / (x2 - x1);
	        
	        System.out.println("Slope AB:" +slope1);
	        
	        double slope2 = (y3 - y2) / (x3 - x2);
	        
	        System.out.println("Slope BC:" +slope2);
	        
	        double slope3 = (y3 - y1) / (x3 - x1);
	        
	        System.out.println("Slope AC:" +slope3);
	        
	        if(slope1 == slope2 && slope2 == slope3 && slope1 == slope3){
	            
	            flag = true;
	        }
	        else
	        
	        flag = false;
	        
	        
	      return flag;
	        
	        
	    }
	    
	    public static boolean checkCollinearpublicUsingArea(double x1, double x2, double x3, double y1, double y2, double y3) {
	 
	        boolean status ;
	        
	        double a = x1 - x2;
	        
	        double b = x2 - x3;
	        
	        double c = y1 - y2;
	        
	        double d = y2 - y3;
	        
	        double del = ( (a * d) - (b * c) );
	        
	        double delta = 0.5 * del;
	        
	        if(delta == 0)
	            
	            status = true;
	        
	        else
	            
	            status = false;
	        
	        return status;
	    }

	   
	}


