package com.functions.n.libraries;

import java.util.ArrayList;
import java.util.Random;

public class random2 {
  
    static ArrayList<Integer> tempList = new ArrayList<Integer>();
    static int count = 0;
    static int size = 6;
    static Random rd = new Random();
    static int randomNum;
//    public static int calcRandom()
//    {
//       
//        
//        int n = rd.nextInt(10);
//        list.add(n);
//        count++;
//        return n;
//    }
    
    public static void display()
    {
        
      System.out.println(tempList);
        
    }
    
    public static ArrayList<Integer> sort()
    {
        for (int i = 0; i < tempList.size(); i++) 
        {
               for (int j = 0; j < tempList.size() - i - 1; j++)
               {
                   if (tempList.get(j) > tempList.get(j + 1)) 
                   {
                      int temp = tempList.get(j);
                      
                      tempList.set(j, tempList.get(j + 1));
                      
                      tempList.set(j + 1, temp);
                   }
               }
           }
        return tempList;
    }

//    public static boolean check(ArrayList<Integer> arrayList, int randomNum)
//    {
//        for(int i=0;i<arrayList.size();i++)
//        {
//            if(arrayList.get(i).equals(randomNum))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
    
    public static void generateRandom()
    {
    	randomNum = rd.nextInt(15);
        System.out.println("Random value=="+randomNum);
        tempList.add(randomNum);
        System.out.println("TempList is :"+tempList);        
        count++;
        System.out.println("TempList size ="+count);
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
      
          
           generateRandom();
         while(count<8)
         {
	       if(tempList.contains(randomNum)||randomNum > 0)
	       {
	            		int newRandom = rd.nextInt(randomNum);	
	            		if(!tempList.contains(newRandom))
	            		{
	            			tempList.add(newRandom);
	            		}
	            		else if(tempList.contains(newRandom))
	            		{
	            			int max = newRandom;
	            			System.out.println("Random Number is repeated :"+newRandom);
	            			int index = tempList.indexOf(newRandom)-1;
	            			int min = index;
	            			int difference = max-min;
	            			System.out.println("Max ="+max);
	            			System.out.println("Min ="+min);
	            			if(difference!=1) 
	            			{
		            			if(max==0 || min==-1)
		            			{
		            				max = tempList.get((tempList.size()-1));
		            				min = tempList.get((tempList.size()-2));
		            				System.out.println("when max 0 :"+max);
		            				System.out.println("when min -1 :"+min);
//		            				newRandom = (int)((Math.random()*(max-min)+min));
//		            				System.out.println("random between range:"+newRandom);
		            			}
		            			else if(min==0)
		            			{
		            				//Swaping min max
		            				min = max ;
		            				max = tempList.get(0);
		            				System.out.println("when min is 0 (max=)"+max);
		            				System.out.println("when min is 0 (min=)"+min);
		            			}
//		            			else 
//		            			{
//		            				min = max;
//		            				max = tempList.get(tempList.size()-1);
//		            				System.out.println("when max-min is 1 (max=)"+max);
//		            				System.out.println("when max-min is 1 (min=)"+min);
//		            			}
	            			}
	            			else 
	            			{
	            				System.out.println("Difference is 1");
	            				max = tempList.get(tempList.size()-1);
	            				min = newRandom;
	            				System.out.println("when diff max ="+max);
	            				System.out.println("when diff min ="+min);
	            			}
	            			newRandom =(int) (Math.random()*(max-min)+min);
	            			System.out.println("Value is ="+newRandom);
	            			if(!tempList.contains(newRandom))
		            		{
		            			tempList.add(newRandom);
		            		}
	            		}
	            		//System.out.println("newRandom"+newRandom);
	            		tempList = sort();
	            		System.out.println("tempList updated element=="+tempList);
	        }
	         count++;   
         } 
           
        }
    
}//class