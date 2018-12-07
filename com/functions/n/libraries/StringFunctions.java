package com.functions.n.libraries;

import java.util.*;

public class StringFunctions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter your choice:");
        
        System.out.println("1.To check if the given two strings are Anagram.");
        
        System.out.println("2.To check if the given String is a Palindrome or not.");
        
        System.out.println("3.To check Permutation of String by iterative method");
        
          int choice = scanner.nextInt();
          
          switch(choice) {
          
          case 1:
        	  	System.out.println("Enter first string:");
        		Scanner scanner2 = new Scanner(System.in);

        	  	String string1 = scanner2.nextLine();
        	  	
        	  	System.out.println("Enter second string:");
        	  	Scanner scanner3 = new Scanner(System.in);

        	  	String string2 = scanner3.nextLine();
        	  	//String string2 = scanner.next();
        
        	  	boolean flag = isAnagram(string1 , string2);
        	  	
        	  	if(flag){
         	        
    				System.out.println("Entered strings are anagrams");
    					}
    			
    			else{
            
    				System.out.println("Entered strings are not anagrams");
    				
    				}
        	  		
        	  		break;
        	  	
          	case 2:
          		
                System.out.println("Enter a string");
                
                String s = scanner.next();
                
                boolean status = isPalindrome(s);
                
                if(status) {
                	
                	System.out.println("Palindrome");
                }
                
                else {
                	
                	System.out.println("Not a Palindrome");
                }
                
                break;
                
          	case 3:
          		
          		System.out.println("Enter a String");
          		
          		String str = scanner.next();
          		
          		int len = str.length();
          		
          		permute(str , 0 , len-1);
          		
	}
	}

	public static boolean isAnagram(String string1, String string2)
	{
		
				boolean flag = false;
				
				//remove all spaces from strings then compare
				
				String str1 = string1.replaceAll("\\s", "");
				
				String str2 = string2.replaceAll("\\s", "");
				
				if(str1.length()!=str2.length())
				{
					//System.out.println("Entered strings are not anagrams");
					
					flag = false;
				}
				else
			        {
						
						
			 
			            char ch1[] = str1.toLowerCase().toCharArray();
			            char ch2[] = str2.toLowerCase().toCharArray();
			           
		          /*for(int i=0;i<ch1.length-1;i++)
			           {
			        	if(ch1[i] > ch1[i+1])
			        	{
			        		char temp = ch1[i];
			        		ch1[i] = ch1[i+1];
			        		ch1[i+1] = temp;
		        	}
			        	for(int j=0;j<ch2.length-1;j++)
				           {
			        	if(ch2[j] > ch2[j+1])
				        	{
			        		char temp = ch2[j];
			        		ch2[j] = ch2[j+1];
				        		ch2[j+1] = temp;
			        	}
			           }
		        	
			           }*/
			            
			            Arrays.sort(ch1);
			            Arrays.sort(ch2);
			            
			            if(Arrays.equals(ch1,ch2))
			            {
			            	
			            flag = true ;
			            
			          
			            }
			            else
			            {
			            	flag = false;
			            	
			            	
			            }
			        }
				return flag;
	}
	
		public static boolean isPalindrome(String Pal) {
			
			boolean status = false;
			
			 String rev=" ";
			 
		        int length = Pal.length();
		        
		        status = true; 
		        
		          for (int i = length - 1; i >= 0; i--)
		        	  
		             rev = rev + Pal.charAt(i);
		             
		          if (status=Pal.equalsIgnoreCase(rev)) {
		             
		        	  System.out.println(status);         
		             
		        	  
		          }
		          else {
		              
		        	  System.out.println(status);
		        	  
		          
		    }
		          return status;
		          
		          }
		
		public static void permute(String str, int s, int e) {
	        if(s == e) {
	            System.out.println(str);
	        }else {
	            for(int i = s; i <= e; i++) {
	               
	                str = swap(str, s, i);
	                permute(str, s+1, e);
	                str = swap(str, s, i);
	            }
	               
	        }
	    }
		public static String swap(String a, int i,int j) {
	        char temp;
	        char [] array = a.toCharArray();
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        return String.valueOf(array);
	       
	    }
		
			
		}
	
		
	

