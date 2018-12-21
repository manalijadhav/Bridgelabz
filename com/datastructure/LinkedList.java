package com.datastructure;

public class LinkedList<T> {

	//alloting head node and next
	Node <T> head;
	
	private Node next;
	
	private int count =0;
	
	private T count1;
//*************************INSERT ELEMENT AT END******************************
	
	public void insertAtend(T data) {
		
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
				count++;
				
			}
			
			temp.next = node;
		}
		
	}
//********************************INSERT ELEMENT AT START******************************************	
	public void insertAtstart(T data) {
		
		Node<T> node = new Node<T>(data);
		
		node.data = data;
		node.next= null;
		node.next=head;
		head = node;
		count++;
		
	}
//*********************************INSERT AT GIVEN POSITION******************************************	
	public void insertAt(T data , int index) {
		
		Node node = new Node(data);
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
			count++;
		}
			
		}
//***********************************DELETE LAST ELEMENT*********************************************		
	public Node<T> deleteLast(T data) {
		
		Node <T> temp = head;
		Node <T> previousTotemp = null;
		while(temp.next != null) {
			
			previousTotemp = temp;
			temp = temp.next;
		}
		previousTotemp.next = null;
		count--;
		
		return previousTotemp;
		
	}
//*****************************************DELETE FIRST ELEMENT********************************************************
	public void deleteFirst(T data) {
	
		if(head == null) {
			
			return;
		}
		
		else {
			
		Node<T> temp = head;
		
		 head = head.next;
		
		temp.next = null;
		count--;
	}
	
	}
//************************************************DELETE ELEMENT AT GIVEN POSITION******************************************************************
	public void deleteAt(int index) {
		int count = 0;
	
		if(index ==0) {
			head = head.next;
			return;
			
		}
		Node<T> temp = head;
		
		
		while(count < index-1) {
			
			temp = temp.next;
			count++;
		}
		
		Node<T> current = temp.next;
		temp.next = current.next;
		current.next = null;
		count--;
	}
	
	
//******************************************************TO FIND ELEMENT IN LIST***************************************************************
	
	public boolean search (T searchkey) {
		
		if(head == null) {
			
			return false;
		}
		else {
			
			Node<T> temp = head;
			
			while(temp != null) {
				
				if((temp.data).equals(searchkey)) {
					return true;
				}
				else {
					
					temp = temp.next;

				}
				
			}
		}
		return false;
	}
	
	
//*******************************************************************************************
	
	public int index(T data) {
		
		
		Node<T> temp = head;
		
		for(int i=0; i<count; i++) {
			
			if(temp.data.equals(data)) {
				
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}
//*******************************************To Detect a Loop***************************************
	public boolean containsLoop() {
		
		Node<T> fastptr = head;
		
		Node<T> slwptr = head;
		
		while(fastptr != null && fastptr.next != null) {
			
			fastptr = fastptr.next.next;
			
			slwptr = slwptr.next;
			
			if(slwptr == fastptr) {
				
				return true;
			}
		}
		return false;
	}
	
	public void createloop() {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node3;
		containsLoop();
	}
	

//*********************************TO CHECK IF LIST IS EMPTY**************************************
	
	public boolean isEmpty() {
		
		if(count == 0) {
			
			return true;
		}
			
		
		return false;
		
	}
	public int size() {
		
		return count;
	}
	
//******************************************DISPLAY METHOD*********************************************
	public void show() {
		
		Node<T> node = head;
		
		while(node.next != null) {
		
			System.out.print(node.data + "-->");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}
		
//*******************************************POP***********************************************************	
		
	public T pop(int index)
    {
        if(index==0)
        {
        	head = head.next;
           // T firstData=head.data;
            count--;
            //return firstData;
        }else {
        	Node<T> temp=head;
        	
        for(int i=0; i<index-1; i++)
        {
            temp=temp.next;
        }
        T dataOfIndex=temp.next.data;
        
        temp.next=temp.next.next;
        
        count--;
        
        return dataOfIndex;

        }
		return count1;
		
    }
    
//******************************************SORTING OF LINKED LIST**************************************************
	
	public void sort(T newData ) {
		Node<T> newnode = new Node<T>(newData);
		if( (head == null ) || (head.data.toString().compareTo(newnode.data.toString())>=0)) {
			
			newnode.next = head;			
			head = newnode;			
		}
		else {
	
			Node<T> temp = head;
		
			while( (temp.next != null && temp.next.data.toString().compareTo(newnode.data.toString())<0)) {			
				temp = temp.next;
			}			
			newnode.next = temp.next;		
			temp.next = newnode;	
	}
	}
//*********************************************************************************************
	public T getdata(int index){
		
		if(index == 0) {
			return head.data;
		}
		else {
			Node<T> temp = head;
			for(int i=0; i<index-1;i++ ) {
				temp = temp.next;
				
			}
			return temp.data;
		}
	}


}