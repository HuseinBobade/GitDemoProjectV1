package com.collectionspractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList();
		
		ll.add(100);
		ll.add("Selenium");
		ll.add(15.5);
		ll.add('A');
		ll.add(true);
		
		System.out.println(ll);
		
		//size();
		
				System.out.println("Number of Elements in linkedlist are: "+ll.size());
				
				//remove
				
				ll.remove(1);
				ll.remove("Selenium");
				//ll.remove('100');
				
				System.out.println("After removing elements in linkedlist are: "+ll.size());
				System.out.println(ll);
				
				//insert data at specific location 
				ll.add(1, "Java");
				System.out.println(ll);
				
				//retrieve specific element
				ll.get(4);
				System.out.println(ll.get(4)); // 4 is index of element
				
				//change/replace the existing vllue of element
				ll.set(0,200);
				System.out.println(ll);
				
				//searching element in linkedlist
				ll.contains('A');
				System.out.println(ll.contains('A'));
				System.out.println(ll.contains("C#"));
				
				//isEmpty tocheck if linkedlist is empty
				ll.isEmpty();
				System.out.println(ll.isEmpty());
				
				//reading lll data from linkedlist
				//approch 1 using for loop
				
				System.out.println("Reading Elements using for loop: ");
				for(int i=0; i<ll.size();i++) {
					
					System.out.println(ll.get(i));
				}
				
				//approch 2 using foreach or advance for loop
				
				System.out.println("Reading Elements using for..each loop: ");
				for(Object e:ll) {
					System.out.println(e);
				}
				
				//approch 3 using iterator
				System.out.println("Reading Elements using iterator: ");
				
				Iterator it=ll.iterator();
				while(it.hasNext()) {
					
					System.out.println(it.next());
				}
				
				
		
	}

}
