package com.unoopen.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		// TODO READ items from a file.
		// Create a class which reads from a file and add the items
		
		// Assume first line of file is header
		// File columns are separated by tab space
		
		// Example:
		// Name	Description	Price
		// Item1	Pen	10
		// Item2	Book 20
		
		ItemReader consoleReader = new ConsoleItemReader();
		
		List<Item> storeItems = consoleReader.read();

		for (Item item : storeItems) {
			System.out.println(item);
		}
	}
}
