package com.functions.n.libraries;
import java.util.*;

import utility.Utility;
public class Calender {

			public static String Day(int d,int m,int y) {
				
				Utility Utility = new Utility();
				
			    int dcal=Utility.date(d,m,y);
			    
			    String days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			    
			    return days[dcal];
			}
			
			public static void main(String args[]) {
			    
				Scanner sc=new Scanner(System.in);
			    
			//	String cal=null;
			    
			    System.out.println("Enter date:");
			    
			    int d=sc.nextInt();
			    
			    int m=sc.nextInt();
			    
			    int y=sc.nextInt();
			    
			    System.out.println("Day is:"+Calender.Day(d,m,y));
			    
			    //System.out.println(days[d0]);
			}
			}



