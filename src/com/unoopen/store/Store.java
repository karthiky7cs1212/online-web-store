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
		
		Scanner sc = new Scanner(System.in);

		// get the input for number of Items:
		System.out.println("Enter The number of Items:");
		int noOfItems = Integer.parseInt(sc.nextLine());

		// Reading The Items
		List<Item> list = new ArrayList<Item>();

		for (int i = 0; i < noOfItems; i++) {
			System.out.println("Item Name:");
			String itemName = sc.nextLine();
			System.out.println("Item Description:");
			String description = sc.nextLine();
			System.out.println("Item Price:");
			int price = Integer.parseInt(sc.nextLine());
			Item Item = new Item(itemName, description, price);
			list.add(Item);
		}

		for (Item item : list) {
			System.out.println(item);
		}
	}
}
