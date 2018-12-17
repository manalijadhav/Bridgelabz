package com.datastructure;

public class Node <T> {

	T data;
	//T element;
	Node<T> next;
	
	Node(T data){
		
		this.data = data;
	}
	
	Node(T data , Node<T> next){
	
		this.data = data;
		
		this.next = next;
	}
}
