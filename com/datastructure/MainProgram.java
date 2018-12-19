package com.datastructure;

public class MainProgram {

	public static <T> void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		if(list.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");
		
		list.insertAtend(18);
		
		list.show();
		
		list.insertAtend(25);
		
		list.show();
		
		list.insertAtend(55);
		
		list.show();
		
		list.insertAtstart(100);
		
		list.show();
		
		list.insertAtstart(250);
		
		list.show();
		
		list.insertAt(22, 2);
		
		list.show();
		
		list.deleteLast(55);
		
		list.show();
		
		list.deleteFirst(250);
		
		list.show();
		
		list.deleteAt(2);	
		
		list.show();
		
		if(list.find(100)) 
			System.out.println("Given element is present in list");
		
		else 
			System.out.println("Given element is present in list");
		
		list.show();
		
		if(list.containsLoop())
			System.out.println(true);
		else
			System.out.println(false);
		
		if(list.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");
	}
}