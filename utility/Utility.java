package utility;

import java.util.*;

public class Utility {

	static Scanner scanner = new Scanner(System.in);
	
//************************************LEAP YEAR****************************************************************	
	
	public static boolean LeapYear(int year) {
		
		boolean flag = false;
	
		if(year <= 1582) {
 			
 			System.out.println("invalid entry");
		}
		else {
			
			if(year % 400 == 0) {
				
				flag = true;
				}
			
			else if(year % 100 == 0) {
				
				flag = false;
				}	
			
			else if(year % 4 == 0) {
				
				flag = true;
			
				}
			
			else {
				
				flag = false;
				
				}
			 
			
			}
		return flag;
	}
	
//******************************************DISTANCE**********************************************************
	
	public static double Distance(int x, int y){
	
		double a = Math.pow(x, 2);
		
		double b = Math.pow(y, 2);
		
		double add = a + b;
		
		double result = Math.sqrt(add);
		
		return result;
		
	}

//********************************************WINDCHILL******************************************************
			
	public static double WindChill(int t, int v) {
	
		double a = (t *1.8)+ 32;
		
		double b = (18*v)/5;
		
		double w=0;
		
		System.out.println("enter value of t and v ");
		if(t>50 && 120 < v && v<3){
		
		 w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);	
	}
		return w;
	}


		
//*****************************************CAR LOAN*********************************************************	
	
	public static float CarLoan(float Principal, float Year, float Rate) {
	
		float n = 12 * Year;
		
		float r = Rate / (12 * 100);
		
		float t = (Principal * r);
		
		float m =  (float) (1 - (Math.pow((1 + r), -n)));
		
		float payment = t / m;
		
		return payment;
	}
	

	
	
//********************************************ROLL DIE**********************************************************	
	
	public static int checkRepeated(int arr[], int size)
	
	 {	
		int count = 0, curr_cnt = 1, freq_num = 0, key = 0;
	 for(int i = 0; i < size-1; i++)
	 {
	     key = arr[i];
	     
	     for(int j =i+1; j < size; j++)
	     {
	         if(key == arr[j] && freq_num != key)
	         {
	             curr_cnt++;
	         }
	     }
	     if(count < curr_cnt)
	     {
	         count = curr_cnt;
	         curr_cnt = 1;
	         freq_num = key;
	     }
	 }
	return freq_num;
	 }

//**********************************************HARMONIC NUMBER********************************************************	
	public static float Harmonics(int N) {
		
		float sum = 0;
		
	    if( N <= 0 ){
	    
	        System.out.println("Ensure N should not be zero");
	    	
	    	}
	    
	    else{
	    	
	    	for (int i = 1; i <= N; i++){
	
	    		sum = sum + (float) 1 / i;
	    		
	    		}
	    	
	    	
	    	
	    	}
	    return sum;
		
	}
	
//************************************************SQRT FUNCTION************************************************	
	public static double SqrtFunction(double c)
	{
		double t = c;
		
		double epsilon = 1e-15;   

	      
	        while (Math.abs ( t - c / t ) > epsilon * t)
	        {
	        	//replacing t with avg of c/t and t
	            t = ( c / t + t ) / 2.0;
	        }
	        	return t;
	}
	
//***************************************PRINT THREE NAMES 1****************************************************************	
	
	 public static String[] nameReverse(String firstName, String secondName, String thirdName)
		{
		    String name[]= {firstName,secondName,thirdName};
		    
		    int START = 0;
		    
		    int END = name.length-1;
		    
		    while(START < END) {
		    
		       String temp = name[START];
		       
		        name[START] = name[END];
		        
		         name[END]=temp;
		         
		         START++;
		         
		         END--;
		    }
		   
		    return name;
		}
	
//**************************************ZERO PADDING*******************************************************************
	 
	 
	 public static String ToString(String bin , int StringLength) {
			
			int NumberOfDigits = bin.length();
			
			int NumberOfZeros = StringLength - NumberOfDigits;
			
			StringBuilder sb = new StringBuilder();
			
			if(NumberOfZeros > 0) {
				
				for(int i =0; i< NumberOfZeros; i++){
					sb.append("0");
				}
			}
			sb.append(bin);
			return sb.toString();
			
		
		}
	 
//********************************************CALENDER*************************************************** 
	 
	 public static int date(int d , int m , int y) {
		 
		 int y0 = y - (14 - m) / 12;
		    
		    int x = y0 + y0/4 - y0/100 + y0/400;
		    
		    int m0 = m + 12 * ((14 - m) / 12) - 2;
		    
		    int d0 = (d + x + (31*m0)/12) % 7;
		    
		    return d0;

	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}