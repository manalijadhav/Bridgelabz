package com.datastructure;

public class MainDequeue {

	public static <T> void main(String[] args) {
		
		Dequeue<Integer> dqueue = new Dequeue<Integer>();
		
		if(dqueue.isEmpty()) {
			
			System.out.println("Queue is Empty");
		}
		else {
			
			System.out.println("Dqueue length is: "+ dqueue.size());
		}
		
		dqueue.addToFront(236);
		dqueue.show();
		dqueue.addTORear(52);
		dqueue.show();
		dqueue.addToFront(5632);
		dqueue.show();
		dqueue.addToFront(896);
		dqueue.show();
		dqueue.addToFront(213);
		dqueue.show();
		dqueue.removeFront();
		dqueue.show();
		dqueue.removeFront();
		dqueue.show();
		dqueue.removeRear();
		dqueue.show();
	}

}
