package com.strings.n.arrays;

import java.util.*;

public class PrimePalindrome {

	public static void main(String[] args) 
    {
		Scanner scanner= new Scanner(System.in);
		
	    System.out.print("Enter range between 0-1000\n  "); 
	    
	    int n = scanner.nextInt();
     
        prime(n);
       
    }
	
	public static void prime(int n) { 
	
	LinkedList <Integer> l = new LinkedList<Integer>();
		
	boolean arr[] = new  boolean[n];
	
	for(int i=0;i<n;i++)
		
	arr[i] = true;

	for(int p=2; p*p<n;p++) {
	
		if(arr[p]=true) {
		
			for(int i = p * 2 ;i<n;i+=p)
				arr[i]= false;
		}
	}
	for(int i=2;i<n;i++)
	{
		if(arr[i] == true)
		{
			
			l.add(i);
		}
			
	}
//	System.out.println("prime numbers" + l);
	Integer num[]=l.toArray(new Integer[l.size()]);

	/*for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}*/
	palind(num);

	}

	public static void palind(Integer num[])
	{
		LinkedList <Integer> l1=new LinkedList<Integer>();
	    for(int i=0;i<num.length;i++)
	    {
	        int n1=0;
	        int num1=num[i];
	        while(num1!=0)
	        {
	            n1=(n1*10)+(num1%10);
	            num1=num1/10;
	        }
	        
	        if(n1==num[i])
	        {
	            l1.add(num[i]);
	}
	    }
	   System.out.println("Palindrome numbers are" +l1);
	   Integer numb[]=l1.toArray(new Integer[l1.size()]);
	   
	   int [][] Palindr = new int[5][5];
	
	   int x=0;
	   
	   for(int i=0; i<5; i++) {
		   for(int j=0; j<5; j++) {
			   Palindr[i][j] = numb[x];
			   x++;
		   }
	   }
	   System.out.println("2D array");
	   for(int i=0; i<5; i++) {
		   for(int j=0; j<5; j++) {
			   System.out.print(Palindr[i][j]);
		   }
		   System.out.println(" ");
	  
	}


	}
}
