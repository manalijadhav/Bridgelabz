package com.functions.n.libraries;

import java.util.*;

public class MinMAx {

public static void main(String ars[]){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the length of array");
    
    int n = scanner.nextInt();

    int [] array = new int[n];
    
    System.out.println("Enter the elements");
    
    for(int i=0; i<n; i++){
        
        array[i] = scanner.nextInt();
        
    }
    
        int result = max(array);
        
        System.out.println("Maximum value in array is: " + result);
        
        int result1 = min(array);
        
        System.out.println("Minimum value in array is: " + result1);
}
    
 public static int max(int array[]){
     
     int n = array.length;
     
     int max = array [ 0 ];
     
     for(int i = 0; i < n ; i++){
         
         if(array[i] > max){
             
             max = array[i];
             
         }
     
 }
     return max;
}  
 
 public static int min(int array[]){
     
     int n = array.length;
     
     int min = array[0];
     
     for(int i =0; i<n ; i++){
         
         if(array[i] < min){
             
             min = array[i];
         }
     }
     
     return min;
 }

}
