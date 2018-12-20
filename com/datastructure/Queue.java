package com.datastructure;

import java.util.NoSuchElementException;

public class Queue<T> {

	public Node<T> front;
	public Node<T> rear;
	public int length;
	
//***************************************************************************
	
	public Queue() {
		
		this.front = null;
		this.rear = null;
		length = 0;
	}
	
//****************************************************************************
	
	public int length() {
		
		return length;
	}
//****************************************************************************
	
	public boolean isEmpty() {
		
		return length ==0;
	}
	
//*****************************************************************************
	
	public void enqueue(T data) {
		
		Node <T> temp = new Node(data);
		
		if(isEmpty()) {
			
			front = temp;
		}
		else {
			
			rear.next = temp;
		}
		rear = temp;
		
		length++;
	}
	
//**********************************************************************************
	
	public T dequeue() {
		
		T result = null;
		
		if(isEmpty()) {
			
			throw new NoSuchElementException("Queue is already empty");
		}
		else {
			
			
			result = front.data;
			
			front = front.next;
			
			if(front == null) {
				
				rear = null;
			}
			length--;
		}
		
	
		return result;	
		
	}
	
//******************************************************************************************
	
	public void show() {
		
		if(isEmpty()) {
			
		return;
		
		}
		else {
			
			Node <T> current = front;
			
			while(current != null) {
				
				System.out.print(current.data + "-->");
				current = current.next;
			}
			
		}
	}
}
