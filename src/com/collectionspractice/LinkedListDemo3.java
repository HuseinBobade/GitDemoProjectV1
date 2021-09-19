package com.collectionspractice;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		
		l.add("Dog");
		l.add("Cat");
		l.add("Rat");
		l.add("Lion");
		
		System.out.println(l);
		
		l.addFirst("tiger");
		l.addLast("Fox");
		
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
		
	}

}
