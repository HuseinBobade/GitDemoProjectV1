package com.practice;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : "); 
		String str= sc.nextLine();  // original string
		
		//Approach 1
		/*
		 * String[] words = str.split(" "); //splitting sprint into words
		 * 
		 * String reversestring="";
		 * 
		 * for(String w:words) {
		 * 
		 * String reverseword=""; for(int i=w.length()-1;i>=0;i--) {
		 * 
		 * reverseword=reverseword+w.charAt(i); }
		 * 
		 * reversestring=reversestring+reverseword+" ";
		 * 
		 * }
		 * 
		 * System.out.println("Reversed String is : "+reversestring);
		 */
		
		//Approach 2
		
		String[] words=str.split("\\s");
		
		String reverseword="";
		
		for(String w:words) {
			
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+ sb.toString()+" ";
		}
		 
		System.out.println("Reversed String is : "+reverseword);
		
	}

}
