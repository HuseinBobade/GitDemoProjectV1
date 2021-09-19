package com.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoTextFile {

	public static void main(String[] args) throws IOException {
	
		
		FileWriter fw= new FileWriter("E:\\Husein\\DataWriteFile.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Java file Test1");
		bw.write("Java file Test2");
		bw.write("Java file Test3");
		
		System.out.println("File Writing finished");
		bw.close();

	}

}
