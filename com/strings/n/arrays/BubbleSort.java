package com.strings.n.arrays;

import java.util.*;

import utility.Utility;

public class BubbleSort
{
	
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of the array you want");
		
		int l = sc.nextInt();
		
		int arr[] = new int[l];
		
		System.out.println("enter the elements");
		
		for(int i = 0; i < l ; i++)
		{ 
		arr[i]=sc.nextInt();
		}
		
		
		Utility.bubblesort(arr, l);
		
		


	}
}


