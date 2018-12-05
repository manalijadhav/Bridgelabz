package com.functions.n.libraries;

import java.util.*;

public class PresentValue {

    public static void main(String ars[]){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the amount you want in future");
        
        double C = scanner.nextInt();
        
        System.out.println("Enter Period");
        
        double T = scanner.nextInt();
        
        System.out.println("Enter rate");
        
        double R = scanner.nextInt();
        
        double Cinterest = presentValue(C , T , R);
        
        System.out.println("Amount of money you need to invest today: " + Cinterest);
    }
    
    public static double presentValue(double C , double  T , double R){
       
        double a = Math.pow((1+R) , T);
        
        double presentvalue =  C / a;
        
        return presentvalue;
        
        
    }
}
