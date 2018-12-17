package com.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UnorderedList {

	public static void main(String[] args)throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> list = (List<String>) new LinkedList();
		
		String file = "/home/admin1/Downloads/project-master/src/com/datastructure/ds";
		
		File filename = new File(file);
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		String line = "" ;
		
		String read = "" ;
		
		String wordArray[] = {};
		
		while((line = br.readLine()) != null){
			
			read += line ;
			 // wordArray = line.split("\\s+");
		}
		
		wordArray = read.split(" ");
		
		for(int i = 0; i < wordArray.length; i++) {	           

			list.add(wordArray[i]);
		}
		
			System.out.println(list);
	}

}
