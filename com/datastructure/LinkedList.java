package com.datastructure;

public class LinkedList<T> {

	//alloting head node
	Node <T> head;
	private Node next;
	
	public void insert(T data) {
		
		Node<T> node = new Node<T>(data);
		
		node.data = data;
		
		node.next = null;
		
		if(head == null) {
			
			head = node;
		}
		else {
	
			Node <T> temp = head;
			
			while(temp.next != null) {
			
				temp = temp.next;
				
			}
			
			temp.next = node;
		}
		
	}
	
	public void insertAtstart(T data) {
		
		Node<T> node = new Node<T>(data);
		
		node.data = data;
		node.next= null;
		node.next=head;
		head = node;
		
	}
	
	public void insertAt(T data , int index) {
		
		Node node = new Node(data, next);
		node.data = data;
		node.next = null;
		Node<T> temp = head;
		if(index ==0) {
			
			insertAtstart(data);
		}
		else {
			
			for(int i=0; i<index-1; i++) {
				
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
			
		}
		
	
	
	
	public void show() {
		
		Node<T> node = head;
		
		while(node.next != null) {
		
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
		
		
		
		
	

}
