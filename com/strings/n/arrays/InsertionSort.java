package com.strings.n.arrays;

import java.util.Scanner;

public class InsertionSort{ 
	
	public static void strinsertionsort(String str[], int leng) {

	for(int i=0;i<leng;i++){
	
		for(int j=i+1;j<leng;j++){
		
			if(str[i].compareToIgnoreCase(str[j])>0){
				
				String temp = str[i];
				
				str[i]=str[j];
				
				str[j]=temp;
		}
		
	}
}
	System.out.println("Sorted array");
	
	for(int i=0;i<leng;i++)
		
	      System.out.println(str[i]);
}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of the array");
		
		int leng = sc.nextInt();
		
		String str[] = new String[leng];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<leng;i++)
		{
		str[i]=sc.next();
		}
		
		strinsertionsort(str,leng);
	}

}
