package com.collectionspractice;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
				
		HashSet <Integer> set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("HashSet 1: "+set1);
		HashSet <Integer> set2=new HashSet<Integer>();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(9);
		set2.add(10);
		System.out.println("HashSet 2: "+set2);
		
		//Union
		//set1.addAll(set2);
		//System.out.println(set1);
		
		
		//Intersection
		//set1.retainAll(set2);
		//System.out.println(set1);
		
		//difference
		//set1.removeAll(set2);
		//System.out.println("Difference : "+set1);
		
		/*
		 * set2.removeAll(set1); System.out.println("Difference : "+set2);
		 */
		
		//Subset
		//set1.containsAll(set2);
		//System.out.println("Subset "+set1);
		System.out.println(set1.containsAll(set2));

	}

}
