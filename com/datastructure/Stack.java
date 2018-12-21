package com.datastructure;

import java.util.EmptyStackException;

public class Stack<T> {

	public Node<T> top;
	public int length;
	
//****************************************************************
	public void stack() {
		top = null;
		length =0;
	}
	
//*****************************************************************
	public int length() {
		return length;
	}
	
//*******************************************************************
	public boolean isEmpty() {
		
		return length ==0;
	}
	
//**********************************************************************
	
	public void push(T data) {
		
		Node<T> temp = new Node<T>(data);
			
		temp.next = top;
		
		top = temp;
		
		length++;
		
		}
	//}
	
//***************************************************************************
	
	public T pop() {
		
		if(isEmpty()) {
			
			throw new EmptyStackException();
		}
		else {
			
		T result = top.data;
		
		top = top.next;
		
		length--;
		
		return result;
		
		}
	}
//****************************************************************************
	
	public T peek() {

		if(isEmpty()) {
			
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
//*****************************************************************************
	
	
	public void show() {
		
		if(isEmpty()) {
			
			return;
			
			}
			else {
				Node<T> node = top;
				while(node.next!=null)
				{
					System.out.print(node.data+ " --> ");
					node = node.next;
				}
		System.out.println(node.data);
	}
	}
}
