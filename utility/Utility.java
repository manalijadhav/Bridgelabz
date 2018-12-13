package utility;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	 
	 
//********************************************BUBBLE SORT************************************************ 
	 
	 
	 public static int bubblesort(int arr[], int l) {
		
			int flag = 0;
			
			for(int i=0;i<l;i++)
			{
				for(int j=0; j<l-i-1;j++)
				{
					
					if(arr[j]>arr[j+1])
					{
						int temp = arr[j];
						
						arr[j] = arr[j+1];
						
						arr[j+1] = temp;
						
						flag++;
					}
				}
				if(flag == 0)
					
					break;
			}
			System.out.println("Sorted array:") ;
			
			for( int i = 0 ; i < l ; i++ )
				
			System.out.println(arr[i]);
			
			return flag;
		}
//*****************************************PRIME NUMBERS*******************************************************
	
	 public static boolean isPrime(int n) {
	      
	    	//1 is neither prime nor composite
	    	if (n <= 1) {
	        
	    		return false;
	        }
	        
	    	//set upper limit to sqrt of n 
	    	//n has no other factors greater than its sqrt except itself
	    	for (int i = 2; i <= Math.sqrt(n); i++) {
	        
	    		//if remainder is 0 then factors are present
	    		if (n % i == 0) {
	            
	    			return false;
	            }
	        }
	        return true;
	    }



//***************************REGISTRATION FORM**********************************

public static boolean ValidatenameStrings( String fname ){
	
	boolean flag1 = false;
	
	//allow only Alphabets and space
	Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z ]*");
    Matcher match = pattern.matcher(fname);
    if(match.find() && match.group().equals(fname)) {
        
        flag1 = true;
        
    }
    else { 
    
        System.out.println("Invalid information");
    }
	
	return flag1;
}

public static boolean ValidateEmailStrings( String email ){
	
	boolean flag1 = false;
	
	
	Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    Matcher match = pattern.matcher(email);
    if(match.find() && match.group().equals(email)) {
        
        flag1 = true;
        
    }
    else { 
    
        System.out.println("Invalid information");
    }
	
	return flag1;
}

public static boolean ValidateContactStrings( String ph ){
	
	boolean flag1 = false;
	
	//allow only Alphabets and space
	Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
	
    Matcher match = pattern.matcher(ph);
    
    if(match.find() && match.group().equals(ph)) {
        
    	flag1 = true;       
    }
    else { 
    
        System.out.println("Invalid information");
    }
	
	return flag1;
}

public static boolean ValidateUserIDStrings( String uid ){
	
	boolean flag1 = false;
	

	Pattern pattern = Pattern.compile("[a-z0-9]+");
    Matcher match = pattern.matcher(uid);
    if(match.find() && match.group().equals(uid)) {
        
    	flag1 = true;
        
    }
    else { 
    
        System.out.println("Invalid information");
    }
	
	return flag1;
}

public static boolean ValidateCompanyStrings( String cname ){
	
	boolean flag1 = false;	
	Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z ]*");
    Matcher match = pattern.matcher(cname);
    if(match.find() && match.group().equals(cname)) {
        
    	flag1 = true;
        
    }
    else { 
    
        System.out.println("Invalid information");
    }
	
	return flag1;
}

public static boolean ValidatePasswordStrings( String pw ){
	
	boolean flag1 = false;
	
	
	Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[A-Z])(?=.*[!^&*@#$%]).{8,20})+"); 
	
    Matcher match = pattern.matcher(pw);
    
    if(match.find() && match.group().equals(pw)) {
        
        flag1 = true;
        
    }
    else { 
 
    	flag1 = false;
     //   System.out.println("Invalid information");
    }
	
	return flag1;
}
}