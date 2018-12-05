package com.strings.n.arrays;

import java.util.*;

public class BubbleSort
{
	public static void bubblesort(int arr[], int l)
	{
		int flag=0;
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
		
		for(int i=0;i<l;i++)
			
		System.out.println(arr[i]);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of the array you want");
		
		int l = sc.nextInt();
		
		int arr[] = new int[l];
		
		System.out.println("enter the elements");
		
		for(int i=0;i<l;i++)
		{
		arr[i]=sc.nextInt();
		}
		
		
		bubblesort(arr, l);

	}

}
