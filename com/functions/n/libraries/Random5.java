package com.functions.n.libraries;

import java.util.ArrayList;
import java.util.Random;

public class Random5 {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static ArrayList<Integer> tempList = new ArrayList<Integer>();
	
	static int count = 0;
	
	public static int calcRandom() {
	
		Random rd = new Random();
		
		int n = rd.nextInt(10);
		
		list.add(n);
		
		count++;
		
		return n;

	}
	
	public static void display()
	{
		
			System.out.println(list);
		
	}
	
	public static ArrayList<Integer> sort()
	{
		for (int i = 0; i < list.size(); i++) 
		{
	           for (int j = 0; j < list.size() - i - 1; j++)
	           {
	               if (list.get(j) > list.get(j + 1)) 
	               {
	                  int temp = list.get(j);

	                  list.set(j, list.get(j + 1));
	                  
	                  list.set(j + 1, temp);
	               }
	           }
	       }
		return list;
	}

	public static boolean check(ArrayList<Integer> arrayList, int randomNum)
	{
		for(int i=0;i < arrayList.size();i++)
		{
			if(arrayList.get(i)==randomNum)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(count < 4)
		{
			int randomNum = calcRandom();
			System.out.println("List element");
			display();
			
			for(int j=0;j<list.size();j++)
			{
				if(j==0)
				{		
					int value =list.get(0);
					tempList.add(value);
					System.out.println("TempList is =="+tempList);
				}
				else if(j==1)
				{
					System.out.println("inside else if");
					if(check(tempList,randomNum)==false)
					{
						System.out.println("inside if");
							tempList.add(randomNum);
							tempList = sort();
							System.out.println("Updated in randomn =="+tempList);
					}
	
				}
				
						 //else
						// {
					//		 System.out.println("Repeated"+randomNum);
						 //}
						//int min=list.get(0);
						//int max = list.
						//int newRandom = Math.random()
					 
					 
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//main
}//class

