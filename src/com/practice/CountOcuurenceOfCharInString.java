package com.practice;

import java.util.Scanner;

public class CountOcuurenceOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_length;
		int total_length_afterCharRemove; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str= sc.nextLine();
		total_length=str.length();
		System.out.println("Entered string is : "+str);
		total_length_afterCharRemove=str.replace("a","").length();		
		System.out.println("Number of Occurences is: "+(total_length-total_length_afterCharRemove));
		
			
		
		
	}

}
