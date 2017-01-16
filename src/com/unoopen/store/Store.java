package com.unoopen.store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Store {
   
	private static final String FILENAME = "C:\\Users\\scoda\\Desktop\\items.txt";
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		List<Item> list = new ArrayList<Item>();
		try {
			String strLine;
			 br = new BufferedReader(new FileReader(FILENAME));
			 br.readLine();
			 
			while ((strLine = br.readLine()) != null)   {
				String[] arr = strLine.split("\\s+"); //Breaking each line into array of words
				Item item = new Item(arr[0],arr[1],Integer.parseInt(arr[2]));
				list.add(item);
				}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Item item : list) {
			System.out.println(item);
		}
	}
}
