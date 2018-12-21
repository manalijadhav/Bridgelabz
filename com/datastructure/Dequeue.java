package com.datastructure;

public class Dequeue <T> {
	
	public Node<T> front;
	public Node<T> rear;
	public int length;
//*********************************************************	
	public void addToFront(T data) {
		
		Node<T> temp = new Node<T>(data);
		
		//if no element in list
		if(front == null) {
		
			front = temp;
			
			rear = front;
		}
		else {  //if element in list
		
		//	Node<T> temp = new Node<T>(data);
			
			temp.data = data;
			
			temp.next = front;
			
			front.prev=temp;
			
			front = temp;
		}
		length++;
	}
	
//***************************************************************
	public void addTORear(T data) {
		
		if(front == null) {
			
			Node<T> temp = new Node<T>(data);
			
			front = temp;
			
			rear = front;
		}
		else {
			
			Node<T> temp = new Node<T>(data);
			
			temp.data = data;
			
			rear.next = temp;
			
			temp.prev = rear;
			
			rear = temp;
			
		}
		length++;
		}
//*******************************************************************
	
	public T removeFront() {
		
		T result = null;
		
		if(front == null) {
			
			System.out.println("Queue is empty");
		}
		else {
			
			result = front.data;
			
			front = front.next;
			
			length--;
		}
		return result;
	}
	
//*********************************************************************
	
	public T removeRear() {
		
		T result = null;
		
		if(front == null) {
			
			System.out.println("Queue is Empty");
		}
		else {
			
			 result = rear.data;
			
			rear = rear.prev;
			
			rear.next = null;
			
			length--;
			
			
		}
		return result;
		
	}
	
//************************************************************************
	
	public void show() {
		
		if(isEmpty()) {
			
			return;
		}
		else {
		
		for(Node<T> current = front; current != null; current = current.next) {
			
			System.out.print(current.data + "-->");
			
			
			}
		//System.out.print(current.data);
		System.out.println();
	//	System.out.print("null");
		
		}
		
	}
	
//***********************************************************************
	
		public boolean isEmpty() {
			
			if(length == 0) {
				
				return true;
			}
				
			
			return false;
			
		}
//***************************************************************************
		
		public int size() {
			
			return length;
		}
	
}
