package com.collectionspractice;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedList al=new LinkedList();
		
		al.add("A");
		al.add("B");
		al.add("G");
		al.add("X");
		al.add("Y");
		al.add("T");
		
		System.out.println("First linkedlist elements : "+al);
		
		LinkedList al2=new LinkedList();
		al2.addAll(al);
		System.out.println("Second linkedlist elements : "+al2);
		
		al2.removeAll(al);
		System.out.println("After removing all linkedlist elements : "+al2);
		
		//Sort elements
		System.out.println("linkedlist elements before sorting : "+al);
		
		//Sorting in ascending order
		Collections.sort(al); 		
		System.out.println("linkedlist elements after sorting : "+al);

		//Sorting in descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("linkedlist elements after sorting in reverse order: "+al);
		
		Collections.shuffle(al);
		System.out.println("linkedlist elements after Shuffling order: "+al);
		
		

	}

}
