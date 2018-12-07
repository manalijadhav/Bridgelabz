package com.functions.n.libraries;

import java.util.*;

/**
 * @author admin1
 *
 */
public class MathFunction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		
		System.out.println("1. To find harmonic number");
		
		System.out.println("2. To find sine of a number");
		
		System.out.println("3. To find cosine of a number");
		
		System.out.println("4. To find binary of a number");
		
		System.out.println("5. To find square root by Newton's method");
		
		System.out.println("6. To find isPrime number");
		
		System.out.println("7. To find factorial of a number");
		
		System.out.println("8. To find Future value");
		
		System.out.println("9. To find Present value ");
		
		System.out.println("10. To find Min and Max number");
		
		System.out.println("11. To find Min and Max string");
		
		System.out.println("12. To check collinearity of points");
		
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			
			System.out.println("Enter a number");
	         
	        int num = scanner.nextInt();
		
	        float sum = harmonics(num);
	        
	        System.out.println("Result : " +sum);
		
	        break;
	        
		case 2:
			
			System.out.println("Enter angle in degree");
			
			double angle = scanner.nextInt();
			
			double sin = Sin(angle);
			
			System.out.println("Result : " +sin);
		
			break;
		
		
		case 3:
			
			System.out.println("Enter angle in degree");
			
			double angle1 = scanner.nextInt();
			
			double cos = Cos(angle1);
			
			System.out.println("Result : " +cos);
		
			break;
		
		case 4:
			
			System.out.println("Enter a decimal number");
			
			int dec = scanner.nextInt();
			
			dectoBinary(dec);
			
			break;
			
		case 5:
			
			System.out.println("Enter the value of c");
			
			double c = scanner.nextInt();
			
			double result = sqrt(c);
			
			System.out.println("SquareRoot by newton's method is : " +result);
			
			break;
		case 6:
			
			//accept a number
	        System.out.print("Enter a number : ");
	        
	        int n = scanner.nextInt();
	         
	        //check if boolean is true
	        if (isPrime(n)) {
	            
	        	System.out.println(n + " is a prime number");
	        } 
	        else {
	        
	        	System.out.println(n + " is not a prime number");
	        }
	        break;
		
		case 7:
			
			System.out.println("Value of N");
			int N = scanner.nextInt();
			//int N = Integer.parseInt(args[0]);  
		    
	        
	        
	        int facto = factorial(N);
	        
	        System.out.println("Result is " + facto);
	        
	        break;
	        
		case 8:
			
			System.out.println("Enter the amount you want to invest");
	        
	        double C = scanner.nextInt();
	        
	        System.out.println("Enter Period");
	        
	        double T = scanner.nextInt();
	        
	        System.out.println("Enter rate");
	        
	        double R = scanner.nextInt();
	        
	        double Cinterest = futureValue(C , T , R);
	        
	        System.out.println("Amount of money you will have in future: " + Cinterest);
	        
	        break;
	        
		case 9:
			
			System.out.println("Enter the amount you want in future");
	        
	        double C1 = scanner.nextInt();
	        
	        System.out.println("Enter Period");
	        
	        double T1 = scanner.nextInt();
	        
	        System.out.println("Enter rate");
	        
	        double R1 = scanner.nextInt();
	        
	        double Cinterest1 = presentValue(C1 , T1 , R1);
	        
	        System.out.println("Amount of money you need to invest today: " + Cinterest1);
	        
	        break;
	        
		case 10:
		
			System.out.println("Enter the length of array");
		    
		    int n1 = scanner.nextInt();

		    int [] array = new int[n1];
		    
		    System.out.println("Enter the elements");
		    
		    for(int i=0; i<n1; i++){
		        
		        array[i] = scanner.nextInt();
		        
		    }
		    
		        int result1 = max(array);
		        
		        System.out.println("Maximum value in array is: " + result1);
		        
		        int res = min(array);
		        
		        System.out.println("Minimum value in array is: " + res);
		        
		        break;
		        
		case 11:
			
			String max1 = null;
			
			String min1 = null;
			
			System.out.println("Enter the length of array");
		    
		    int n2 = scanner.nextInt();

		    String [] array1 = new String[n2];
		    
		    System.out.println("Enter the elements");
		    
		    for(int i=0; i<n2; i++){
		        
		        array1[i] = scanner.next();
		    }
//		    System.out.println("You entered : ");
//		    
//		    for(int i=0; i<n; i++){
//		    
//		    	System.out.println(array[i]);
	//
//		    }
		    max(array1);
		    min(array1);
		    
		    break;	
		    
		case 12:
			
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
			    
			    
			    break;
		}
	}
	
	public static float harmonics(int num) {
		
		float sum = 0;
		
	    if( num <= 0 )
	    
	        System.out.println("Ensure N should not be zero");
	    	
	    	
	    else{
	    	
	    	for (int i = 1; i <= num ; i++){
	
	    		sum = sum + (float) 1 / i;
	    		
	    		}
   	}
	    return sum;
		
	}
	
	public static double Sin(double angle) {
		
		double radian = Math.toRadians(angle);
		
		double sine = Math.sin(radian);
		
		return sine;
	}
	
	
	public static double Cos(double angle1) {
		
		double radian1 = Math.toRadians(angle1);
		
		double cosine = Math.cos(radian1);
		
		return cosine;
	}
	
	public static void dectoBinary(int dec) {
		
		int [] binaryNum = new int [1000]; 
        
        int count = 0; 
        
        while (dec > 0)  {
        
             
            binaryNum [ count ] = dec % 2; 
            
            dec = dec / 2; 
            
            count++ ; 
        }
            for (int j = count - 1 ; j >= 0 ; j--) {
                
            	
              int  result = binaryNum[j];
                
             System.out.print(result);
        	
		
		}
		
		
	}
	public static double sqrt(double c) {
		

		double t = c;
		
		double epsilon = 1e-15;   

	      
	        while (Math.abs ( t - c / t ) > epsilon * t)
	        {
	        	//replacing t with avg of c/t and t
	        	
	            t = ( c / t + t ) / 2.0;
	        }
	        	return t;
	}
	
	public static boolean isPrime(int n) {
	      
    	//1 is neither prime nor composite
    	if (n <= 1) {
        
    		return false;
        }
        
    	//set upper limit to sqrt of n 
    	//n has no other factors greater than its sqrt except itself
    	for (int i = 2; i < Math.sqrt(n); i++) {
        
    		//if remainder is 0 then factors are present
    		if (n % i == 0) {
            
    			return false;
            }
        }
        return true;
    }
	
	public static int factorial(int N){
        
        int fact = 1;
        
        for(int i = 1; i <= N ;i++){
            
            fact = fact * i;
        }
        return fact ;
    }
	
	public static double futureValue(double C , double  T , double R){
	       
        double a = Math.pow((1+R) , T);
        
        double futurevalue =  C * a;
        
        return futurevalue;
	}
	
	public static double presentValue(double C , double  T , double R){
	       
        double a = Math.pow((1+R) , T);
        
        double presentvalue =  C / a;
        
        return presentvalue;
        
        
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
	 
	 public static void max(String [] array1) {
		
		 String max1 = null;
		 
		 for(int i=0; i<array1.length-1; i++) {
		    	
		    	for(int j=i+1 ; j<array1.length; j++) {
		    		
		    		if(array1[i].compareToIgnoreCase(array1[j])>0) {
		    			
		    		max1 = array1[i];
		    		
		    		
		    			
		    		}
		    	}
		 }
		
		System.out.println("Maximum : " + max1);
	 }
		    	
	public static void min(String [] array1) {
		    		
		String min1 = null;
		
		  for(int i = 0; i<array1.length-1; i++) {
		    		
		    for(int j=i+1 ; j<array1.length; j++) {
		    			
		    	if(array1[i].compareToIgnoreCase(array1[j])<0) {
		    		
		    			min1 = array1[i];
		    			
		    			
		    			}
		    }
		  }
		  System.out.println("Minimum : " + min1);
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
		    	
		
	 
