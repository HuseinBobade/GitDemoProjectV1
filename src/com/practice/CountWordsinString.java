package com.practice;

import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str= sc.nextLine();
		
		//Java selenium program
		
		int count=1;
		//int org_count=count;
		
		for(int i=0; i<str.length()-1;i++) {
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Number of words in string are: "+count);
		
		
	}

}
