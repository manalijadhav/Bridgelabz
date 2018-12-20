package com.datastructure;

public class Dequeue <T> {
	
	public Node<T> front;
	public Node<T> rear;
	public int length;
	
	public void addToFront(T data)
	{
		//if no element in list
		if(front == null) 
		{
			front.data= data;
			
			rear=front;
		}
		else  //if element in list
		{
			Node <T> temp=null;
			
			temp.data = data;
			
			temp.next = front;
			
			front.prev=temp;
			
			front = temp;
		}
		length++;
	}
	
	
}
