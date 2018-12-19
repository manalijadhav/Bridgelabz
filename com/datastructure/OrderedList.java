package com.datastructure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OrderedList {
		
		public static void main(String[] args) throws IOException{
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter number to search");
			
			int num = scanner.nextInt();
			
			orderedList(num);
			
			}
		
		public static void orderedList(int number) throws IOException {
			
			String str=" ";
			
			String file = "/home/admin1/Downloads/project-master/src/com/datastructure/ds";
			
			File fileName = new File(file);
			
			Scanner reader = new Scanner(new FileReader(fileName));
		    
		    while (reader.hasNext()){
		    	
		        str = reader.nextLine();
		        
		    }
	}
}


