package com.datastructure;

public class MainProgram {

	public static <T> void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(18);
		
		list.insert(25);
		
		list.insert(55);
		
		list.insertAtstart(100);
		
		list.insertAtstart(250);
		
		list.insertAt(22, 2);
		
		list.show();
	}
}
