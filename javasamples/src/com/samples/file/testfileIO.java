package com.samples.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testfileIO 
{
	public static void main(String[] args) 
	{
		//testout1();
		testout2();
		
		
	}
	private static void testout2()
	{
		try {
			FileOutputStream fos= new FileOutputStream("c:\\Javafsd\\out\\testout.txt");
			String s="Hello World from java program";
			fos.write(s.getBytes());
			fos.close();
			fos.write(65);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testout1() {
		try {
			FileOutputStream fos= new FileOutputStream("c:\\Javafsd\\out\\testout.txt");
			fos.write(65);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
